package com.sysfera.codegen.docbook.apimodel;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.ArgType;
import org.kermeta.Docbook.CmdsynopsisType;
import org.kermeta.Docbook.CommandType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.FuncdefType;
import org.kermeta.Docbook.FuncprototypeType;
import org.kermeta.Docbook.FuncsynopsisType;
import org.kermeta.Docbook.FunctionType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ParamdefType;
import org.kermeta.Docbook.SegListItemType;
import org.kermeta.Docbook.SegType;
import org.kermeta.Docbook.SegmentedListType;
import org.kermeta.Docbook.TermType;
import org.kermeta.Docbook.VarListEntryType;
import org.kermeta.Docbook.VariableListType;

import com.change_vision.jude.api.inf.model.IUseCase;
import com.sysfera.codegen.api.apimodel.API;
import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.ResultCode;
import com.sysfera.codegen.api.apimodel.Service;
import com.sysfera.codegen.api.apimodel.util.ApimodelUtils;
import com.sysfera.codegen.docbook.utils.ManPagesUtils;

/**
 * Prints in docbook the signature of a service
 * Supports different kind of signatures:
 * 	- C++ API signature
 *  - Command-line signature
 *
 */
public class ServiceSignaturePrinter {
	
	private Service	service = null;
	private DocbookFactory factory = null;
	private String _version;
	
	/**
	 * Constructor from a APIM service object
	 * @param service		the service object (EMF Object)
	 * @param version       the current VISHNU version in the form x.y.z
	 */
	public ServiceSignaturePrinter(Service _service, String version) {
		service = _service;
		factory = DocbookFactory.eINSTANCE;
		_version = version.replaceAll("\\p{Punct}", "");
	}
	
	/**
	 * Returns the C++ API signature as a EMF Docbook FuncSynopsis object
	 * @param service
	 * @return
	 */
	public FuncsynopsisType getCPPAPISignature() {

		FuncsynopsisType funcsynopsis = factory.createFuncsynopsisType();
		FuncprototypeType funcprototype = factory.createFuncprototypeType();
		FuncdefType funcdef = factory.createFuncdefType();
		FeatureMapUtil.addText(funcdef.getMixed(), "int ");
		FunctionType function = factory.createFunctionType();
		FeatureMapUtil.addText(function.getMixed(), "vishnu::"+service.getName());
		funcdef.setFunction(function);
		funcprototype.setFuncdef(funcdef);

		List<Port> Ports = ApimodelUtils.getPortsByUsage(service, APIUsage.API_ONLY);

		int size = Ports.size();

		if (size != 0) {
			for (int k=0; k < size;++k) {
				ParamdefType paramdef = factory.createParamdefType();
				Port port = Ports.get(k);
				org.kermeta.Docbook.ParameterType paramtype = factory.createParameterType();
				if(port.isOptional()){
					if(!(port.getDataType().getECoreType() instanceof EClass) ) {
						if(port.getDefaultValueLiteral()!=null) {
							if(port.getDefaultValueLiteral().compareTo("")!=0)
								FeatureMapUtil.addText(paramtype.getMixed(), port.getName()+" = "+port.getDefaultValueLiteral());
							else {
								System.err.println("WARNING: Default value is not initialized");
								FeatureMapUtil.addText(paramtype.getMixed(), port.getName()+" = Error (Not Definide)");
							}
						}
						else {
							System.err.println("WARNING: Default value is not initialized");
							FeatureMapUtil.addText(paramtype.getMixed(), port.getName()+" = Error (Not Definide)");
						}
					} else
						FeatureMapUtil.addText(paramtype.getMixed(), port.getName()+" = "+port.getDataType().getName()+"()");
				}
				else FeatureMapUtil.addText(paramtype.getMixed(), port.getName());
				if((port.getDirection().toString()).compareTo("IN")==0) {
					String funcparametertype = "const "+port.getDataType().getName()+"& "; 
					FeatureMapUtil.addText(paramdef.getMixed(), funcparametertype);
				}
				else {
					String funcparametertype = port.getDataType().getName()+"& ";
					FeatureMapUtil.addText(paramdef.getMixed(), funcparametertype);
				}
				
				paramdef.setParameter(paramtype);
				funcprototype.getParamdef().add(paramdef);
			}
		} else {
			ParamdefType paramdef = factory.createParamdefType();
			funcprototype.getParamdef().add(paramdef);
		}

		funcsynopsis.getFuncprototype().add(funcprototype);
		
		return funcsynopsis;
		
	}
	
