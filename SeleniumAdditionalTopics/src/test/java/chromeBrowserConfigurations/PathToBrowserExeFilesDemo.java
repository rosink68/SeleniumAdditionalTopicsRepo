package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PathToBrowserExeFilesDemo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");

		// Pfad zum Chromebrowser
		// greift nur, wenn Chrome nicht startet 
		options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		
		Thread.sleep(1000);
		
		driver.quit();

	}
}
