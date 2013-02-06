package com.sysfera.codegen.docbook.astah.test;

import java.awt.geom.Point2D;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.change_vision.jude.api.inf.exception.InvalidUsingException;
import com.change_vision.jude.api.inf.exception.LicenseNotFoundException;
import com.change_vision.jude.api.inf.exception.NonCompatibleException;
import com.change_vision.jude.api.inf.exception.ProjectLockedException;
import com.change_vision.jude.api.inf.exception.ProjectNotFoundException;
import com.change_vision.jude.api.inf.model.IAssociation;
import com.change_vision.jude.api.inf.model.IAttribute;
import com.change_vision.jude.api.inf.model.IClass;
import com.change_vision.jude.api.inf.model.IComment;
import com.change_vision.jude.api.inf.model.IDiagram;
import com.change_vision.jude.api.inf.model.IExtend;
import com.change_vision.jude.api.inf.model.IModel;
import com.change_vision.jude.api.inf.model.INamedElement;
import com.change_vision.jude.api.inf.model.IRequirement;
import com.change_vision.jude.api.inf.model.ITaggedValue;
import com.change_vision.jude.api.inf.model.IUseCase;
import com.change_vision.jude.api.inf.presentation.IHeaderCell;
import com.change_vision.jude.api.inf.presentation.ILinkPresentation;
import com.change_vision.jude.api.inf.presentation.INodePresentation;
import com.change_vision.jude.api.inf.presentation.IPresentation;
import com.change_vision.jude.api.inf.presentation.IValueCell;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;
import com.sysfera.codegen.docbook.astah.GenDocBookUtils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.kermeta.Docbook.*;
import org.kermeta.Docbook.impl.DocbookFactoryImpl;

/**
 * Sample source codes for obtaining presentation information of JUDE models. 
 * Output location, width, and height etc in console.
 */
public class APIForReadingDgmModelsSample {
	
	//installer
//	private static final String PROJECT_PATH = "./SampleModel.asta";
	private static final String PROJECT_PATH = "/home/bisnard/SYSFERA/EDF/doc/UMS_V2.asta";
//	private static final String OUTPUT_PATH = "/home/bisnard/SYSFERA/EDF/doc/UMS_export.xml";
	//eclipse
	//private static final String PROJECT_PATH = "api_sample\\simpleDgmRead\\SampleModel.asta";
	
