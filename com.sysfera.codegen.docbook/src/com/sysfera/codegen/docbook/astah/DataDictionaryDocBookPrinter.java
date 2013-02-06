package com.sysfera.codegen.docbook.astah;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.ListitemType;

import org.kermeta.Docbook.ParaType;

import com.change_vision.jude.api.inf.presentation.INodePresentation;


public class DataDictionaryDocBookPrinter {
	
	private DocbookFactory factory;
	
	public DataDictionaryDocBookPrinter(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}
	
	private ListitemType makeItem(INodePresentation node) {
		
		ListitemType item = factory.createListitemType();
		ParaType para = factory.createParaType();
		item.getPara().add(para);
		
		INodePresentation childs[] = node.getChildren();
		if (childs.length >= 1) {
			// If the topic has childs then its label is set as bold
			EmphasisType label = factory.createEmphasisType();
			para.getEmphasis().add(label);
			label.setRole("bold");
			FeatureMapUtil.addText(label.getMixed(), node.getLabel());
			
			if (childs.length == 1) {
				// If only one child then this child is the text following the label
				FeatureMapUtil.addText(para.getMixed(), ": " + childs[0].getLabel());
			} else {
				// If several childs then we create a list an call the function recursively
				ItemizedlistType list = factory.createItemizedlistType();
				item.setItemizedlist(list);
				for (INodePresentation child : childs) {
					list.getListitem().add(makeItem(child));
				}
			}
		} else { // if no child the text is simply written without emphasis
			FeatureMapUtil.addText(para.getMixed(), node.getLabel());
		}
		return item;
	}
	
	public ParaType print(INodePresentation rootNode) {
		
		Map<String,INodePresentation> wordMap = new TreeMap<String, INodePresentation>();
		
    	// put the words in a treemap to sort them
    	for (INodePresentation word: rootNode.getChildren()) {
    		wordMap.put(word.getLabel(), word);
    	}
    	
    	// itemized list
    	ParaType 	para	= factory.createParaType();
    	ItemizedlistType list = factory.createItemizedlistType();
    	para.getItemizedlist().add(list);
        
        // BODY
    	for (Map.Entry<String, INodePresentation> wordEntry : wordMap.entrySet()) {
    		list.getListitem().add(makeItem(wordEntry.getValue()));
    	}
    	
    	return para;
    	
	}

}
