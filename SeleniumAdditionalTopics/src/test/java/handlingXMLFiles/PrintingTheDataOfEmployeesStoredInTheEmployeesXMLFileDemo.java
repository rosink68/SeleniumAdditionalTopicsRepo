package handlingXMLFiles;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PrintingTheDataOfEmployeesStoredInTheEmployeesXMLFileDemo {

	public static void main(String[] args) throws Exception {
		
		// Representing the XML file
		String filePath = System.getProperty("user.dir") + "\\files\\EmployeeData.xml";
		File xmlFile = new File(filePath);

		// Steps to parse the XML file
		DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
		Document xmlDocument = documentBuilder.parse(xmlFile);

		// Retrieving the root (first) element of XML file 
		Element rootElement = xmlDocument.getDocumentElement();
		System.out.println(rootElement.getNodeName());
		System.out.println("---------------------------");
		
		if (rootElement.hasChildNodes()) {
			
			NodeList nodeList = rootElement.getChildNodes();
			int rootChildCount = nodeList.getLength();
			
			for (int i=0; i < rootChildCount; i++) {
				
				// wenn der Node ein Child node ist
				if (nodeList.item(i).getNodeType()==Node.ELEMENT_NODE) {
					
					System.out.println("------" + nodeList.item(i).getNodeName() + "------");
					
					// wenn der 1. Child node einen weiteren Child node hat 
					if (nodeList.item(i).hasChildNodes()) {
						
						NodeList childElementNodeList = nodeList.item(i).getChildNodes();
						
						int childCountUnderEmployeeNode = childElementNodeList.getLength();
						
						for (int j=0; j < childCountUnderEmployeeNode; j++) {
							
							// wenn der Node ein Child node ist
							if (childElementNodeList.item(j).getNodeType()==Node.ELEMENT_NODE) {

								// Name des Nodes
								String nodeName = childElementNodeList.item(j).getNodeName();
								// Wert des Nodes
								String nodeTextValue = childElementNodeList.item(j).getTextContent();
								
								System.out.println(nodeName + " = " + nodeTextValue);
							}
						}
					}
				}
			}

		}

	}
}
