package exceptionTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElementExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		
		/*
		 * für das erforderliche UI-Element wird ein falscher Locator angegeben
		 * 
		 * ==> es wird eine org.openqa.selenium.NoSuchElementException geworfen
		 */
		
		// invalider Locator: 
		// Suchen Button <== 'search' anstatt 'Search'
		//driver.findElement(By.xpath("//input[@value='search']")).click();
		// ID Textfeld <== "ta123' anstatt 'ta1' 
		//driver.findElement(By.id("Ta1"));

		// valider Locator: 
		// Suchen Button <== 'Search' mit großem S
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		// ID Textfeld <== 'ta1'  
		driver.findElement(By.id("ta1"));

		
		/*
		 * Das erforderliche UI-Element wird auf der Seite verzögert gerendert.
		 * D.h. die Aktion auf das Element soll ausgeführt werden, bevor das
		 * Element angezeigt wird. 
		 * 
		 * ==> es wird eine org.openqa.selenium.NoSuchElementException geworfen
		 */
		
		// Das DropDown wird nicht sofort nach Klick auf den DropDown Button geöffnet,
		// d.h. die Einträge vom DropDown werden nicht gleich angezeigt. Wird nun
		//  zu schnell auf den Eintrag 'Flipkart' zugegriffen, wird die Exception geworfen.
		driver.findElement(By.className("dropbtn")).click();
		
		// Lösung: Explizites Warten bis das WebElement sichtbar ist
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement flipCardOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		flipCardOption.click();
	}
}
