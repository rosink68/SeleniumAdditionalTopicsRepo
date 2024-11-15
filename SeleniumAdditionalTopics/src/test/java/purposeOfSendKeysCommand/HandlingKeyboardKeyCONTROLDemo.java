package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardKeyCONTROLDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("Max.Mustermann@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("max12345");
		// anstatt des Login Buttons zu klicken ==> ENTER drücken
		driver.findElement(By.cssSelector("input[value='Login']")).sendKeys(Keys.ENTER);
	}
}
