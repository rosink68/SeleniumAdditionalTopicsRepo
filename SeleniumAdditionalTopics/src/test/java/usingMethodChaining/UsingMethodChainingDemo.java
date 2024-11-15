package usingMethodChaining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMethodChainingDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		/*
		 * chaining = Verkettung (von Befehlen)
		 */
		
		// Öffnen und Maximieren des Browsers
//		Options options = driver.manage();
//		Window window = options.window();
//		window.maximize();
		
		// verkürzte Schreibweise
		driver.manage().window().maximize();
	}
}
