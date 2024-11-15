package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowserMaximizedDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));

		// entspricht driver.manage().window().maximize();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo/");
	}
}
