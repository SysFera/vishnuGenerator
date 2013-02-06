package com.sysfera.codegen.docbook.apimodel;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.ArgType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.EnvarType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.OptionType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ParamdefType;
import org.kermeta.Docbook.ParameterType;
import org.kermeta.Docbook.ReplaceableType;
import org.kermeta.Docbook.TermType;
import org.kermeta.Docbook.VarListEntryType;

import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.EnvVariableList;
import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.Service;
import com.sysfera.codegen.api.apimodel.portDirection;
import com.sysfera.codegen.api.apimodel.util.ApimodelUtils;
import com.sysfera.codegen.docbook.utils.ManPagesUtils;

/**
 * This abstract class represents a parameter of an APIM service in the context of CLI (command-line interface)
 * This is used to generate docbook for one command parameter. Several generation methods are available
 * for the different kind of command representations (man pages, specifications, etc.)
 * @author bisnard
 *
 */
public abstract class CommandParameter {
	
	protected abstract String 		getName();
	protected abstract String 		getShortOptionLetter();
	protected abstract String 		getDescription();
	protected abstract EClassifier 	getType();
	protected abstract String 		getTypeName();
	protected abstract boolean		isOptional();
	protected abstract String		getDefaultValue();
	protected abstract String		getDirection();
	protected abstract boolean		hasEnvVariable();
	protected abstract EnvVariable	getEnvVariable();
	
	/**
	 * Generates the 'arg' element for the parameter (used in command synopsis)
	 * @return	the 'arg' element or null if no element can be generated
	 */
	public ArgType generateArg() {
		ArgType arg = DocbookFactory.eINSTANCE.createArgType();
		boolean isInteractive = ApimodelUtils.isInteractiveParam(getName());
		
		// Check type
		if (getType() == null) {
			System.err.println("ERROR: command parameter " + getName() + " has no type");
			System.exit(0);
		}
		
		// Get short option letter
		String shortOption = getShortOptionLetter();
		
		// Add option and text to the arg if necessary
		
		if (getType().getName().compareTo("EBoolean") == 0) {
			addOptionToArg(arg, shortOption, null);
		} else if (getType() instanceof EDataType) {
			
			// OPTIONAL
			if (isOptional()) {
//				String argValue = isInteractive ? null : getName();
				String argValue = getName();
				addOptionToArg(arg, shortOption, argValue);
				
			// REQUIRED
			} else {
				// Exclude: interactive ports
				// Exclude: port with envOption that is NOT a userOption (actually applies only to sessionKey)
				if (!isInteractive && (!hasEnvVariable() || getEnvVariable().isIsUserOption())) {
					addRequiredToArg(arg, getName());
				} else {
					arg = null;
				}
			}
		} else {
			System.err.println("ERROR: command parameter " + getName() + " has invalid type");
			System.exit(0);
		}
		return arg;
	}
	
	/**
	 * Generates the 'paramdef' element for the parameter in the Python function signature
	 * @return
	 */
	public ParamdefType getPythonParamDef() {
		ParamdefType paramdef = DocbookFactory.eINSTANCE.createParamdefType();
		ParameterType parameter = DocbookFactory.eINSTANCE.createParameterType();
		paramdef.setParameter(parameter);
		// Type: raw value
		FeatureMapUtil.addText(paramdef.getMixed(), getTypeName() + " ");
		// Parameter
		if (!isOptional()) {
			FeatureMapUtil.addText(parameter.getMixed(), getName());
		} else {
			String defValue = getDefaultValue();
			if (defValue != null) {
				//FIXME normally the default value should be outside the parameter tag
				// but this does not work with EMF. (and 'initializer' tag is not recognized by the man pages xsl)
				FeatureMapUtil.addText(parameter.getMixed(), getName() + " = " + defValue);
			} else {
				System.err.println("getPythonParamDef: optional port without default value (" + getName() + ")");
			}
		}
		return paramdef;
	}

	/**
	 * Generates the 'varlistentry' element for the CLI parameter (option of the command-line)
	 * @return	the 'varlistentry' element or null if no element can be generated
	 */
	public VarListEntryType generateCommandOptionEntry() {
		String shortOption = getShortOptionLetter();
		String optionName = getName();
		VarListEntryType entry = DocbookFactory.eINSTANCE.createVarListEntryType();
		
		// Term
		if ((shortOption != null) && !shortOption.isEmpty()) {
			TermType term = DocbookFactory.eINSTANCE.createTermType();
			entry.getTerm().add(term);
			addOptionToTerm(term, shortOption, optionName);
		} else {
			System.err.println("generateVarListEntry: No short option for command param: " + optionName);
		}
		
		// ListItem
		ListitemType listitem = DocbookFactory.eINSTANCE.createListitemType();
		entry.setListitem(listitem);
		ParaType para = DocbookFactory.eINSTANCE.createParaType();
		listitem.getPara().add(para);
		String content = "";
		
		// Description
		content += getDescription() + ".";

		// Paragraph with list of values
		EClassifier optionType = getType();
		if (optionType instanceof EEnum) {
			content += "\nThe value must be an integer. Predefined values are: ";
			for (EEnumLiteral literal : ((EEnum) optionType).getELiterals()) {
				content += literal.getValue() + " (" +  literal + ")" +  ", ";
			}
			content = content.substring(0, content.length()-2) + ".";
		}
		FeatureMapUtil.addText(para.getMixed(), content);
		
		return entry;
	}
	
