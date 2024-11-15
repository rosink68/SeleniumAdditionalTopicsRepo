package takingScreenshotsUsingOutputTypeAsBytes;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshotsUsingOutputTypeAsBaseDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		File screenshotDestinationFile = new File(System.getProperty("user.dir") + "\\Screenshots\\TutorialsNinjaHomeAsBase64.png");
		
		FileOutputStream fos = new FileOutputStream(screenshotDestinationFile);
		
		fos.write(Base64.getDecoder().decode(base64Screenshot));
		
		System.out.println("Screenshot is taken successfully.");
		
		fos.close();
		
		driver.quit();
	}
}
