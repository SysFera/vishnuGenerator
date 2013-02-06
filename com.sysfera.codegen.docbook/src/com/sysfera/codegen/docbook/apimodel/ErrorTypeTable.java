package com.sysfera.codegen.docbook.apimodel;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;

import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.ResultCode;

public class ErrorTypeTable {

	private DocbookFactory factory;

	public ErrorTypeTable(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}
	
	private void addHeadRow(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);
		// Name
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Name\n");
		// Description
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Description\n"); 
	}
	
	 public void addRow(TbodyType body, String name, String desc) {

		 RowType row = factory.createRowType();
		 body.getRow().add(row);
		 // Name
		 EntryType entry = factory.createEntryType();
		 row.getEntry().add(entry);
		 DocBookGenApimUtils.insertText(factory, entry, name);
		 // Description
		 EntryType entry2 = factory.createEntryType();
		 row.getEntry().add(entry2);
		 DocBookGenApimUtils.insertText(factory, entry2, desc);
	 }

	 
	 public InformaltableType getTable(EList<ResultCode> ErrorCodes, APIUsage usage) {

		 InformaltableType 	table = factory.createInformaltableType();
		 TbodyType 	tbody = factory.createTbodyType();
		 TgroupType 	tgroup = factory.createTgroupType();
		 TheadType	thead = factory.createTheadType();

		 table.setTgroup(tgroup);
		 tgroup.setTbody(tbody);
		 tgroup.setThead(thead);

		 tgroup.setCols(BigInteger.valueOf(2));

		 // Column specifications (width)
		 ColspecType colspecName = factory.createColspecType();
		 ColspecType colspecDesc = factory.createColspecType();
		 colspecName.setColwidth("8.5cm");
		 colspecDesc.setColwidth("9cm");

		 tgroup.getColspec().add(colspecName);
		 tgroup.getColspec().add(colspecDesc);

		 // Head row
		 addHeadRow(thead);

		 if(usage==APIUsage.API_ONLY) {
			 //Print parameters table
			 for (int k=0; k < ErrorCodes.size();++k) {
				 if(ErrorCodes.get(k).getUsage()==APIUsage.API_ONLY || 
						 ErrorCodes.get(k).getUsage()==APIUsage.ALL) {
					 String name = ErrorCodes.get(k).getName();
					 String desc = ErrorCodes.get(k).getDescription();
					 addRow(tbody, name, desc);
				 }
			 }
		 } else if(usage==APIUsage.CLI_ONLY) {
			 //Print parameters table
			 for (int k=0; k < ErrorCodes.size();++k) {
				 if(ErrorCodes.get(k).getUsage()==APIUsage.CLI_ONLY || 
						 ErrorCodes.get(k).getUsage()==APIUsage.ALL) {
					 String name = ErrorCodes.get(k).getName();
					 String desc = ErrorCodes.get(k).getDescription();
					 addRow(tbody, name, desc);
				 }
			 }
		 } else {
			 //Print parameters table
			 for (int k=0; k < ErrorCodes.size();++k) {
				 String name = ErrorCodes.get(k).getName();
				 String desc = ErrorCodes.get(k).getDescription();
				 addRow(tbody, name, desc);
			 }
		 }

		 return table;
	 }
}