	/**
	 * Generates the 'varlistentry' element for the CPP API function parameter
	 * @param service
	 * @param b
	 * @return
	 */
	public VarListEntryType generateCppArgumentEntry() {
		VarListEntryType entry = DocbookFactory.eINSTANCE.createVarListEntryType();
		// Term
		addTermToEntry(entry, getName());
		// ListItem
		addListItemParaToEntry(entry, getDirection() + ". " + FirstCharToUpper(getDescription()) + ".");
		return entry;
	}
	
	/**
	 * Generates the 'varlistentry' element for the Python API function parameter
	 * @return
	 */
	public VarListEntryType generatePythonArgumentEntry() {
		return generateCppArgumentEntry();
	}
	
	/**
	 * Generates the 'varlistentry' element for the environment variable of the parameter (if defined)
	 * @return	the element or null if no environment variable is defined
	 */
	public VarListEntryType generateEnvVarListEntry() {
		VarListEntryType entry = null;
		if (hasEnvVariable()) {
			entry = DocbookFactory.eINSTANCE.createVarListEntryType();
			ManPagesUtils.generateEnvVarEntry(entry, 
											  getEnvVariable().getName(),
											  getEnvVariable().getDescription(),
											  getShortOptionLetter());
		}
		return entry;
	}
	
	/**
	 * Retrieve the list of command-line parameters for a given Service
	 * @param service	the service corresponding to the command
	 * @param optional	select optional or non-optional parameters (if null, all parameters are returned)
	 * @return the list of matching parameters (including interactive ones)
	 */
	public static List<CommandParameter> getCommandParameters(Service service, Boolean optional) {
		List<CommandParameter> params = new ArrayList<CommandParameter>();
		
		// Add the help parameter
		if ((optional == null) || optional) {
			params.add(new HelpCmdParam());
		}
		
		// Process all CLI ports
		List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.CLI_ONLY);
		for (Port port : ports) {
			
			// Process only input ports
			if (port.getDirection().equals(portDirection.IN)) {
						
				params.addAll(createPortParameters(port, optional));
				
			}
		}
		
