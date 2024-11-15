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

public class PageRefreshDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		WebElement dateField = driver.findElement(By.id("datepicker"));
		
		javaScriptPickDate(driver, dateField, "12/24/2024");
		
		// Refreshen der Webseite 
		javaScriptRefreshPage(driver);
	}


	public static void javaScriptRefreshPage(WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");		
	}

	public static void javaScriptDisplayAlert(WebDriver driver, String textOnAlert) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("alert('" + textOnAlert + "')");		
	}

	public static void javaScriptPickDate(WebDriver driver, WebElement element, String dateToBeTyped) {

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='" + dateToBeTyped + "';", element);		
	}

	public static void javaScriptTypeText(WebDriver driver, WebElement element, String textToBeTyped) {

		// mit WebDriver 
		//driver.findElement(By.name("search")).sendKeys("HP");
		
		// mit Javascript
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//document.getElementsByName('search')[0].value='HP'
		jse.executeScript("arguments[0].value='" + textToBeTyped + "';", element);		
	}

	public static void javaScriptGetPageURL(WebDriver driver) {

		// Ermitteln URL über WebDriver
		System.out.println("With WebDriver: " + driver.getCurrentUrl());
		
		// Ermitteln URL über Javascript
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println("With Javascript: " + jse.executeScript("return document.URL").toString());

	}

	public static void javaScriptGetPageTitle(WebDriver driver) {

		// Ermitteln Titel über WebDriver
		System.out.println("With WebDriver: " + driver.getTitle());
		
		// Ermitteln Titel über Javascript
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println("With Javascript: " + jse.executeScript("return document.title").toString());

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
