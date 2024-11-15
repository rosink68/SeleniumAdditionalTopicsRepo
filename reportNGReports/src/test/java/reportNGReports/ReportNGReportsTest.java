package reportNGReports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportNGReportsTest {

	@Test
	public void sampleSeleniumCode() throws Exception {
		
		Reporter.log("Test execution started.");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome Browser launched.");

		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Reporter.log("Navigated to application URL.");

		// Taking the Screenshot
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
		
		Thread.sleep(3000);
		
		driver.close();
		Reporter.log("Test execution completed.");

		System.setProperty("org.uncommons.reportng.escape-output","false");

		// Anzeigen Link im Report
		//Reporter.log("<a ref=\"C:\\Users\\rosink\\eclipse-workspace-SeleniumAdditionalTopics\\reportNGReports\\screenshots\\screenshot1.png\">Screenshot</a>");

		// Image direkt im Report anzeigen
		Reporter.log("<img src=\"C:\\Users\\rosink\\eclipse-workspace-SeleniumAdditionalTopics\\reportNGReports\\screenshots\\screenshot1.png\"/>");
	}
}
