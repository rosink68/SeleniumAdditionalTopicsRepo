package disablingTheInfoBarWarning;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablingTheInfoBarWarningDemo {

	public static void main(String[] args) {

	
		ChromeOptions options = new ChromeOptions();
		// Ausblenden der InfoBar "Chrome wird von automatisierter Testsoftware gesteuert."
		options.setExperimentalOption( "excludeSwitches",
				Collections.singletonList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.name("search")).sendKeys("iPhone");
        driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
	}
}
