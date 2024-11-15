package viewElementByScrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewElementByScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		// Scrollen der Seite, bis "My Button" sichtbar ist
		WebElement myButton = driver.findElement(By.id("myBtn"));

		// 1. Paramater: auszuführendes Script <== arguments[0] = 1. Element nach Komma
		// 2. Parameter: WebElement
		jse.executeScript("arguments[0].scrollIntoView(true);", myButton);
		
		Thread.sleep(3000);

		driver.close();
	}
}
