package com.sysfera.codegen.docbook.apimodel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.LinkType;
import org.kermeta.Docbook.ParaType;

import com.sysfera.codegen.api.apimodel.Service;

public class DocBookGenApimUtils {

	/**
	 * Add a 'para' tag with some text inside within an 'entry' (table cell)
	 * @param factory	the docbook factory
	 * @param entry		the entry object
	 * @param text		the text to add
	 */
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

	/**
	 * Add a 'link' tag with the same text for the link and the target, within an 'entry' (table cell)
	 * @param factory	the docbook factory
	 * @param entry		the entry object
	 * @param text		the text of the link (and the target name)
	 */
	public static void insertLinkText(DocbookFactory factory,
			EntryType entry,
			String text) {

		ParaType p = factory.createParaType();
		String prefix = "List of "; 

		if(text.startsWith(prefix)) {
			FeatureMapUtil.addText(p.getMixed(), prefix);
			text = text.substring(prefix.length());
		}

		LinkType linktype = factory.createLinkType();
		linktype.setLinkend(text);
		p.getLink().add(linktype);
		FeatureMapUtil.addText(linktype.getMixed(), text);
		entry.getPara().add(p);
	}
	
	/**
	 * Convert an APIM service name to the UNIX command name (C format with a prefix)
	 * FIXME The prefix is statically defined
	 * @param 	service		the service object
	 * @return	the command name
	 */
	public static String convertServiceToCommandName(Service service) {
		
		String cmdName = service.getDetails().get("commandName");
		
		if (cmdName == null) {
			
			final String COMMAND_PREFIX = "vishnu";

			cmdName = COMMAND_PREFIX;
			// set the first character of service name as upperCase
			String inputString = service.getName().substring(0, 1).toUpperCase() + service.getName().substring(1);

			// initialize regular expression for each word of the service name
			String wordRegex = "\\p{Upper}\\p{Lower}*";
			Pattern pattern = Pattern.compile(wordRegex);
			Matcher matcher = pattern.matcher(inputString);

			// add each word in lowercase, separated by underscore
			while (matcher.find()) {
				cmdName += "_" + matcher.group().substring(0, 1).toLowerCase() + matcher.group().substring(1);
			}
		}
		return cmdName;
	}

}
