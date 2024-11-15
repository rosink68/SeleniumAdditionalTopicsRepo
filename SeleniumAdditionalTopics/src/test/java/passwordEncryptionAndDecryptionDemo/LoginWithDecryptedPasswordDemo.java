package passwordEncryptionAndDecryptionDemo;

import java.util.Arrays;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginWithDecryptedPasswordDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("Anna.Karanina@gmail.com");
		
		// Passwort en. und decrypten
		String decryptedPassword = returnDecryptedPassword("YW5uYTEyMzQ1");
		driver.findElement(By.id("input-password")).sendKeys(decryptedPassword);
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
	}

	public static String returnDecryptedPassword(String encryptedPassword) {
		
		byte[] decryptedPasswordInBytes = Base64.getDecoder().decode(encryptedPassword);
		
		String decryptedPasswordInText = new String(decryptedPasswordInBytes);

		return decryptedPasswordInText;
	}
}
