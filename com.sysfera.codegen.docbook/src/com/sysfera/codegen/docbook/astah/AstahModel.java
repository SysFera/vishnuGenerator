package com.sysfera.codegen.docbook.astah;

import java.io.IOException;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ReferenceType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TitleType;

import com.change_vision.jude.api.inf.exception.LicenseNotFoundException;
import com.change_vision.jude.api.inf.exception.NonCompatibleException;
import com.change_vision.jude.api.inf.exception.ProjectLockedException;
import com.change_vision.jude.api.inf.exception.ProjectNotFoundException;
import com.change_vision.jude.api.inf.model.IClassDiagram;
import com.change_vision.jude.api.inf.model.IDiagram;
import com.change_vision.jude.api.inf.model.IMindMapDiagram;
import com.change_vision.jude.api.inf.model.INamedElement;
import com.change_vision.jude.api.inf.model.IRequirement;
import com.change_vision.jude.api.inf.model.IUseCase;
import com.change_vision.jude.api.inf.model.IUseCaseDiagram;
import com.change_vision.jude.api.inf.presentation.INodePresentation;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;
import com.sysfera.codegen.docbook.utils.GenericModel;

public class AstahModel implements GenericModel {
	
	private String				filePath;
	private ProjectAccessor 	prjAccessor;
	private DocbookFactory		factory;
	
	public final String ASTAH_TAG_DIAGRAM_ORDER = "order";
	public final String ASTAH_TAG_DIAGRAM_DESCR = "description";
	public final String ASTAH_TAG_DIAGRAM_GROUP = "group";
	
	public AstahModel() {
		factory = DocbookFactory.eINSTANCE;
	}
	
	public void load(String modelFilePath) {
		filePath = modelFilePath;
		try {
            System.out.println("Opening Astah project : " + filePath);
            prjAccessor = ProjectAccessorFactory.getProjectAccessor();
            prjAccessor.open(filePath, true, false, true);
		} catch (LicenseNotFoundException e) {
            e.printStackTrace();
        } catch (ProjectNotFoundException e) {
            e.printStackTrace();
        } catch (ProjectLockedException e) {
            e.printStackTrace();
        } catch (NonCompatibleException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	public void listDiagrams() {
		try {
			INamedElement[] diagramSet = prjAccessor.findElements(IDiagram.class);
			for (INamedElement elt : diagramSet) {
				System.out.println("Diagram : " + elt.getName());
			}
		} catch (ProjectNotFoundException e) {
			e.printStackTrace();
		}
	}

	public SectionType generateSection(String srcRef) {
		SectionType section = null;
		try {
			if (srcRef.equals("UCDESC")) {
				section = generateSection_UCDESC();
			} else if (srcRef.equals("UCDIAG")) {
				section = generateSectionDiagrams(IUseCaseDiagram.class, "Use case diagrams\n", null);
			} else if (srcRef.startsWith("REQS")) {
				section = generateSection_REQS(srcRef);
			} else if (srcRef.startsWith("DICT")) {
				section = generateSection_DICT(srcRef);
			} else if (srcRef.startsWith("CLASSDIAG")) {
				section = generateSectionDiagrams(IClassDiagram.class, "Class diagrams", extractRefParam(srcRef));
			} else if (srcRef.startsWith("ARCHIDIAG")) {
				section = generateSectionDiagrams(IDiagram.class, "Architecture diagrams", extractRefParam(srcRef));
			} else {
				System.err.println("ERROR: unknown section code used in the annotation");
				System.exit(0);
			}
		} catch (ProjectNotFoundException e) {
			e.printStackTrace();
		}
		return section;
	}
	
	private String extractRefParam(String ref) {
		String param = null;
		if (ref.endsWith(")") && ref.contains("(")) {
			param = ref.substring(ref.indexOf("(")+1, ref.length()-1);
		}
		return param;
	}
	
	private SectionType generateSection_UCDESC() throws ProjectNotFoundException {

		SectionType section = factory.createSectionType();
		
		// Title
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), "Use case descriptions\n");
		section.getTitle().add(secTitle);

		INamedElement[] useCases = prjAccessor.findElements(IUseCase.class);
		Map<String,IUseCase> ucMap = new TreeMap<String, IUseCase>();
		// put the elements in a tree map to sort them
		for (INamedElement element : useCases) {
			ucMap.put(convertNameToKey(element.getName()), (IUseCase) element);
		}
		// print each element in its own section
		UseCaseDocBookPrinter printer = new UseCaseDocBookPrinter(factory);
		for (Map.Entry<String,IUseCase> entry : ucMap.entrySet()) {
			// sub-section creation
			SectionType ucSection = factory.createSectionType();
			section.getSection().add(ucSection);
			TitleType ucSectionTitle = factory.createTitleType();
			FeatureMapUtil.addText(ucSectionTitle.getMixed(), ((IUseCase) entry.getValue()).getName());
			ucSection.getTitle().add(ucSectionTitle);
			// table for the use case
			ucSection.getInformaltable().add(printer.printTable((IUseCase) entry.getValue()));
		}
		
		return section;
	}
	
	// FIXME does not work!!
	private String convertNameToKey(String name) {
		System.out.println("CONVERT IN : " + name);
		Pattern p = Pattern.compile("\\D\\d\\D");
		Matcher m = p.matcher(name);
		String key = name;
		while (m.find()) {
			int start = m.start();
			int end = m.end();
			System.out.println("MATCH=" + key.substring(start, end));
			System.out.println("start=" + start + "end=" + end);
			key = key.substring(0, start+1) + "0" + key.charAt(start+1) + key.substring(end-1, key.length());
		}
		System.out.println("CONVERT OUT: " + key);
		return name;
	}
	
