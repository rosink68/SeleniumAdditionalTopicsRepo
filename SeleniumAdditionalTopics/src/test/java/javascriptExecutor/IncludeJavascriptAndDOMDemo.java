package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncludeJavascriptAndDOMDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// zum Ausführen von Javascript 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Alert/Hinweis mit einem OK-Button
		//jse.executeScript("alert('Hallo, ich heiße Lilly.')");
		
		// Dialog mit Eingabefeld und Ok- und Cancel-Button
		//jse.executeScript("prompt('What is your name?')");

		// Dialog mit Ok- und Cancel-Button
		jse.executeScript("confirm('Do you want to proceed?')");
	}

}
