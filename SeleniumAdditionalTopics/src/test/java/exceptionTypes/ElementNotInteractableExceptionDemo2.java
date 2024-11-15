package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableExceptionDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// hier wird die org.openqa.selenium.ElementNotInteractableException geworfen,
		// weil es 2 Elemente mit der class='' gibt und das 1. Element, was gefunden 
		// wird ein <td>-Attribut ist
		//driver.findElement(By.className("gsc-input")).sendKeys("Test");

		// Versuchen auf in einen versteckten Button zu klicken
		// ==> es wird eine org.openqa.selenium.ElementNotInteractableException geworfen
		driver.findElement(By.id("hbutton")).click();
	}
}
