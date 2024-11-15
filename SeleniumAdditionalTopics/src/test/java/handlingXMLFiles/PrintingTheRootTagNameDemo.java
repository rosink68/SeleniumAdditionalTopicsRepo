package handlingXMLFiles;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class PrintingTheRootTagNameDemo {

	public static void main(String[] args) throws Exception {
		
		String filePath = System.getProperty("user.dir") + "\\files\\EmployeeData.xml";
		File xmlFile = new File(filePath);

		// Parsing XML File

		DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();

		// parse = analysieren, auswerten, zergliedern, zerlegen
		Document xmlDocument = documentBuilder.parse(xmlFile);

		// das erste Element (Parent) vom XML-File ermitteln 
		Element rootElement = xmlDocument.getDocumentElement();
		
		String rootElementNodeName =	rootElement.getNodeName();
		
		System.out.println("Root Node name: " + rootElementNodeName);
	}
}
