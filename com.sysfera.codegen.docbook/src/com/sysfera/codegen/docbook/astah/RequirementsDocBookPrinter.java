package com.sysfera.codegen.docbook.astah;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.TableType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;

import com.change_vision.jude.api.inf.exception.InvalidUsingException;
import com.change_vision.jude.api.inf.model.INamedElement;
import com.change_vision.jude.api.inf.model.IRequirement;


public class RequirementsDocBookPrinter {
	
	private DocbookFactory factory;
	
	public RequirementsDocBookPrinter(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}
	
	private void addHeadRow(TheadType head) {
		
        RowType row = factory.createRowType();
        head.getRow().add(row);
        // ID
        EntryType entry = factory.createEntryType();
        row.getEntry().add(entry);
        FeatureMapUtil.addText(entry.getMixed(), "ID\n");
        // Name
        EntryType entry2 = factory.createEntryType();
        row.getEntry().add(entry2);
        FeatureMapUtil.addText(entry2.getMixed(), "Name\n");
        // Text
        EntryType entry3 = factory.createEntryType();
        row.getEntry().add(entry3);
        FeatureMapUtil.addText(entry3.getMixed(), "Text\n");
        
	}
	
	private void addRow(TbodyType body, String ID, String Name, String Text) {
		
        RowType row = factory.createRowType();
        body.getRow().add(row);
        // ID
        EntryType entry = factory.createEntryType();
        row.getEntry().add(entry);
        GenDocBookUtils.insertText(factory, entry, ID);
        // Name
        EntryType entry2 = factory.createEntryType();
        row.getEntry().add(entry2);
        GenDocBookUtils.insertText(factory, entry2, Name);
        // Text
        EntryType entry3 = factory.createEntryType();
        row.getEntry().add(entry3);
        GenDocBookUtils.insertText(factory, entry3, Text);
        
	}
	
	public InformaltableType printTable(INamedElement[] elements) {
		
		Map<String,IRequirement> reqMap = new TreeMap<String, IRequirement>();
		
    	// put the elements in a treemap to sort them
    	for (INamedElement element : elements) {
    		IRequirement iReq = (IRequirement) element;
    		reqMap.put(iReq.getRequirementID(), iReq);
    	}
    	
    	// table
    	InformaltableType 	table = factory.createInformaltableType();
        TgroupType 	tgroup = factory.createTgroupType();
        TheadType	thead = factory.createTheadType();
        TbodyType 	tbody = factory.createTbodyType();
        
        table.setTgroup(tgroup);
        tgroup.setThead(thead);
        tgroup.setTbody(tbody);
        
        tgroup.setCols(BigInteger.valueOf(3));
        
        // Column specifications (width)
        ColspecType colspecID = factory.createColspecType();
        ColspecType colspecName = factory.createColspecType();
        ColspecType colspecReq = factory.createColspecType();
        colspecID.setColwidth("2cm");
        colspecName.setColwidth("4cm");
        colspecReq.setColwidth("10cm");
        tgroup.getColspec().add(colspecID);
        tgroup.getColspec().add(colspecName);
        tgroup.getColspec().add(colspecReq);
        
        // Head row
        addHeadRow(thead);
        
        // BODY
    	for (Map.Entry<String, IRequirement> entry : reqMap.entrySet()) {
    		IRequirement iReq = entry.getValue();
    		addRow(tbody, iReq.getRequirementID(), iReq.getName(), iReq.getRequirementText());
//    		IClass[] subClasses = iReq.getNestedClasses();
//    		if (subClasses.length > 0) System.out.println(subClasses.length + " sub-classe(s)");
    	}
    	
    	return table;
    	
	}

}
