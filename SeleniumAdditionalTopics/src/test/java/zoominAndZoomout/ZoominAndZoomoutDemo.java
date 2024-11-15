package zoominAndZoomout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominAndZoomoutDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// Zoomin to 200%
		jse.executeScript("document.body.style.zoom='200%';");

		Thread.sleep(3000);

		// Zoomout to 50%
		jse.executeScript("document.body.style.zoom='50%';");

		Thread.sleep(3000);
	
		// Default zoom level <== 100%
		jse.executeScript("document.body.style.zoom='100%';");		

		Thread.sleep(3000);
		
		driver.quit();
	}
}
