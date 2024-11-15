package handlingXMLFiles;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Jeder Knoten wird durch einen numerischen Wert repräsentiert:
 * siehe https://www.w3schools.com/XML/dom_nodetype.asp
 * 
 * NodeType	Named Constant
 * 1		ELEMENT_NODE
 * 2		ATTRIBUTE_NODE
 * 3		TEXT_NODE
 * 4		CDATA_SECTION_NODE
 * 5		ENTITY_REFERENCE_NODE
 * 6		ENTITY_NODE
 * 7		PROCESSING_INSTRUCTION_NODE
 * 8		COMMENT_NODE
 * 9		DOCUMENT_NODE
 * 10		DOCUMENT_TYPE_NODE
 * 11		DOCUMENT_FRAGMENT_NODE
 * 12		NOTATION_NODE
 */
public class NodesAndNumericalRepresentationDemo {

	public static void main(String[] args) throws Exception {
	
		System.out.println("Number representing document node is: " + Node.DOCUMENT_NODE); // 9
		System.out.println("Number representing element node is: " + Node.ELEMENT_NODE); // 1
		System.out.println("Number representing text node is: " + Node.TEXT_NODE); // 3
		System.out.println("Number representing attribute node is: " + Node.ATTRIBUTE_NODE); // 2
		System.out.println("Number representing comment node is: " + Node.COMMENT_NODE); // 8
		System.out.println("-------------------------------------------------");
		
		// ------------------------- Beispiel EmployeeData.xml ----------------------
		
		String filePath = System.getProperty("user.dir") + "\\files\\EmployeeData.xml";
		File xmlFile = new File(filePath);

		DocumentBuilder documentBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
		Document xmlDocument = documentBuilder.parse(xmlFile);

		// das erste Element (Parent) vom XML-File ermitteln 
		Element rootElement = xmlDocument.getDocumentElement();
		Short noteType = rootElement.getNodeType();
		System.out.println("Node type of root element: " + noteType);
		
		if (noteType==Node.ELEMENT_NODE) {
			
			System.out.println("Root element is an element node.");
			
		} else if (noteType==Node.DOCUMENT_NODE) {
			
			System.out.println("Root element is a document node.");
			
		} else if (noteType==Node.ATTRIBUTE_NODE) {
			
			System.out.println("Root element is an attribute node.");
			
		} else if (noteType==Node.COMMENT_NODE) {
			
			System.out.println("Root element is a comment node.");
			
		} else if (noteType==Node.TEXT_NODE) {
			
			System.out.println("Root element is a text node.");
		}
	}
}
