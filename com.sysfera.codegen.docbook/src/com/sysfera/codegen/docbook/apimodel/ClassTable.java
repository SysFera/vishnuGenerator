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

public class ClassTable {

	private DocbookFactory factory;

	public ClassTable(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}

	private void addHeadRow(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);
		// Parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Name\n");
		// Type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Type\n");
		// Description
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		FeatureMapUtil.addText(entry3.getMixed(), "Description\n");

	}


	public void addRow(TbodyType body, String name, String type, String desc, boolean isClassType) {

		RowType row = factory.createRowType();
		body.getRow().add(row);
		// name
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		DocBookGenApimUtils.insertText(factory, entry, name);
		// type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		if(!isClassType) DocBookGenApimUtils.insertText(factory, entry2, type);
		else DocBookGenApimUtils.insertLinkText(factory, entry2, type);
		// description
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		DocBookGenApimUtils.insertText(factory, entry3, desc);

	}


	public InformaltableType createTable(TbodyType tbody) {

		InformaltableType tab = factory.createInformaltableType();
		TgroupType 	tgroup = factory.createTgroupType();
		TheadType	thead = factory.createTheadType();

		tab.setTgroup(tgroup);
		tgroup.setTbody(tbody);
		tgroup.setThead(thead);

		tgroup.setCols(BigInteger.valueOf(3));

		// Column specifications (width)
		ColspecType colspecName = factory.createColspecType();
		ColspecType colspecType = factory.createColspecType();
		ColspecType colspecDesc = factory.createColspecType();
		ColspecType colspecReq = factory.createColspecType();
		colspecName.setColwidth("4cm");
		colspecType.setColwidth("3cm");
		colspecDesc.setColwidth("8cm");
		colspecReq.setColwidth("2cm");

		tgroup.getColspec().add(colspecName);
		tgroup.getColspec().add(colspecType);
		tgroup.getColspec().add(colspecDesc);
		tgroup.getColspec().add(colspecReq);

		// Head row
		addHeadRow(thead);
		return tab;
	}
}
