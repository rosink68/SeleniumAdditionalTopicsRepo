package purposeOfSendKeysCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextareaFieldsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Typing text into Text Area field
		driver.findElement(By.id("ta1")).sendKeys(
				"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed "
				+ "diam nonumy eirmod tempor invidunt ut labore et dolore magna "
				+ "aliquyam erat, sed diam voluptua. At vero eos et accusam et "
				+ "justo duo dolores et ea rebum. Stet clita kasd gubergren, no "
				+ "sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem "
				+ "ipsum dolor sit amet, consetetur sadipscing elitr, sed diam "
				+ "nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam "
				+ "erat, sed diam voluptua. At vero eos et accusam et justo duo "
				+ "dolores et ea rebum. Stet clita kasd gubergren, no sea takimata "
				+ "sanctus est Lorem ipsum dolor sit amet.");
	}
}
