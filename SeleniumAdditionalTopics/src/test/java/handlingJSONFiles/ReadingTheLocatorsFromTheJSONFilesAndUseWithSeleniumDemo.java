package handlingJSONFiles;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.else_clause_return;

import com.jayway.jsonpath.JsonPath;

public class ReadingTheLocatorsFromTheJSONFilesAndUseWithSeleniumDemo {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
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
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		objectToElement(myAccount_MenuObject).click();
		objectToElement(login_MenuOption).click();

		objectToElement(email_TextBox).sendKeys("Max.Mustermann@gmail.com");
		objectToElement(password_TextBox).sendKeys("max12345");
		objectToElement(login_Button).click();
		
		if (objectToElement(registerAffiliate_Link).isDisplayed()) {
			
			System.out.println("Login successful - User is able to login");
			
		} else {

			System.out.println("Login fail - User is unable to login");
		}
		
		Thread.sleep(1000);
		
		driver.quit();
	}
	
	public static WebElement objectToElement(Object object) {

		// Erzeugen von WebElemente

		WebElement element = null;
		
		String locatorTypeAndValue = object.toString();
		
		// Splitten des Strings <== ; ist das Trennzeichen in dem JSON File
		// Bsp: "LINK;My Account" ==> [0] = LINK und [1] = My Account
		String[] locatorArray = locatorTypeAndValue.split(";");
		String locatorType = locatorArray[0];
		String locatorValue = locatorArray[1];
		
		if (locatorType.equalsIgnoreCase("ID")) {
			
			element = driver.findElement(By.id(locatorValue));
			
		} else if (locatorType.equalsIgnoreCase("NAME")) {
			
			element = driver.findElement(By.name(locatorValue));
			
		} else if (locatorType.equalsIgnoreCase("CLASSNAME")) {
			
			element = driver.findElement(By.className(locatorValue));
			
		} else if (locatorType.equalsIgnoreCase("LINK")) {
			
			element = driver.findElement(By.linkText(locatorValue));
		
		} else if (locatorType.equalsIgnoreCase("CSS")) {
			
			element = driver.findElement(By.cssSelector(locatorValue));

		} else if (locatorType.equalsIgnoreCase("XPATH")) {
			
			element = driver.findElement(By.xpath(locatorValue));
		}
		
		return element;
	}
}
