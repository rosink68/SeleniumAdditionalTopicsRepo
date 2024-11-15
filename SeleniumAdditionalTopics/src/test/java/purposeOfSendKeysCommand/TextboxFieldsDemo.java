package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxFieldsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Typing text into a text box field using sendKeys()
		driver.findElement(By.name("q")).sendKeys("QAFox.com");
	}
}
