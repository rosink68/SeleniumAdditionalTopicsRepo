package exceptionTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// wenn die Syntax des XPath inkorrekt ist (z. Bsp. 2x]] nach 'Search'),
		// wird eine org.openqa.selenium.InvalidSelectorException geworfen
		driver.findElement(By.xpath("//input[@value='Search']]")).click();

		// korrekte Syntax für den XPath zum den Suchen Button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
}
