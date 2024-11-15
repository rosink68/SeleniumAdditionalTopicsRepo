package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickInterceptedExceptionDemo {

	public static void main(String[] args) {
		
		/**
		 * Diese Ausnahme tritt auf, wenn andere UI-Elemente das anzuklickende 
		 * UI-Element während der Selenium-Automatisierung verbergen.
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("blogsmenu")).click();
		
		// wenn auf "blogs" geklickt wird, öffnet sich ein DropDown, welches den Link 
		// http://www.Selenium143.blogspot.com überdeckt, d.h. der Link ist nicht klickbar.
		// ==> es wird eine org.openqa.selenium.ElementClickInterceptedException geworfen
		driver.findElement(By.id("selenium143")).click();
	}
}
