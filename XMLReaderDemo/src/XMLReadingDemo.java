import java.util.Hashtable;
import java.util.List;

public class XMLReadingDemo {
	
	public static void main(String[] args) {
		
		String xmlFilePath = System.getProperty("user.dir")+"\\files\\TestData.xml";
		
		// lesen und parsen der XML Files
		XMLReader xmlReader = new XMLReader(xmlFilePath);
		
		
		System.out.println("--------------------------------- LoginTest ---------------------------------");
		
		// die Child nodes in eine Liste speichern
		List<Hashtable<String, String>> listDataLoginTest = xmlReader.getDataAsList("LoginTest");
		
		System.out.println(listDataLoginTest);
		
		// Schliefe über die Child nodes
		for(int i=0;i<listDataLoginTest.size();i++) {
			
			// in jedem Array-Element ist eine HashTabl
			Hashtable<String, String> table = listDataLoginTest.get(i);
		     
			System.out.println("Runmode is " + table.get("Runmode"));
			System.out.println("Browser is " + table.get("Browser"));
			System.out.println("Username is " + table.get("Username"));
			System.out.println("Password is " + table.get("Password"));
			System.out.println("ExpectedResult is " + table.get("ExpectedResult"));
			System.out.println("----------------------------------");	 
		}
		
		System.out.println(listDataLoginTest.get(1).get("Browser"));

		System.out.println();
		
		System.out.println("--------------------------------- ForgotPasswordTest ---------------------------------");
		
		// die Child nodes in eine Liste speichern
		List<Hashtable<String, String>> listDataForgotPasswordTest = xmlReader.getDataAsList("ForgotPasswordTest");
		
		System.out.println(listDataForgotPasswordTest);
		
		// Schliefe über die Child nodes
		for(int i=0;i<listDataForgotPasswordTest.size();i++) {
			
			// in jedem Array-Element ist eine HashTabl
			Hashtable<String, String> table = listDataForgotPasswordTest.get(i);
		     
			System.out.println("Runmode is " + table.get("Runmode"));
			System.out.println("Browser is " + table.get("Browser"));
			System.out.println("Email is " + table.get("Email"));
			System.out.println("ExpectedResult is " + table.get("ExpectedResult"));
			System.out.println("----------------------------------");	 
		}
		
		System.out.println(listDataForgotPasswordTest.get(1).get("Browser"));

	}	
}