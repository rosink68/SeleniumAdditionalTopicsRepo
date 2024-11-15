package chromeBrowserConfigurations;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BrowserLogsDemo {

	public static void main(String[] args) throws InterruptedException {

		// Consolenausgabe funktioniert so nicht
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
//		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, System.getProperty("user.dir") + "\\Logs\\chrome.log");
//		WebDriverManager.chromedriver().setup();

		// to change the logging output to display in the console
//		ChromeDriverService service =
//		        new ChromeDriverService.Builder().withLogOutput(System.out).build();
		
		// to change the logging output to save to a specific file
		// Alternative zu System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, System.getProperty("user.dir") + "\\Logs\\chrome.log");
		File logLocation = new File(System.getProperty("user.dir") + "\\Logs\\chrome.log");
		ChromeDriverService service =
		        new ChromeDriverService.Builder().withLogFile(logLocation).build();
		
		WebDriver driver = new ChromeDriver(service);
		
//		WebDriver driver = new ChromeDriver();
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
