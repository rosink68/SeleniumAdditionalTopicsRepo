package chromeBrowserConfigurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableWebNotificationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Funktioniert NICHT, da auch so keine Notification angezeigt wird!
		 * =================================================================
		 */
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.jabong.com/");
				
		//driver.quit();

	}
}
