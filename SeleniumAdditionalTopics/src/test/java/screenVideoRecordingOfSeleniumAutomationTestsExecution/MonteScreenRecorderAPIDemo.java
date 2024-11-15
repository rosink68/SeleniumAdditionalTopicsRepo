package screenVideoRecordingOfSeleniumAutomationTestsExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonteScreenRecorderAPIDemo {
	
	public static void main(String[] args) throws Exception {
		
		// Starten der Aufnahme
		ScreenRecorderUtil.startRecord("main");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.name("search")).sendKeys("iPhone");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
        
		driver.close();
		
		// Stoppen der Aufnahme
		ScreenRecorderUtil.stopRecord();
	}
}