	/**
	 * Returns the Python API Signature
	 * @return
	 */
	public FuncsynopsisType getPythonAPISignature() {
		FuncsynopsisType funcsynopsis = factory.createFuncsynopsisType();
		FuncprototypeType funcprototype = factory.createFuncprototypeType();
		FuncdefType funcdef = factory.createFuncdefType();
		FunctionType function = factory.createFunctionType();
		String ret = "ret";
		//Convert version to int value
		int vers = Integer.parseInt(_version);
		System.out.println("VISHNU VERSION : "+_version);
		
		for (int i = 0 ; i<service.getPorts().size(); i++){
			if (isBasicTypeRef(service.getPorts().get(i).getDataType().getName()) && isOutParam(service.getPorts().get(i).getDirection().getName())) {
				ret += ", "+service.getPorts().get(i).getName();
			} else if (service.getPorts().get(i).getDataType().getName().contains("List") && (service.getName().compareTo("connect")!=0 && service.getName().compareTo("reconnect")!=0) && !service.getPorts().get(i).getDataType().getName().contains("Opt")  || service.getPorts().get(i).getDataType().getName().compareTo("ListOptionsValues")==0){
				
				//If the version is 2.0 or plus
				if (vers >= 200) {
					ret += ", "+service.getPorts().get(i).getName();
				}
			}
		}

		
		ret += "=";
		FeatureMapUtil.addText(function.getMixed(), ret+"VISHNU."+service.getName());
		funcdef.setFunction(function);
		funcprototype.setFuncdef(funcdef);

		List<CommandParameter> params = CommandParameter.getPythonParameters(service);
		int size = params.size();

		if (size != 0) {
			for (CommandParameter param : params) {
				// Cannot encapsulate out argument this time
				if (isBasicTypeRef(param.getTypeName()) && param.getDirection().equals("Output argument")) {
					continue;
				}else if(param.getType().getName().contains("List") && (service.getName().compareTo("connect")!=0  && service.getName().compareTo("reconnect")!=0) && !param.getType().getName().contains("Opt") || param.getType().getName().compareTo("ListOptionsValues")==0){
					if (vers >= 200) {
						continue;
					}
				}
				
				ParamdefType paramdef = param.getPythonParamDef();
				funcprototype.getParamdef().add(paramdef);
			}
		} else {
			ParamdefType paramdef = factory.createParamdefType();
			funcprototype.getParamdef().add(paramdef);
		}

		funcsynopsis.getFuncprototype().add(funcprototype);
		
		return funcsynopsis;
	}
	
	/**
	 * Generates the command synopsis of the command-line interface
	 * @return	a cmdsynopsis object
	 */
	public CmdsynopsisType getCommandSynopsis() {
		CmdsynopsisType cmdSyn = factory.createCmdsynopsisType();
		
		// Command name
		CommandType command = factory.createCommandType();
		cmdSyn.setCommand(command);
		FeatureMapUtil.addText(command.getMixed(), DocBookGenApimUtils.convertServiceToCommandName(service));
		
		// Optional parameters
		List<CommandParameter>	optionalParams = CommandParameter.getCommandParameters(service, true);
		for (CommandParameter param : optionalParams) {
			ArgType arg = param.generateArg();
			if (arg != null)
				cmdSyn.getArg().add(arg);
		}
		
		// Required parameters
		List<CommandParameter>	requiredParams = CommandParameter.getCommandParameters(service, false);
		for (CommandParameter param : requiredParams) {
			ArgType arg = param.generateArg();
			if (arg != null)
				cmdSyn.getArg().add(arg);
		}
		return cmdSyn;
	}
	
	/**
	 * Generates the list of all options of the command-line interface (for man pages)
	 * @return	a variablelist object
	 */
	public VariableListType getCommandOptionsList() {
		VariableListType varList = factory.createVariableListType();
		List<CommandParameter>	optionalParams = CommandParameter.getCommandParameters(service, true);
		for (CommandParameter param : optionalParams) {
			VarListEntryType entry = param.generateCommandOptionEntry();
			if (entry != null)
				varList.getVarlistentry().add(entry);
		}
		return varList;
	}
	
	/**
	 * Generates the list of C++ function parameters
	 * @return
	 */
	public VariableListType getCppArgumentsList() {
		VariableListType varList = factory.createVariableListType();
		List<CommandParameter>	params = CommandParameter.getCppParameters(service);
		for (CommandParameter param : params) {
			VarListEntryType entry = param.generateCppArgumentEntry();
			if (entry != null)
				varList.getVarlistentry().add(entry);
		}
		return varList;
	}
	
