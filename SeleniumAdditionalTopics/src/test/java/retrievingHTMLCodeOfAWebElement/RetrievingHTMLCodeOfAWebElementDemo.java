package retrievingHTMLCodeOfAWebElement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingHTMLCodeOfAWebElementDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		WebElement alertButton = driver.findElement(By.id("alert1"));

		// ermitteln des HTML-Codes vom ClickToGetAlert Button
		@Nullable
		String htmlCodeOfGivenWebElement = alertButton.getAttribute("outerHTML");
		System.out.println(htmlCodeOfGivenWebElement);
		
		driver.close();
	}
}
