package autoItWithSikuliX;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliXDemo2 {
	
	public static void main(String[] args) throws FindFailed {
		
		/**
		 * FUNKTIONIERT NICHT, da wahrscheinlich das Image nicht gematcht/gefunden wird
		 */

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Screen screen = new Screen();
		
		Pattern uploadButton = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\ChooseFileButton");
		Pattern fileNameTextBox = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\FileNameTextBox");
		Pattern openButton = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\OpenButton");
		
		//Code for scrolling to the bottom of the page
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		screen.wait(uploadButton, 10);
		
		screen.click(uploadButton);
		screen.type(fileNameTextBox,System.getProperty("user.dir")+"\\FileToUpload\\robot.png");
		screen.click(openButton);
		
	}
}
