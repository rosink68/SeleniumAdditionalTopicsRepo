package handlingCookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeletingAllTheCookiesOfPageDemo {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		// Einloggen
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("hans.huckbein@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);

		// Delete all the cookies
		driver.manage().deleteAllCookies();
		
		// wenn die Cookies gelöscht wurden und man die Webseite refresht,
		// wird nicht mehr die LoginPage sondern die HomePage angezeigt
		driver.navigate().refresh();
	}
}
