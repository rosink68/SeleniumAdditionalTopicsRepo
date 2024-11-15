package chromeBrowserConfigurations;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchASpecificProfileDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Funktioniert nicht, weil der Profilpfad beim Öffnen der Chrome Browsers immer neu erstellt wird.
		 * 
		 * Bsp. C:\Users\rosink\AppData\Local\Temp\scoped_dir23504_697257232\Default
		 */
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", 
				Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");
		options.addArguments("user-datadir=C:\\Users\\rosink\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 5\\");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
	}
}
