package takingScreenshotsUsingOutputTypeAsBytes;

import java.io.File;
import java.io.FileOutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotsUsingOutputTypeAsBytesDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		byte[] byteArrayScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		File screenshotDestinationFile = new File(System.getProperty("user.dir") + "\\Screenshots\\TutorialsNinjaHomeAsBytes.png");
		
		FileOutputStream fos = new FileOutputStream(screenshotDestinationFile);
		
		fos.write(byteArrayScreenshot);
		
		System.out.println("Screenshot is taken successfully.");
		
		fos.close();
		
		driver.quit();
	}
}
