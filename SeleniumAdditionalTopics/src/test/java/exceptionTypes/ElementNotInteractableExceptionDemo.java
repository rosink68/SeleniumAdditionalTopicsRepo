package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		// Versuchen Text in ein Attribut einzugeben, wo kein Text eingegeben werden kann
		// (z. Bsp. in dem Kasten (<form>) um E-Mail-Adress & Password
		// ==> es wird eine org.openqa.selenium.ElementNotInteractableException geworfen
		//driver.findElement(By.xpath("//form[@action='https://tutorialsninja.com/demo/index.php?route=account/login']")).sendKeys("Test");

		// Versuchen Text in die <h2>-Überschrift 'Returning Customer' einzufügen
		// ==> es wird eine org.openqa.selenium.ElementNotInteractableException geworfen
		driver.findElement(By.xpath("//h2[text()='Returning Customer']")).sendKeys("Test");
	}
}
