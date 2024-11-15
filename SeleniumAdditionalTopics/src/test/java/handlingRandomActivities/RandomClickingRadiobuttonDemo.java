package handlingRandomActivities;

import java.util.Arrays;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RandomClickingRadiobuttonDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://omayo.blogspot.com/");

		int numberOfRadioOptions = driver.findElements(By.xpath("//input[@name='gender']")).size();
		
		// Ermitteln einer Zufallszahl
		int randomNumber = generateRandomNumber(numberOfRadioOptions);
		
		System.out.println(randomNumber);

		//driver.findElement(By.xpath("//input[@id='radio" + randomNumber + "']")).click();
		// alternativ
		driver.findElement(By.xpath("(//input[@name='gender'])[" + randomNumber + "]")).click();
	}
	
	public static int generateRandomNumber(int number) {
		
		Random random = new Random();
		int rNum = random.nextInt(number);
		
		// für müssen +1 machen, da die Radiobuttons bei 1 beginnen & Random bei 0
		return ++rNum;
	}
}
