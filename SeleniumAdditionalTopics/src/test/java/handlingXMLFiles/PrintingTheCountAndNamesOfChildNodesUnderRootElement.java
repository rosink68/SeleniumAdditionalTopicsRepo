package handlingXMLFiles;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrintingTheCountAndNamesOfChildNodesUnderRootElement {

	public static void main(String[] args) throws Exception {
		
		// Representing the XML file
		String filePath = System.getProperty("user.dir") + "\\files\\EmployeeData.xml";
		File xmlFile = new File(filePath);

		// Steps to parse the XML file
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
		Document xmlDocument = documentBuilder.parse(xmlFile);

		// Retrieving the root (first) element of XML file 
		Element rootElement = xmlDocument.getDocumentElement();
	
		NodeList nodeList = rootElement.getChildNodes();
		
		// Anzahl der child nodes
		int nodeCountUnderRootElement = nodeList.getLength();
		System.out.println("Nodes under rootelement: " + nodeCountUnderRootElement);
		// PROBLEM: getLength liefert nicht nur die Anzahl der Child nodes,
		// getLength zählt alle untschiedlichen Nodes (Parent node, Child nodes, Comments, Leerzeilen)
		

		// Print the element child nodes names which are under the root element
		if (rootElement.hasChildNodes()) {
			
			NodeList childNodeList = rootElement.getChildNodes();
			int childCount = 0;
			System.out.println("Child node list: ");
			for(int i=0; i < childNodeList.getLength(); i++) {
				
				if (childNodeList.item(i).getNodeType()==Node.ELEMENT_NODE) {
					
					System.out.println("Namen of the Child node: " + childNodeList.item(i).getNodeName());
					childCount++;
				}
			}
			
			System.out.println("Number of Child nodes under rootelement: " + childCount);
		}
	}
}