	/**
	 * Generates the list of Python function parameters
	 * @return
	 */
	public VariableListType getPythonArgumentsList() {
		VariableListType varList = factory.createVariableListType();
		List<CommandParameter>	params = CommandParameter.getPythonParameters(service);
		for (CommandParameter param : params) {
			VarListEntryType entry = param.generatePythonArgumentEntry();
			if (entry != null) {
				varList.getVarlistentry().add(entry);
			}
		}
		return varList;
	}
	
	/**
	 * Generates the list of Python function outputs
	 * FIXME not clean: hard-coded service names!
	 * @return
	 */
	public VariableListType getPythonOutputsList() {
		VariableListType varList = factory.createVariableListType();
		
		// Integer return code
		VarListEntryType entry = factory.createVarListEntryType();
		varList.getVarlistentry().add(entry);
		CommandParameter.addTermToEntry(entry, "errorCode (integer)");
		CommandParameter.addListItemParaToEntry(entry, "Output parameter. Contains 0 on success and the error code on failure.");
		
		
		VarListEntryType entry2 = factory.createVarListEntryType();
		varList.getVarlistentry().add(entry2);
		for (int i = 0 ; i<service.getPorts().size(); i++){
			if (isBasicTypeRef(service.getPorts().get(i).getDataType().getName()) && isOutParam(service.getPorts().get(i).getDirection().getName())) {
				System.out.println("Gotten description !!!!!!!!!!!"+service.getPorts().get(i).getDescription());
				CommandParameter.addTermToEntry(entry2, service.getPorts().get(i).getName()+"("+service.getPorts().get(i).getDataType().getName()+")");
				CommandParameter.addListItemParaToEntry(entry2, service.getPorts().get(i).getDescription());
			}
		}
		return varList;
	}

	
	/**
	 * Generates the list of all environment variables of the command-line interface (for man pages)
	 * @return	a variablelist object
	 */
	public VariableListType getCommandEnvVarList(API api) {
		VariableListType varList = factory.createVariableListType();
		List<CommandParameter>	params = CommandParameter.getCommandParameters(service, null);
		for (CommandParameter param : params) {
			VarListEntryType entry = param.generateEnvVarListEntry();
			if (entry != null)
				varList.getVarlistentry().add(entry);
		}
		for (VarListEntryType entry :  ManPagesUtils.getCommonEnvVars(api)) {
			varList.getVarlistentry().add(entry);
		}
		return varList;
	}
	
	/**
	 * Generates the list of all environment variables of the command-line interface (for man pages)
	 * @return	a variablelist object
	 */
	public VariableListType getJobEnvVarList(API api) {
		VariableListType varList = factory.createVariableListType();
		/*List<CommandParameter>	params = CommandParameter.getCommandParameters(service, null);
		for (CommandParameter param : params) {
			VarListEntryType entry = param.generateEnvVarListEntry();
			if (entry != null)
				varList.getVarlistentry().add(entry);
		}*/
		for (VarListEntryType entry :  ManPagesUtils.getJobEnvVars(api)) {
			varList.getVarlistentry().add(entry);
		}
		return varList;
	}
	
	/**
	 * Generates the list of all error messages for the command (for man pages)
	 * FIXME creates a list that contain 2 times each item (bug in docbook ecore??)
	 * @return  a segmentedlist object
	 */
	public SegmentedListType getCommandErrorCodesSeg() {
		SegmentedListType segList = factory.createSegmentedListType();
		segList.getSegtitle().add("Errorcode");
		segList.getSegtitle().add("Errortext");
		segList.getSegtitle().add("Diagnostic");
		List<ResultCode>			codes = service.getResultCodes();
		Map<Integer,ResultCode> 	codesMap = new TreeMap<Integer, ResultCode>();
		// put the elements in a tree map to sort them
		for (ResultCode code : codes) {
			System.out.println("CODE: " + code.getValue() + " " + code.getDescription());
			codesMap.put(code.getValue(), code);
		}
		for (Map.Entry<Integer,ResultCode> entry : codesMap.entrySet()) {
			System.out.println("MAPCODE: " + entry.getKey() + " " + entry.getValue().getDescription());
			SegListItemType item = factory.createSegListItemType();
			segList.getSeglistitem().add(item);
			// Error code
			SegType seg1 = factory.createSegType();
			seg1.getErrorcode().add(entry.getKey().toString());
			// Error text
			SegType seg2 = factory.createSegType();
			String descr = entry.getValue().getDescription();
			if (descr != null)
				seg2.getErrortext().add(descr);
			// Error diagnostic
			SegType seg3 = factory.createSegType();
			String diag = entry.getValue().getDiagnostic();
			if (diag != null)
				FeatureMapUtil.addText(seg3.getMixed(), diag);
			
			item.getSeg().add(seg1);
			item.getSeg().add(seg2);
			item.getSeg().add(seg3);
		}
		return segList;
	}
	
