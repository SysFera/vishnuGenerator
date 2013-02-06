package com.sysfera.codegen.docbook.astah;

import java.util.Iterator;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.ImagedataType;
import org.kermeta.Docbook.ImageobjectType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.TitleType;

import com.change_vision.jude.api.inf.model.IClass;

public class GenDocBookUtils {
	
	/**
	 * Join the elements of an iterable collection of objects into a string
	 * separated by the given delimiter
	 * @param pColl	the iterable collection
	 * @param separator	the separator
	 * @return a string
	 */
	public static String join( Iterable< ? extends Object > pColl, String separator )
    {
        Iterator< ? extends Object > oIter;
        if ( pColl == null || ( !( oIter = pColl.iterator() ).hasNext() ) )
            return "";
        StringBuilder oBuilder = new StringBuilder( String.valueOf( oIter.next() ) );
        while ( oIter.hasNext() )
            oBuilder.append( separator ).append( oIter.next() );
        return oBuilder.toString();
    }
	
	/**
	 * Check if a Class in Astah is an Actor
	 * @param iClass
	 * @return true of false
	 */
	public static boolean isActor(IClass iClass) {
		String st[] = iClass.getStereotypes();
		if (st.length > 0) {
			for (String s : st) {
				if (s.equals("actor")) return true;
			}
		}
		return false;
	}
	
	/**
	 * Inserts figure into DocBook file
	 * @param path
	 * @param 
	 * @return true of false
	 */
	public static void insertFigure(DocbookFactory factory, 
			                        FigureType ucFigure, 
			                        String path, 
			                        String legend,
			                        String align, 
			                        String scale
			                        /*String id*/) {
	
		//Tag Imagedata creation
		ImagedataType ucImageData = factory.createImagedataType();
		ucImageData.setFileref(path);
		ucImageData.setAlign(align);
		ucImageData.setScale(scale);

		//Tag Imageobject creation
		ImageobjectType ucImageObject = factory.createImageobjectType();
		ucImageObject.setImagedata(ucImageData);

		//Tag MediaobjectType Creation
		MediaobjectType ucMediaObject = factory.createMediaobjectType();
		ucMediaObject.setImageobject(ucImageObject);

		//ucFigure.setId(id);
		TitleType ucFigureTitle = factory.createTitleType();
		FeatureMapUtil.addText(ucFigureTitle.getMixed(), legend);
		ucFigure.setTitle(ucFigureTitle);
		ucFigure.setMediaobject(ucMediaObject);
		
	}
	
	public static void insertText(DocbookFactory factory,
			                      EntryType entry,
			                      String text) {
		if (text != null) {
        	java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(text, "\n");
        	while ( tokenizer.hasMoreTokens() ) {
        		ParaType p = factory.createParaType();
        		FeatureMapUtil.addText(p.getMixed(), tokenizer.nextToken());
        		entry.getPara().add(p);
        	}
        }
	}

}
