package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		// wenn im class-Locator mehrere Klassen mit Leerzeichen sind,
		// (Bsp. <input type="submit" value="Continue" class="btn btn-primary" />)
		// wird eine org.openqa.selenium.InvalidSelectorException geworfen
		// driver.findElement(By.className("btn btn-primary")).click();

		// Lösung 1: 
		// nur eine Klasse verwenden (wenn sie eindeutig ist)
		//driver.findElement(By.className("btn-primary")).click();

		// Lösung 2: 
		// einen CSS Selector verwenden und vor den beiden Klassen einen . machen
		//driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		// oder zusätzlich noch den Tag--Name benutzen
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
		// Lösung 3:
		// XPath zum Continue Button verwenden 
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();		
	}
}
