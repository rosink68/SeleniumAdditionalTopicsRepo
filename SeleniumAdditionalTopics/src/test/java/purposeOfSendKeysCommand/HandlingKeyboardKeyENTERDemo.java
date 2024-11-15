package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardKeyENTERDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta1")).sendKeys("QAFox.com");
		
		Thread.sleep(2000);
		
		// Using chord method for performing the combination of keys
		// example: Using Ctrl+Z for removing the previously entered value 
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));	}
}