	/**
	 * Generates the list of all error messages for the command (for man pages)
	 * @return  a variablelist object
	 */
	public VariableListType getCommandErrorCodes(APIUsage usageFilter) {
		VariableListType varList = factory.createVariableListType();
		List<ResultCode>			codes = ApimodelUtils.getErrorCodesByUsage(service, usageFilter);
		Map<Integer,ResultCode> 	codesMap = new TreeMap<Integer, ResultCode>();
		// put the elements in a tree map to sort them
		// exclude the code 0 (success)
		for (ResultCode code : codes) {
			if (code.getValue() != 0) {
				codesMap.put(code.getValue(), code);
			}
		}
		for (Map.Entry<Integer,ResultCode> codeEntry : codesMap.entrySet()) {
			VarListEntryType entry = factory.createVarListEntryType();
			varList.getVarlistentry().add(entry);
			
			TermType term = factory.createTermType();
			entry.getTerm().add(term);
			String errText = codeEntry.getValue().getDescription();
			String errCode = codeEntry.getKey().toString();
			String errLabel = "\"" + errText + "\"" + " [" + errCode + "]";
			FeatureMapUtil.addText(term.getMixed(), errLabel);

			// Error diagnostic
			ListitemType item = factory.createListitemType();
			entry.setListitem(item);
			String diag = codeEntry.getValue().getDiagnostic();
			if ((diag != null) && !diag.isEmpty()) {
				ParaType para = factory.createParaType();
				item.getPara().add(para);
				FeatureMapUtil.addText(para.getMixed(), diag);
			}
			
		}
		return varList;
	}

	/**
	 * Generates the list of exceptions for API functions
	 * @param apiOnly
	 * @return
	 */
	public VariableListType getFunctionExceptions() {
		VariableListType varList = factory.createVariableListType();
		List<ResultCode>			codes = ApimodelUtils.getErrorCodesByUsage(service, APIUsage.API_ONLY);
		Map<Integer,ResultCode> 	codesMap = new TreeMap<Integer, ResultCode>();
		// put the elements in a tree map to sort them
		// exclude the code 0 (success)
		for (ResultCode code : codes) {
			if (code.getValue() != 0) {
				codesMap.put(code.getValue(), code);
			}
		}
		for (Map.Entry<Integer,ResultCode> codeEntry : codesMap.entrySet()) {
			VarListEntryType entry = factory.createVarListEntryType();
			varList.getVarlistentry().add(entry);
			
			TermType term = factory.createTermType();
			entry.getTerm().add(term);
			String errType = getExceptionType(codeEntry.getKey());
			String errText = codeEntry.getValue().getDescription();
			String errCode = codeEntry.getKey().toString();
			String errLabel = errType + "(\"" + errText + "\"" + " [" + errCode + "])";
			FeatureMapUtil.addText(term.getMixed(), errLabel);

			// Error diagnostic
			ListitemType item = factory.createListitemType();
			entry.setListitem(item);
			String diag = codeEntry.getValue().getDiagnostic();
			if ((diag != null) && !diag.isEmpty()) {
				ParaType para = factory.createParaType();
				item.getPara().add(para);
				FeatureMapUtil.addText(para.getMixed(), diag);
			}
			
		}
		return varList;
	}
	
	private String getExceptionType(int errCode) {
		String type = "";
		if (errCode < 10) {
			type = "SystemException";
		} else if (errCode < 20) {
			type = "UserException";
		} else if (errCode < 100) {
			type = "UMSVishnuException";
		} else if (errCode < 200) {
			type = "TMSVishnuException";
		} else if (errCode < 300) {
			type = "FMSVishnuException";
		} else if (errCode < 400) {
			type = "IMSVishnuException";
		} else {
			System.err.println("WARNING: unknown exception code: " + errCode);
		}
		return type;
	}
	
	private boolean isBasicTypeRef(String s) {
		return (s.equals("string") || s.equals("int"));
	}
	
	private boolean isOutParam(String s){
		return s.equals("OUT");
	}
	
}
