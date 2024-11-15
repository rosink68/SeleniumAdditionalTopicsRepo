package automationScriptsOnChromeHeadlessBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExecutingSeleniumAutomationScriptsOnChromeHeadlessBrowser {

	public static void main(String[] args) {
		
		/**
		 * "headless" bewirkt, dass das Programm ausgeführt wird, OHNE dass der
		 * Browser gestartet wird, d.h. OHNE Aufruf GUI so dass man keine Aktionen sieht
		 * (im Gegensatz zum Aufruf mit GUI (normal Mode), wo man die Aktionen verfolgen kann)
		 *
		 * Vorteile:
		 * - Tests will Run faster, resulting in better performance <== weil keine GUI geöffnet werden muss 
		 * - While our scripts are getting executed, we can do our other tasks as nothing will
		 * interrupt us <== Multitasking kann gemacht werden!!!
		 * 
		 * Nachteile:
		 * - We cannot see how the tests are getting executed
		 * - We won't get to know if something fails during the execution,as nothing is visible
		 */
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		System.out.println("Titel Webseite: " + driver.getTitle());
		
		driver.quit();
	}
}