		return params;
	}
	
	/**
	 * Common part of the static functions that make the list of parameters
	 * @param port
	 * @param optional
	 * @return
	 */
	private static List<CommandParameter> createPortParameters(Port port, Boolean optional) {
		List<CommandParameter> params = new ArrayList<CommandParameter>();
		EClassifier eType = port.getDataType().getECoreType();
		// 1/ PORT ETYPE = EDATATYPE
		if (eType instanceof EDataType) {
//			System.out.println("SCALAR PARAM: " + port.getName());
			CommandParameter portParam = new PortCmdParam(port);
			if ((optional == null) || (portParam.isOptional() == optional.booleanValue())) {
				
				params.add(portParam);
				System.out.println("ADD PORT PARAM: " + portParam.getName());
			}
		}
		// 2/ PORT ETYPE = ECLASS
		else if (eType instanceof EClass) {
//			System.out.println("OBJECT PORT " + port.getName());
			for(EObject obj : eType.eContents()) {
				if (obj instanceof EAttribute) {
					EAttribute attr = (EAttribute) obj;
					CommandParameter attrParam = new AttributeCmdParam(attr, port.getService());
					
					// Exclude non-matching optional/non-optional
					if ((optional == null) || (attrParam.isOptional() == optional.booleanValue())) {
						params.add(attrParam);
						System.out.println("ADD ATTRIBUTE PARAM: " + attr.getName());
					}
				} 
				else if (obj instanceof EReference) {
					EReference eref = (EReference) obj;
					if((eref.getEType() instanceof EClass)) {
						for(EObject refObj : eref.getEType().eContents()) {
							if (refObj instanceof EAttribute) {
								EAttribute refAttr = (EAttribute) refObj;
								CommandParameter refAttrParam = new AttributeCmdParam(refAttr, port.getService());
								// Exclude non-matching optional/non-optional
								if ((optional == null) || (refAttrParam.isOptional() == optional.booleanValue())) {
									params.add(refAttrParam);
									System.out.println("++++++++++++++++ADD ATTRIBUTE PARAM: " + refAttr.getName());
								}
							}
						}
					}
				}
			}
		}
		else {
			System.err.println("PORT '" + port.getName() +"' ETYPE NOT VALID");
		}
		return params;
	}
	
	/**
	 * Retrieve the list of C++ function parameters for a given Service
	 * @param service
	 * @return
	 */
	public static List<CommandParameter> getCppParameters(Service service) {
		List<CommandParameter> params = new ArrayList<CommandParameter>();
		List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.API_ONLY);
		for (Port port : ports) {
			params.add(new PortCmdParam(port));
		}
		return params;
	}
	
	/**
	 * Retrieve the list of Python function parameters for a given Service
	 * @param service
	 * @return
	 */
	public static List<CommandParameter> getPythonParameters(Service service) {
		List<CommandParameter> params = new ArrayList<CommandParameter>();
		List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.API_ONLY);
		for (Port port : ports) {
			if (port.getName() != "session") {
				params.add(new PortCmdParam(port));
			}
		}
		return params;
	}
	
	/**
	 * Implementation of command parameter for a parameter defined at the port level
	 * @author bisnard
	 *
	 */
	static public class PortCmdParam extends CommandParameter {
		
		private Port port = null;
		
		public PortCmdParam(Port _port) {
			port = _port;
		}

		@Override
		protected String getShortOptionLetter() {
			return port.getShortOptionLetter();
		}

		@Override
		protected String getDescription() {
			return port.getDescription();
		}

		@Override
		protected String getName() {
			return port.getName();
		}

		@Override
		protected EClassifier getType() {
			return port.getDataType().getECoreType();
		}
		
		@Override
		protected String getTypeName() {
			return port.getDataType().getName();
		}

		@Override
		protected boolean isOptional() {
			return port.isOptional();
		}

		@Override
		protected boolean hasEnvVariable() {
			return port.getEnvOption() != null;
		}

		@Override
		protected EnvVariable getEnvVariable() {
			return port.getEnvOption();
		}

		@Override
		protected String getDefaultValue() {
			if (getType() instanceof EClass) {
				return getTypeName() + "()";
			} else if ((port.getDefaultValueLiteral() != null) && (!port.getDefaultValueLiteral().equals(""))) {
				return port.getDefaultValueLiteral();
			}
			return null;
		}

		@Override
		protected String getDirection() {
			String dir = "";
			switch(port.getDirection().getValue()) {
			case portDirection.IN_VALUE:
				dir = "Input argument";
				break;
			case portDirection.INOUT_VALUE:
				dir = "Input/Output argument";
				break;
			case portDirection.OUT_VALUE:
				dir = "Output argument";
				break;
			}
			return dir;
		}

	}
	
	/**
	 * Implementation of command parameter for a parameter defined at the class attribute level
	 * @author bisnard
	 *
	 */
	static public class AttributeCmdParam extends CommandParameter {
		
		private EAttribute 	attr = null;
		private Service		service = null;
		
		public AttributeCmdParam(EAttribute _attr, Service serv) {
			attr = _attr;
			service = serv;
		}
		
		@Override
		protected String getShortOptionLetter() {
			return ApimodelUtils.getAttributeShortOption(attr);
		}
		
		@Override
		protected String getDescription() {
			return ApimodelUtils.getAttributeDescr(attr);
		}

		@Override
		protected String getName() {
			return attr.getName();
		}

		@Override
		protected EClassifier getType() {
			return attr.getEAttributeType();
		}
		
		@Override
		protected String getTypeName() {
			return attr.getEAttributeType().getName();
		}

		@Override
		protected boolean isOptional() {
			return attr.getLowerBound() == 0;
		}

		@Override
		protected boolean hasEnvVariable() {
			return (ApimodelUtils.getAttributeUserOption(attr) != null);
		}

		@Override
		protected EnvVariable getEnvVariable() {
			String envVarName = ApimodelUtils.getAttributeUserOption(attr);
			if ((envVarName != null) && !envVarName.isEmpty()) {
				EnvVariableList envVarList = service.getModule().getApi().getEnvVariableList();
				for (EnvVariable var : envVarList.getEnvVariables()) {
					if (var.getName().equals(envVarName)) {
						return var;
					}
				}
				System.err.println("WARNING: env variable '" + envVarName + "'not found");
			}
			return null;
		}

		@Override
		protected String getDefaultValue() {
			// TODO
			return null;
		}

		@Override
		protected String getDirection() {
			System.err.println("CommandParameter.getDirection() not applicable to attributes");
			System.exit(1);
			return null;
		}
		
	}
	
	/**
	 * Specific implementation for the help parameter
	 * @author bisnard
	 *
	 */
	static public class HelpCmdParam extends CommandParameter {

		@Override
		protected String getName() {
			return "help";
		}

		@Override
		protected String getShortOptionLetter() {
			return "h";
		}

		@Override
		protected String getDescription() {
			return "help about the command";
		}

		@Override
		protected EClassifier getType() {
			return ApimodelUtils.getEDataType("EBoolean");
		}
		
		@Override
		protected String getTypeName() {
			return "boolean";
		}

		@Override
		protected boolean isOptional() {
			return true;
		}

		@Override
		protected boolean hasEnvVariable() {
			return false;
		}

		@Override
		protected EnvVariable getEnvVariable() {
			return null;
		}

		@Override
		protected String getDefaultValue() {
			return "";
		}

		@Override
		protected String getDirection() {
			return "";
		}

	}
	
	/**
	 * Util method to generate an 'option' element within an 'arg' element
	 * @param arg
	 * @param optionLetter
	 * @param optionName (may be null)
	 */
	private static void addOptionToArg(ArgType arg, String optionLetter, String optionName) {
		if ((optionLetter != null) && !optionLetter.isEmpty()) {
			OptionType opt = DocbookFactory.eINSTANCE.createOptionType();
			arg.getOption().add(opt);
			arg.setChoice("opt");
			String optionText = "-" + optionLetter + ((optionName != null) ? " " : "");
			FeatureMapUtil.addText(opt.getMixed(), optionText);
			
			if (optionName != null) {
				ReplaceableType repl = DocbookFactory.eINSTANCE.createReplaceableType();
				opt.getReplaceable().add(repl);
				FeatureMapUtil.addText(repl.getMixed(), optionName);
			}
			
		} else {
			System.err.println("WARNING: empty option");
		}
	}
	
	/**
	 * Util method to generate the 'replaceable' element within an 'arg' element
	 * @param arg
	 * @param paramName
	 */
	private static void addRequiredToArg(ArgType arg, String paramName) {
		if ((paramName != null) && !paramName.isEmpty()) {
			ReplaceableType repl = DocbookFactory.eINSTANCE.createReplaceableType();
			arg.getReplaceable().add(repl);
			arg.setChoice("plain");
			FeatureMapUtil.addText(repl.getMixed(), paramName);
		} else {
			System.err.println("WARNING: empty non-optional parameter");
		}
	}
	
	/**
	 * Util method to generate an 'option' element within an 'term' element
	 * @param term
	 * @param optionLetter
	 * @param optionName (may be null)
	 */
	public static void addOptionToTerm(TermType term, String optionLetter, String optionName) {
		if ((optionLetter != null) && !optionLetter.isEmpty()) {
			OptionType opt = DocbookFactory.eINSTANCE.createOptionType();
			term.getOption().add(opt);
			FeatureMapUtil.addText(opt.getMixed(), "-" + optionLetter + " ");
			
			if (optionName != null) {
				ReplaceableType repl = DocbookFactory.eINSTANCE.createReplaceableType();
				opt.getReplaceable().add(repl);
				FeatureMapUtil.addText(repl.getMixed(), optionName);
			}
		} else {
			System.err.println("WARNING: empty option");
		}
	}
	
	/**
	 * Util method to create a 'term' element within a 'varlistentry' with an 'emphasis' subelement
	 * @param entry
	 * @param content
	 */
	public static void addTermToEntry(VarListEntryType entry, String content) {
		TermType term = DocbookFactory.eINSTANCE.createTermType();
		entry.getTerm().add(term);
		EmphasisType emph = DocbookFactory.eINSTANCE.createEmphasisType();
		term.getEmphasis().add(emph);
		FeatureMapUtil.addText(emph.getMixed(), content);
	}
	
	/**
	 * Util method to create a 'listitem' element within a 'varlistentry' with a 'para' subelement
	 * @param entry
	 * @param content
	 */
	public static void addListItemParaToEntry(VarListEntryType entry, String content) {
		ListitemType listitem = DocbookFactory.eINSTANCE.createListitemType();
		entry.setListitem(listitem);
		ParaType para = DocbookFactory.eINSTANCE.createParaType();
		listitem.getPara().add(para);
		FeatureMapUtil.addText(para.getMixed(), content);
	}
	
	/**
	 * Util method to uppercase the first character of a string
	 * @param str
	 * @return a string
	 */
	private static String FirstCharToUpper(String str)
	{
		if (str != null)
			return Character.toUpperCase(str.charAt(0)) + str.substring(1);
		else
			return null;
	}


	
}
