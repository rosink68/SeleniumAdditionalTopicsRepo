package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");

		
		/*
		 * Wenn sich das erforderliche UI-Element in einem Iframe befindet und wir eine 
		 * Operation daran durchführen, ohne zum Iframe zu wechseln.
		 * 
		 * ==> es wird eine org.openqa.selenium.NoSuchElementException geworfen
		 */
		
		// Lösung: erst zum IFrame wechseln
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.id("tinymce")).clear();
	}
}
