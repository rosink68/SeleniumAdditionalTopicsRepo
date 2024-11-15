package solutionForAlertSendKeysNotWorking;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SolutionForAlertSendKeysNotWorkingDemo {

	public static void main(String[] args) {
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		Alert alert = driver.switchTo().alert();
		
		// bei sendKeys() in Alerts existiert im Chrome Browser ein Anzeigeproblem 
		// (in den anderen Browser nicht). Aber der eingetragene Wert wird trotzdem 
		// in das main Window übernommen.

		alert.sendKeys("===== XXXXXXXXXXXX =====");
		
		alert.accept();
	}
}
