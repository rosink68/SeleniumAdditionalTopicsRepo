package handlingToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingToolTipDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// Retrieving tooltip <== der Tooltip ist der Value vom "Title"-Attribute

		String tooltipSearchButton = driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getAttribute("title");
		System.out.println("Tooltip vom Suchen-Button: " + tooltipSearchButton);

		String tooltipSearchField = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println("Tooltip vom Suchfeld: " + tooltipSearchField);

		driver.quit();
	}
}
