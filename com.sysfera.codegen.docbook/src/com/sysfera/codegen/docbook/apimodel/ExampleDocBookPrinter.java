package com.sysfera.codegen.docbook.apimodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.ExampleType;
import org.kermeta.Docbook.ProgramlistingType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TitleType;

import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.Service;

public class ExampleDocBookPrinter {

	private DocbookFactory factory;

	ExampleDocBookPrinter(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}

	public void printExemple(SectionType section, Service serv) {

		String test ;
		String prog = "  int res;\n";
		String arglist = "";
		String call = "\n  "+"res="+serv.getName()+"(";
		String OutPutHead = "  if(!res) {\n";
		String OutPutElse = "  } else \n";
		OutPutElse += "      printErr(res);\n";
		String OutPutBody = "";

		String separator = ", ";
		boolean isOutPut = false;

		String head = "#include <iostream>\n"; 
		head += "#include \"vishnu-tms.h\"\n\n";
		head += "using namespace std;\n\n";
		head += "int main(int argc, char* argv[])\n{\n";


		EList<Port> listPort = serv.getPorts();

		int size = listPort.size();
		for (int k=0; k < size;++k) {
			Port port = listPort.get(k);
			prog += "  "+port.getDataType().getName()+" "+port.getName()+";\n"; 

			if(k==size-1) separator ="";
			call += port.getName()+separator; 
		}

		call +=");\n";

		prog += "\n";
		int argc = 1;
		for (int k=0; k < size;++k) {
			Port port = listPort.get(k);
			if((port.getDirection().toString()).compareTo("IN")==0) {
				if(!(port.getDataType().getName().contains("Options"))){
					prog += "  "+port.getName()+" = "+"argv["+argc+"];\n";
					arglist += " <"+port.getName()+">";
					argc++;
				}
			} else {
				isOutPut = true;
				if(!(port.getDataType().getName().contains("List")))
					OutPutBody += "    cout << \""+port.getName()+"="+"\" << "+port.getName()+" << endl;\n";
				else OutPutBody += "    printList("+port.getName()+");\n";
			}
		}

		if(!isOutPut) {
			OutPutHead = "  if(res!=0) {\n";
			OutPutBody = "      printErr(res);\n";
			OutPutElse = "  }\n";
		}
		String OutPut = OutPutHead+OutPutBody+OutPutElse;
		String end = "\n  return EXIT_SUCCESS;\n}\n";
		test = "  if("+"argc < "+argc+"){\n";
		test += "    cerr << \"Usage:./\" <<  argv[0] << "+"\""+arglist+"\""+" << endl;\n";
		test += "  return EXIT_FAILURE;\n";
		test += "  }\n\n";

		ExampleType example = factory.createExampleType();
		//example.setId("eg-listing");
		TitleType exampletitle = factory.createTitleType();
		FeatureMapUtil.addText(exampletitle.getMixed(), "A simple program "+serv.getName()+" example");
		example.setTitle(exampletitle);

		ProgramlistingType programlisting = factory.createProgramlistingType();
		programlisting.setLanguage("c");
		programlisting.setLinenumbering("numbered");

		FeatureMapUtil.addText(programlisting.getMixed(),head+test+prog+call+OutPut+end);
		example.setProgramlisting(programlisting);
		section.setExample(example);

	}
}
