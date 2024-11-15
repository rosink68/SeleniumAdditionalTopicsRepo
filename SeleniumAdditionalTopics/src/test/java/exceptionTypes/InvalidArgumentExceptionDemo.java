package exceptionTypes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidArgumentExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// invalide URL OHNE http: oder https:
		// ==> es wird eine org.openqa.selenium.InvalidArgumentException geworfen
		//driver.get("www.tutorialsninja.com/demo/");

		// valide URL mit https...
		driver.get("https://tutorialsninja.com/demo/");
	}
}
