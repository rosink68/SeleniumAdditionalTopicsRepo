package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSLCertificatesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Funktioniert NICHT, da die msg-Firewall das Öffnen von https://www.cacert.org/ abblocket!
		 */

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.cacert.org/");
	}
}
