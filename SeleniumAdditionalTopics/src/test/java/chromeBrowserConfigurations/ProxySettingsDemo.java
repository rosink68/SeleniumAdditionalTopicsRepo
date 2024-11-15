package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySettingsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");
		
		// für http://www.tutorialsninja.com/demo/ erfolgt der Zugriff OHNE Proxy-Server, wenn man
		// nun welche setzt, bricht der Aufruf der Seite mit "Die Website ist nicht erreichbar" ab
		options.addArguments("--proxy-server=http://192.168.303.3:9293");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.tutorialsninja.com/demo/");
	}
}