    public static void main(String[] args) {
    	
    	// Create book / chapter
    	DocbookFactory factory = new DocbookFactoryImpl();
        BookType book = factory.createBookType();
        ChapterType chapter = factory.createChapterType();
        book.getChapter().add(chapter);
        // Title
        TitleType title = factory.createTitleType();
        FeatureMapUtil.addText(title.getMixed(), "Spécifications générales\n");
        chapter.setTitle(title);
        // section
        SectionType section = factory.createSectionType();
        chapter.getSection().add(section);
        section.setCaution("ATTENTION DANGER!");
        // table
        TableType table = factory.createTableType();
        section.getTable().add(table);
        TgroupType tgroup = factory.createTgroupType();
        tgroup.setCols(BigInteger.valueOf(2));
        table.setTgroup(tgroup);
        TbodyType tbody = factory.createTbodyType();
        tgroup.setTbody(tbody);
        // row
        RowType row = factory.createRowType();
        tbody.getRow().add(row);
     
    	
        try {
            System.out.println("Opening project...");

            ProjectAccessor prjAccessor = ProjectAccessorFactory.getProjectAccessor();

            // open project
            prjAccessor.open(PROJECT_PATH, true, false, true);

            System.out.println("Printing the elements...");

            // get root model
            IModel project = prjAccessor.getProject();
            
            // DIAGRAMS
            IDiagram[] diagrams = project.getDiagrams();
            
//            for (int i = 0; i < diagrams.length; i++) {
//            	//get diagram's presentation information
//            	printDiagramInfo(diagrams[i]);
//			}
            
            // USE CASES
            INamedElement[] useCases = prjAccessor.findElements(IUseCase.class);
            for (int i=0; i< useCases.length; i++) {
            	IUseCase currUC = (IUseCase) useCases[i];
            	if (currUC.getName().contains("UA2"))
            		printUseCaseInformation(currUC);
            }
            
//            // ASSOCIATIONS
//            INamedElement[] associations = prjAccessor.findElements(IAssociation.class);
//            for (INamedElement assoc : associations) {
//            	printAssocInfo((IAssociation) assoc);
//            }
            
            // REQUIREMENTS 1
//            INamedElement[] reqs = prjAccessor.findElements(IRequirement.class);
//            Map<String,IRequirement> reqMap = new TreeMap<String, IRequirement>();
//        	// put the elements in a treemap to sort them
//        	for (INamedElement element : reqs) {
//        		IRequirement iReq = (IRequirement) element;
//        		reqMap.put(iReq.getRequirementID(), iReq);
//        	}
//            for (Map.Entry<String, IRequirement> entry : reqMap.entrySet()) {
//            	IRequirement iReq = entry.getValue();
//            	System.out.println("Req: " + entry.getKey() + " " + iReq.getName());
//            	IClass[] subClasses = iReq.getNestedClasses();
//            	if (subClasses.length > 0) System.out.println(subClasses.length + " sub-classe(s)");
//            }
          
            // closes project
            prjAccessor.close();

            System.out.println("Finished project scan");

        } catch (LicenseNotFoundException e) {
            e.printStackTrace();
        } catch (ProjectNotFoundException e) {
            e.printStackTrace();
        } catch (ProjectLockedException e) {
            e.printStackTrace();
        } catch (NonCompatibleException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidUsingException e) {
        	e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        
        
//        Resource resource = new XMLResourceImpl();
//        resource.getContents().add(book);
//        try {
//        	resource.save(System.out, null);
//        } catch (IOException e) {
//        	e.printStackTrace();
//        }
    }
    
    private static void printAssocInfo(IAssociation iAssoc) {
    	IAttribute[] attrs = iAssoc.getMemberEnds();
    	if ((attrs[0].getType() instanceof IUseCase) || (attrs[1].getType() instanceof IUseCase)) {
    		StringBuffer assocInfo = new StringBuffer("[Association] ");
    		for (IAttribute attr: attrs) {
    			assocInfo.append(attr.getTypeExpression()+ " ");
    			String[] st = attr.getType().getStereotypes();
    			for (String s : st) {
    				assocInfo.append(s + ",");
    			}
    			assocInfo.append(" / ");
    		}
    		System.out.println(assocInfo.toString());
    	}
    }
    
    private static void printExtensionInfo(IExtend iExtend) throws InvalidUsingException {
    	StringBuffer extInfo = new StringBuffer("[Extend] name=");
    	extInfo.append(iExtend.getName());
    	System.out.println(extInfo.toString());
    }
    
    private static void printElementInfo(INamedElement iElement) throws InvalidUsingException {
    	StringBuffer eltInfo = new StringBuffer("[Element] name=");
    	eltInfo.append(iElement.getName());
    	eltInfo.append(" definition=");
    	eltInfo.append(iElement.getDefinition());
    	System.out.println(eltInfo.toString());
    }
    
    private static void printUseCaseInformation(IUseCase iUseCase)  throws InvalidUsingException {
    	
    	// TAGGED VALUES
    	ITaggedValue[] taggedValues = iUseCase.getTaggedValues();
    	Map<String,String> tagMap = new HashMap<String, String>();
    	for (ITaggedValue tag : taggedValues) {
    		tagMap.put(tag.getKey(), tag.getValue());
    	}
    	
    	StringBuffer ucInfo = new StringBuffer("\n________[Use Case Description]________");
    	ucInfo.append("\n ## Title : \n");
    	ucInfo.append(iUseCase.getName());
    	
    	ucInfo.append("\n ## Actors : \n");
    	IAttribute[] attrs = iUseCase.getAttributes();
		for (IAttribute attr: attrs) {
			ucInfo.append(attr.getType() + " ");
//			String st[] = attr.getType().getStereotypes();
			// check that the IClass attached to the Association End has the 'actor' stereotype
//			if (st.length > 0) {
//				ucInfo.append("stereotypes:");
//				for (String s : st) {
//					ucInfo.append(s);
//					if (s.equals("actor")) ucInfo.append("ok");
//				}
//			}
			if (GenDocBookUtils.isActor(attr.getType())) {
				ucInfo.append("ok");
			}
			List<String> actorsList = new LinkedList<String>();
			

		}
    	ucInfo.append("\n ## Summary : \n");
    	ucInfo.append(tagMap.get("uc.description.summary"));
    	ucInfo.append("\n ## Precondition : \n");
    	ucInfo.append(tagMap.get("uc.description.precondition"));
    	ucInfo.append("\n ## Postcondition : \n");
    	ucInfo.append(tagMap.get("uc.description.postcondition"));
    	ucInfo.append("\n ## Base sequence : \n");
    	ucInfo.append(tagMap.get("uc.description.base_sequence"));
    	ucInfo.append("\n ## Branch sequence : \n");
    	ucInfo.append(tagMap.get("uc.description.branch_sequence"));
    	ucInfo.append("\n ## Exception sequence : \n");
    	ucInfo.append(tagMap.get("uc.description.exception_sequence"));
    	ucInfo.append("\n ## Note : \n");
    	ucInfo.append(tagMap.get("uc.description.note"));
    	
    	// EXTENDS (from the extension)
    	IExtend[] exts = iUseCase.getExtends();
    	if (exts.length > 0) {
    		ucInfo.append("\n ## Extension of: \n");
    		for (IExtend ext : exts) {
    			ucInfo.append(ext.getExtendedCase().getName());
    			ucInfo.append(",");
    		}
    	}
    	
    	// EXTENDS (from the extended UC)
    	IExtend[] exts2 = iUseCase.getExtendedCaseInvs();
    	if (exts2.length > 0) {
    		ucInfo.append("\n ## Extensions: \n");
    		for (IExtend ext : exts2) {
    			ucInfo.append(ext.getExtension().getName());
    			ucInfo.append(",");
    		}
    	}
    	
    	System.out.println(ucInfo.toString());
    	
    }

    private static void printDiagramInfo(IDiagram iDiagram) throws InvalidUsingException {
    	IPresentation[] presentations = iDiagram.getPresentations();
    	
    	StringBuffer dgmInfo = new StringBuffer("[Diagram] name=");
        dgmInfo.append(iDiagram.getName());
        dgmInfo.append(" definition=");
        dgmInfo.append(iDiagram.getDefinition());
        dgmInfo.append(" presentation's number=");
        dgmInfo.append(presentations.length);
        System.out.println(dgmInfo.toString());
        
//        for (int i = 0; i < presentations.length; i++) {
//        	IPresentation p = presentations[i];
//        	// presentation information
//            if (p instanceof INodePresentation) {
//                printNodePresentationInfo((INodePresentation)p);
//            } else if (p instanceof ILinkPresentation) {
//            	printLinkPresentationInfo((ILinkPresentation)p);
//            } else if (p instanceof IHeaderCell) {
//            	printHeaderCellInfo((IHeaderCell)p);
//            } else if (p instanceof IValueCell) {
//            	printValueCellInfo((IValueCell)p);
//            }
//        }
    }

	private static void printNodePresentationInfo(INodePresentation p) {
		StringBuffer presentationInfo = new StringBuffer("  [NodePresentation] model=");
		presentationInfo.append(p.getModel());
        presentationInfo.append(" label=");
        presentationInfo.append(p.getLabel());
        presentationInfo.append(" type=");
        presentationInfo.append(p.getType());
        INodePresentation[] parents = p.getParents();
        for (int i = 0; i < parents.length; i++) {
            presentationInfo.append(" parents[");
            presentationInfo.append(i);
            presentationInfo.append("]=");
            presentationInfo.append(parents[i].getLabel());
		}
        INodePresentation[] children = p.getChildren();
        for (int i = 0; i < children.length; i++) {
            presentationInfo.append(" children[");
            presentationInfo.append(i);
            presentationInfo.append("]=");
            presentationInfo.append(children[i].getLabel());
		}
        ILinkPresentation[] links = p.getLinks();
        for (int i = 0; i < links.length; i++) {
            presentationInfo.append(" links[");
            presentationInfo.append(i);
            presentationInfo.append("]=");
            presentationInfo.append(links[i].getLabel());
		}
        presentationInfo.append(" location=");
        presentationInfo.append(p.getLocation());
        presentationInfo.append(" width=");
        presentationInfo.append(p.getWidth());
        presentationInfo.append(" height=");
        presentationInfo.append(p.getHeight());
        presentationInfo.append(" color=");
        presentationInfo.append(p.getProperty("fill.color"));
        System.out.println(presentationInfo.toString());
	}

	private static void printLinkPresentationInfo(ILinkPresentation p) {
		StringBuffer presentationInfo = new StringBuffer("  [LinkPresentation] model=");
		presentationInfo.append(p.getModel());
        presentationInfo.append(" label=");
        presentationInfo.append(p.getLabel());
        presentationInfo.append(" type=");
        presentationInfo.append(p.getType());
        presentationInfo.append(" source=");
        presentationInfo.append(p.getSource().getLabel());
        presentationInfo.append(" target=");
        presentationInfo.append(p.getTarget().getLabel());
        Point2D[] points = p.getPoints();
        for (int i = 0; i < points.length; i++) {
            presentationInfo.append(" points[");
            presentationInfo.append(i);
            presentationInfo.append("]=");
            presentationInfo.append(points[i]);
		}
        presentationInfo.append(" color=");
        presentationInfo.append(p.getProperty("line.color"));
        System.out.println(presentationInfo.toString());
	}

	private static void printHeaderCellInfo(IHeaderCell p) {
		StringBuffer presentationInfo = new StringBuffer("  [HeaderCell] model=");
		presentationInfo.append(p.getModel());
        presentationInfo.append(" label=");
        presentationInfo.append(p.getLabel());
        presentationInfo.append(" type=");
        presentationInfo.append(p.getType());
        presentationInfo.append(" visible=");
        presentationInfo.append(p.isVisible());
        presentationInfo.append(" total=");
        presentationInfo.append(p.isTotal());
        System.out.println(presentationInfo.toString());
	}
    
	private static void printValueCellInfo(IValueCell p) {
		StringBuffer presentationInfo = new StringBuffer("  [ValueCell] model=");
		presentationInfo.append(p.getModel());
        presentationInfo.append(" label=");
        presentationInfo.append(p.getLabel());
        presentationInfo.append(" type=");
        presentationInfo.append(p.getType());
        presentationInfo.append(" color=");
        String color = p.getProperty("fill.color");
        if (!color.startsWith("#")) {
        	IDiagram diagram = p.getDiagram();
        	color = diagram.getProperty("matrix.automatic_cell.color");
        }
        if (color.startsWith("#")) {
        	presentationInfo.append(color);
        }
        System.out.println(presentationInfo.toString());
	}
}
