package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectionBoxFieldsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Selecting only ONE option in the multi selection box field
		driver.findElement(By.id("multiselect1")).sendKeys("Volvo");	
	}
}
