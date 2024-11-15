package firefoxBrowserConfigurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PathToBrowserExeFilesDemo {

	public static void main(String[] args) throws InterruptedException {

		FirefoxOptions options = new FirefoxOptions();
		// Pfad zum Firefoxbrowser
		// greift nur, wenn Firefox nicht startet 
		options.setBinary("C:\\Program Files\\Firefox Developer Edition\\firefox.exe");
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		
		Thread.sleep(1000);
		
		driver.quit();

	}
}
