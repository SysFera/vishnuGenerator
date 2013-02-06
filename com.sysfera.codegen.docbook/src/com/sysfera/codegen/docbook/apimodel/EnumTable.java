package com.sysfera.codegen.docbook.apimodel;

import java.math.BigInteger;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;

public class EnumTable {

	private DocbookFactory factory;

	public EnumTable(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}
	

	 
	 private void addHeadRow(TheadType head) {

		 RowType row = factory.createRowType();
		 head.getRow().add(row);
		 // Name
		 EntryType entry = factory.createEntryType();
		 row.getEntry().add(entry);
		 FeatureMapUtil.addText(entry.getMixed(), "Name\n");
		 // Value
		 EntryType entry2 = factory.createEntryType();
		 row.getEntry().add(entry2);
		 FeatureMapUtil.addText(entry2.getMixed(), "Value\n");
		 
	 }


	 public void addRow(TbodyType body, String name, String value) {

		 RowType row = factory.createRowType();
		 body.getRow().add(row);
		 // name
		 EntryType entry = factory.createEntryType();
		 row.getEntry().add(entry);
		 DocBookGenApimUtils.insertText(factory, entry, name);
		 // value
		 EntryType entry2 = factory.createEntryType();
		 row.getEntry().add(entry2);
		 DocBookGenApimUtils.insertText(factory, entry2, value);

	 }


	 public InformaltableType createTable(TbodyType tbody) {

		 InformaltableType tab = factory.createInformaltableType();
		 TgroupType 	tgroup = factory.createTgroupType();
		 TheadType	thead = factory.createTheadType();
         
		 tab.setTgroup(tgroup);
		 tgroup.setTbody(tbody);
		 tgroup.setThead(thead);

		 
		 //tgroup.setAlign("center");
		 tgroup.setCols(BigInteger.valueOf(2));

		 // Column specifications (width)
		 ColspecType colspecName = factory.createColspecType();
		 ColspecType colspecValue = factory.createColspecType();
		 
		 colspecName.setColwidth("4cm");
		 colspecValue.setColwidth("4cm");
		 
		 
		 tgroup.getColspec().add(colspecName);
		 tgroup.getColspec().add(colspecValue);
		

		 // Head row
		 addHeadRow(thead);
		 return tab;
	 }
	
}
