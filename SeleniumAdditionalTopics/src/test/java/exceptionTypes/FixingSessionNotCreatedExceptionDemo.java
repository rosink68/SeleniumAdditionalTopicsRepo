package exceptionTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FixingSessionNotCreatedExceptionDemo {

	public static void main(String[] args) {
		
		/**
		 * This Exception occurs, when the Driver executable file version mismatches 
		 * the Browser Version (i.e. When things are incompatible)
		 * 
		 * ========================================================================================
		 * Ich glaube, dass ddiese Exception mit Wegfall des WebDriverManagers nicht mehr auftritt.
		 * ========================================================================================
		 *
		 */
		
		// Pfad zu einem alten Chrome Browser, dann würde SessionNotCreatedException geworden werden
		System.setProperty("webdriver.chrome.drive", "C:\\Tools\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
