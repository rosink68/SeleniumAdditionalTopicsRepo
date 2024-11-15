import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {
	
	DocumentBuilder docBuilder;
	Document xmlDoc;
	
	public XMLReader(String xmlFilePath) {
		
		try {
			
			// Representing the XML file
			File xmlFile = new File(xmlFilePath);
			
			// Steps to parse the XML file
			docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			xmlDoc = docBuilder.parse(xmlFile);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	

	public List<Hashtable<String,String>> getDataAsList(String testName) {
		
		Node testNode = getNode(testName);
		
		NodeList dataNodes = testNode.getChildNodes();
		
		List<Hashtable<String,String>> list = new ArrayList<Hashtable<String,String>>();
		Hashtable<String,String> table = null;
		
		for(int i=0;i<dataNodes.getLength();i++) {
			
			table = new Hashtable<String,String>();
			
			Node dataNode = dataNodes.item(i);
			
			if(dataNode.getNodeType()==Node.ELEMENT_NODE) {
				
				NodeList dataList = dataNode.getChildNodes();
				
				for(int j=0;j<dataList.getLength();j++) {
					
					Node data = dataList.item(j);
					
					if(data.getNodeType()==Node.ELEMENT_NODE) {
										
						table.put(data.getNodeName(),data.getTextContent());
					}
				}
				
				list.add(table);
			}
		}
		
		return list;
	}
	
	
	public Node getNode(String nodeName) {
		
		Element rootNode = xmlDoc.getDocumentElement();
		NodeList testCasesList = rootNode.getChildNodes();
		Node returnNode=null;
		
		for(int i=0;i<testCasesList.getLength();i++) {
			
			Node tempNode = testCasesList.item(i);
			
			if(tempNode.getNodeType()==Node.ELEMENT_NODE) {
				
				if(nodeName.equals(tempNode.getNodeName())) {
					
					returnNode=tempNode;
					
				}
				
			}
			
			
		}
		
		return returnNode;
		
	}

}
