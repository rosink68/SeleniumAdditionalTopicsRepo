package firefoxHeadlessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadlessBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxOptions options = new FirefoxOptions();
		
		// headless bedeutet: OHNE den Browser (GUI) zu öffnen
		options.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}
}
