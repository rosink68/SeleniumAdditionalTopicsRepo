package exceptionTypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchSessionExceptionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		driver.close();
		
		// Versuchen eine Aktion zu machen, nachdem die Session geschlossen wurde
		// es wird eine org.openqa.selenium.NoSuchSessionException geworfen
		driver.getTitle();
	}
}
