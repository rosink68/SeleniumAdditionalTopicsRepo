package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Uploading a file
		driver.findElement(By.id("uploadfile")).sendKeys(System.getProperty("user.dir")+"\\files\\Screenshot.png");
	}
}
