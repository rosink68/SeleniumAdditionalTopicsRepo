package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingAnElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		WebElement cartButton = driver.findElement(By.xpath("//div[@id='cart']/button"));
		javaScriptFlash(driver, cartButton);
		
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
