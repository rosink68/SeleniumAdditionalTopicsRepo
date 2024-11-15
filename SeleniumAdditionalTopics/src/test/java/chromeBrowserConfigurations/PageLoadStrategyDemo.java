package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategyDemo {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");

		// When this option is not set, Selenium will wait for the complete page to load before performing any actions on the page
		// EAGER means, Selenium performs actions while the page is still loading
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}
