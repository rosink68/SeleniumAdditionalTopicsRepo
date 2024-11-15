package firefoxBrowserConfigurations;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;

public class BrowserLogsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// to change the logging output to display in the console
//		FirefoxDriverService service =
//		        new GeckoDriverService.Builder().withLogOutput(System.out).build();

		// to change the logging output to save to a specific file
		File logLocation = new File(System.getProperty("user.dir") + "\\Logs\\firefox.log");
		FirefoxDriverService service =
		        new GeckoDriverService.Builder().withLogFile(logLocation).build();
		
		WebDriver driver = new FirefoxDriver(service);
		
		System.out.println("Before Logs");

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		System.out.println("After Logs");
	}
}
