package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableInfoBarDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		// funktioniert so nicht ==> setExperimentalOption verwenden
//		options.addArguments("disable-infobars");
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
}
