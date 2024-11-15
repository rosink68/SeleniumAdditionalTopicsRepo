package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// mit WebDriver: Klick auf ClickToGetAlert-Button
		//driver.findElement(By.id("alert1")).click();
		
		
		// mit Javascript 
		
		// 1. Möglichkeit: direkt mit DOM-Statement
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementById('alert1').click();");

		// 2. Möglichkeit: Kombination WebElement und DOM-Statement
		WebElement button = driver.findElement(By.id("alert1"));
		javaScriptClick(driver, button);
	}

	public static void javaScriptClick(WebDriver driver, WebElement element) {
		
		// executeScript("arguments[0]", buttonElement,abc,xyz) kann mehrere Parameter haben 
		// [x] im 1.Parameter gibt die Position vom Argument an, welches genommen wird
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
		
	}
}
