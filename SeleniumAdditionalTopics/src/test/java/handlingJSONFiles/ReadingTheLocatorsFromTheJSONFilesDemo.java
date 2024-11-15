package handlingJSONFiles;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class ReadingTheLocatorsFromTheJSONFilesDemo {

	public static void main(String[] args) throws IOException {
		
		File jsonFile = new File(System.getProperty("user.dir")+"\\ObjectRepository\\LoginLocators.json");
		
		// Parsing the JSON File
		
		// Home Page
		// 1. Parameter: File aus dem die Werte gelesen werden; 2. Parameter: Wert, der gelesen wird
		Object myAccount_MenuObject = JsonPath.read(jsonFile, "$."+"Home_Page.MyAccount_Menu");
		Object register_MenuOption = JsonPath.read(jsonFile,"$."+"Home_Page.Register_MenuOption");
		Object login_MenuOption = JsonPath.read(jsonFile,"$."+"Home_Page.Login_MenuOption");
		
		// Login Page
		Object email_TextBox = JsonPath.read(jsonFile,"$."+"Login_Page.Email_TextBox");
		Object password_TextBox = JsonPath.read(jsonFile,"$."+"Login_Page.Password_TextBox");
		Object login_Button = JsonPath.read(jsonFile,"$."+"Login_Page.Login_Button");

		// Account Page
		Object registerAffiliate_Link = JsonPath.read(jsonFile,"$."+"Account_Page.RegisterAffiliate_Link");
		
		// Ausgeben der Werte der jeweiligen Variable 
		System.out.println(myAccount_MenuObject);
		System.out.println(register_MenuOption);
		System.out.println(login_MenuOption);
		System.out.println(email_TextBox);
		System.out.println(password_TextBox);
		System.out.println(login_Button);
		System.out.println(registerAffiliate_Link);
	}
}
