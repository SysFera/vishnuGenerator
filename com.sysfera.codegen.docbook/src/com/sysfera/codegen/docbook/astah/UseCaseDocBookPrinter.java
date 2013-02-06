package com.sysfera.codegen.docbook.astah;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;

import com.change_vision.jude.api.inf.exception.InvalidUsingException;
import com.change_vision.jude.api.inf.model.IAttribute;
import com.change_vision.jude.api.inf.model.IExtend;
import com.change_vision.jude.api.inf.model.ITaggedValue;
import com.change_vision.jude.api.inf.model.IUseCase;

public class UseCaseDocBookPrinter {
	
	private DocbookFactory factory;
	
	public UseCaseDocBookPrinter(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}
	
	private void addRow(TbodyType body, String left, String right) {
		
        RowType row = factory.createRowType();
        body.getRow().add(row);
        // LEFT
        EntryType entry = factory.createEntryType();
        row.getEntry().add(entry);
        GenDocBookUtils.insertText(factory, entry, left);
        // RIGHT
        EntryType entry2 = factory.createEntryType();
        row.getEntry().add(entry2);
        GenDocBookUtils.insertText(factory, entry2, right);
	}
	
	private String printActors(IUseCase iUseCase) {
		List<String> actorsList = new LinkedList<String>();
		IAttribute[] attrs = iUseCase.getAttributes();
		for (IAttribute attr: attrs) {
			if (GenDocBookUtils.isActor(attr.getType())) {
				actorsList.add(attr.getType().toString());
			}
		}
		return GenDocBookUtils.join(actorsList, ", ");
	}
	
	public InformaltableType printTable(IUseCase iUseCase) {

		InformaltableType 	table = factory.createInformaltableType();
        TgroupType 	tgroup = factory.createTgroupType();
        TbodyType 	tbody = factory.createTbodyType();
        
        table.setTgroup(tgroup);
        tgroup.setTbody(tbody);
        
        tgroup.setCols(BigInteger.valueOf(2));

		// Create the map of tagged values
		ITaggedValue[] taggedValues = iUseCase.getTaggedValues();
		Map<String,String> tagMap = new HashMap<String, String>();
		for (ITaggedValue tag : taggedValues) {
			tagMap.put(tag.getKey(), tag.getValue());
		}

		addRow(tbody, "Title",iUseCase.getName());
		addRow(tbody, "Summary", tagMap.get("uc.description.summary"));
		addRow(tbody, "Actors", printActors(iUseCase));
		addRow(tbody, "Precondition", tagMap.get("uc.description.precondition"));
		addRow(tbody, "Postcondition", tagMap.get("uc.description.postcondition"));
		addRow(tbody, "Base sequence", tagMap.get("uc.description.base_sequence"));
		addRow(tbody, "Branch sequence", tagMap.get("uc.description.branch_sequence"));
		addRow(tbody, "Exception sequence", tagMap.get("uc.description.exception_sequence"));

		// EXTENDS (from the extension)
		IExtend[] extFrom = iUseCase.getExtends();
		if (extFrom.length > 0) {
			StringBuffer extInfo = new StringBuffer();
			for (IExtend ext : extFrom) {
				extInfo.append(ext.getExtendedCase().getName());
				extInfo.append("\n");
			}
			addRow(tbody, "Extension of", extInfo.toString());
		}

		// EXTENDS (to the extensions)
		IExtend[] extTo = iUseCase.getExtendedCaseInvs();
		if (extTo.length > 0) {
			StringBuffer extInfo = new StringBuffer();
			for (IExtend ext : extTo) {
				extInfo.append(ext.getExtension().getName());
				extInfo.append("\n");
			}
			addRow(tbody, "Extensions", extInfo.toString());
		}
		
		// NOTES
		String notes = tagMap.get("uc.description.note");
		if ((notes != null) && !notes.equals(""))
			addRow(tbody, "Notes", tagMap.get("uc.description.note"));

		return table;
	}

}
