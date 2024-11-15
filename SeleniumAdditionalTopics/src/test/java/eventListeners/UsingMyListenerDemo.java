package eventListeners;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;


public class UsingMyListenerDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver webDriver = new ChromeDriver();
		
		WebDriverListener listener = new MyListener();
		WebDriver  driver = new EventFiringDecorator<WebDriver>(listener).decorate(webDriver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		WebElement searchBoxField = driver.findElement(By.name("q"));
		searchBoxField.sendKeys("QAFox - Arun Motoori");
		searchBoxField.clear();
		searchBoxField.sendKeys("AAAAAAAAAAAAAAAAAAAAA");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("alert1")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		driver.switchTo().defaultContent();
		
		
		driver.navigate().refresh();
		
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("history.go(0)", "");
		
		
		String text = driver.findElement(By.id("pah")).getText();
		System.out.println("========= Text from element with the id 'pah': " + text + "=========");
		
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		driver.close();
		driver.switchTo().window(mainWindow);
		
		
		// hierfür gibt es keina Action mehr
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("Screenshots\\screenshot1.png"));
		
		
		driver.findElement(By.linkText("jqueryui")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		
		// Error erzeugen
		try {
			driver.findElement(By.id("daisfhuskyhfs"));
			
		} catch (Exception e) {
			
			System.out.println("Exception occured");
		}
		
		
		driver.quit();
	}
}
