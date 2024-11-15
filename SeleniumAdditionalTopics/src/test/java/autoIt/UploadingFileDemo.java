package autoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadingFileDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		// auf den "Datei auswählen" Button klicken
		WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
		// chooseFileButton.click(); <== funktioniert nicht
		
		
		Actions actions = new Actions(driver);
		
		// Maus auf den "Datei auswählen" Button bewegen und klicken
		actions.moveToElement(chooseFileButton).click().build().perform();
		
		Thread.sleep(3000);
		
		// Ausführen eines AutoIt-Skripts zum Auswählen einer Datei aus dem Zwischendialog "Datei"
		String autoItScriptFilePath = System.getProperty("user.dir") + "\\AutoItScripts\\FileUploadDemo.exe";
		String fileToBeUploadedPath = System.getProperty("user.dir") + "\\FileToUpload\\robot.png";
		
		String[] cmd = {autoItScriptFilePath,fileToBeUploadedPath};

		// C:\Users\rosink\eclipse-workspace-SeleniumAdditionalTopics\SeleniumAdditionalTopics\Screenshots\robotVisibleScreen.png
		Runtime.getRuntime().exec(cmd);
	}
}