	/**
	 * Generates a section containing one subsection for each diagram of a given class
	 * (Use case diagrams, class diagrams, etc...)
	 * @param diagClass		the class of diagrams
	 * @param title			the title of the main section
	 * @param groupFilter	selects only diagrams that have the 'group' tag set to this value (optional)
	 * @return
	 * @throws ProjectNotFoundException
	 */
	private SectionType generateSectionDiagrams(Class diagClass, String title, String groupFilter) 
	throws ProjectNotFoundException {
        
		SectionType section = factory.createSectionType();

		// Title
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), title);
		section.getTitle().add(secTitle);

		INamedElement[] 		diagramSet = prjAccessor.findElements(diagClass);
		Map<String,IDiagram> 	diagramOrderedMap = new TreeMap<String, IDiagram>();
		// put the elements in a tree map to sort them
		for (INamedElement element : diagramSet) {
			// Use a tag to order the diagrams
			String order = element.getTaggedValue(ASTAH_TAG_DIAGRAM_ORDER);
			String group = element.getTaggedValue(ASTAH_TAG_DIAGRAM_GROUP);
			// Use the group to filter the diagrams
			if (groupFilter != null) {
				if ((group == null) || (group.equals(""))) {
					System.err.println("WARNING: diagram '" + element.getName() + "' has no '"+ ASTAH_TAG_DIAGRAM_GROUP +"' tag");
				}
				if (!group.equals(groupFilter))
					continue;
			}
			if ((order == null) || (order.equals(""))) {
				order = "default";
				System.err.println("WARNING: diagram '" + element.getName() + "' has no '"+ ASTAH_TAG_DIAGRAM_ORDER +"' tag");
			}
			diagramOrderedMap.put(order, (IDiagram) element);
		}
		for (Map.Entry<String,IDiagram> entry : diagramOrderedMap.entrySet()) {
			
			// Create a new sub-section with the diagram name as title
			SectionType diagSection = factory.createSectionType();
			section.getSection().add(diagSection);
			TitleType diagSectionTitle = factory.createTitleType();
			String s = entry.getValue().getName().replace('_', ' ');
			FeatureMapUtil.addText(diagSectionTitle.getMixed(), s);
			diagSection.getTitle().add(diagSectionTitle);
			
			// Add a description paragraph if the corresponding tag is defined
			String descr = entry.getValue().getTaggedValue(ASTAH_TAG_DIAGRAM_DESCR);
			if ((descr != null) && (!descr.equals(""))) {
				ParaType descPara = factory.createParaType();
				diagSection.getPara().add(descPara);
				FeatureMapUtil.addText(descPara.getMixed(), descr);
			}

			//Tag Image creation
			FigureType diagFigure = factory.createFigureType();
			String path = "images/png/"+entry.getValue().getName()+".png";
			String legend = s;
			GenDocBookUtils.insertFigure(factory, diagFigure, path, legend, "center", "40");
			diagSection.getFigure().add(diagFigure);
		}
		
		return section;
	}
    
	private SectionType generateSection_REQS(String srcRef) throws ProjectNotFoundException {

		SectionType section = factory.createSectionType();

		// Title
		String title = "Requirements";
		try {
			title = srcRef.substring(srcRef.indexOf('[')+1, srcRef.indexOf(']'));
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), title);
		section.getTitle().add(secTitle);

		INamedElement[] elements = prjAccessor.findElements(IRequirement.class);
		RequirementsDocBookPrinter printer = new RequirementsDocBookPrinter(factory);

		section.getInformaltable().add(printer.printTable(elements));
		
		return section;
	}
	
	private SectionType generateSection_DICT(String srcRef) throws ProjectNotFoundException {
		
		SectionType section = factory.createSectionType();
		
		// Title
		String title = "Data dictionary";
		try {
			title = srcRef.substring(srcRef.indexOf('[')+1, srcRef.indexOf(']'));
		} catch (StringIndexOutOfBoundsException e) {
			
		}
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), title);
		section.getTitle().add(secTitle);
		
		// Get Mindmap diagram
		String mmRef = srcRef.substring(srcRef.indexOf('(')+1, srcRef.indexOf(')'));
		String mmName = mmRef.substring(0, mmRef.indexOf('/'));
		String mmTopic = mmRef.substring(mmRef.indexOf('/')+1, mmRef.length());
		INamedElement[] elements = prjAccessor.findElements(IMindMapDiagram.class, mmName);
		if (elements.length == 1) {
			IMindMapDiagram mm = (IMindMapDiagram) elements[0];
			INodePresentation root = mm.getRoot();
			INodePresentation[] childs1 = root.getChildren();
			
			// Select the root topic of the dictionary
			boolean found = false;
			for (INodePresentation child1 : childs1) {
				if (child1.getLabel().equals(mmTopic)) {
					DataDictionaryDocBookPrinter printer = new DataDictionaryDocBookPrinter(factory);
					section.getPara().add(printer.print(child1));
					found = true;
				}
			}
			if (!found) {
				System.err.println("Could not find topic '" + mmTopic + "' in mindmap '" + mmName + "'");
			}
		} else {
			System.err.println("Mindmap with name '" + mmName + "' not found or multiple match");
		}
		return section;
	}

	@Override
	public ReferenceType generateReference(String srcRef) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
