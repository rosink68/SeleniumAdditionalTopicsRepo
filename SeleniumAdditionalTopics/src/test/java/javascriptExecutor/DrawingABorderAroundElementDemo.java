package javascriptExecutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DrawingABorderAroundElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		WebElement cartButton = driver.findElement(By.xpath("//div[@id='cart']/button"));
		javaScriptHighLightElementAndTakeScreenshot(driver, cartButton);
		
		driver.quit();
	}

	public static void javaScriptHighLightElementAndTakeScreenshot(WebDriver driver, WebElement element) {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//document.querySelector('div#cart > button').style.border="3px solid red"
		// den Button mit einer einfachen, roten Linie umranden 
		jse.executeScript("arguments[0].style.border='3px solid red';", element);

		// einen Screenshot mit rot umrandeten Button machen
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcFile, new File("./Screenshots/highlightedElement.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Rahmen entfernen
		jse.executeScript("arguments[0].style.border='';", element);

	}

	public static void javaScriptFlash(WebDriver driver, WebElement element) {
		
		// Initialfarbe vom cart-Button
		String defaultColor = element.getCssValue("background-color");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		// Wechsel der Buttonfarbe von schrwarz zu grün (15x)
		for(int i=1; i<30;i++) {

			//'div#cart > button' ist die CSS-Schreibweise für "//div[@id='cart']/button"
			//jse.executeScript("document.querySelector('div#cart > button').style.background='green'");
			// [0] = element
			jse.executeScript("arguments[0].style.background='green';", element);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			jse.executeScript("arguments[0].style.background='" + defaultColor + "';", element);
		}
		
	}


	public static void javaScriptClick(WebDriver driver, WebElement element) {
		
		// executeScript("arguments[0]", buttonElement,abc,xyz) kann mehrere Parameter haben 
		// [x] im 1.Parameter gibt die Position vom Argument an, welches genommen wird
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
		
	}

}
