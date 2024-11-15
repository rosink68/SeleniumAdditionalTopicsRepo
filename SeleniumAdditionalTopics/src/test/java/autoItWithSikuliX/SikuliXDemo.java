package autoItWithSikuliX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliXDemo {

	public static void main(String[] args) throws Exception {
		
		/**
		 * FUNKTIONIERT NICHT, da wahrscheinlich das Image nicht gematcht/gefunden wird
		 */
		
		// Sikuli führt den Test anhand von Bildern aus (Bilderkennung), d.h. von dem jeweiligen 
		// Element auf der Webseite wird ein PNG-erstellt & darauf die Aktion ausgeführt 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Screen screen = new Screen();

		// sikuli does not automatically detect the root folder of the project ==> for this case is specify the folder using 
		// the command System.getProperty("user.dir") ==> ansonsten bekommt man "[error] ImagePath: find: not there:" 
		
		Pattern myAccountOption = new Pattern(System.getProperty("user.dir") + "\\ImageFiles\\MyAccountImage.png");
		Pattern loginOption = new Pattern(System.getProperty("user.dir") + "\\ImageFiles\\LoginImage.png");
		Pattern emailField = new Pattern(System.getProperty("user.dir") + "\\ImageFiles\\EmailAddressImage.png");
		Pattern passwordField = new Pattern(System.getProperty("user.dir") + "\\ImageFiles\\PasswordImage.png");
		Pattern loginButton = new Pattern(System.getProperty("user.dir") + "\\ImageFiles\\LoginButtonImage.png");

		screen.wait(myAccountOption, 30);
		
		screen.click(myAccountOption);
		screen.click(loginOption);
		screen.type(emailField, "Max.Mustermann@gmail.com");
		screen.type(passwordField, "max12345");
		screen.click(loginButton);
	}

}
