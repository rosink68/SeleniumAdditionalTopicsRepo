package robotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadingAFileDemo {


	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");

		// eine Datei in die Clipboard/Zwischenablage kopieren <== entspricht CTRL+C
		// Parameter: Path mit der Datei, die ich uploaden will
		String path = System.getProperty("user.dir") + "\\Screenshots\\robotVisibleScreen.png";
		StringSelection stringSelection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);

		// nach dem Klick auf "Datei auswählen" öffnet sich der Dialog zum Auswählen einer Datei 
		// der normale WebDriver-Klick funktioniert nicht ==> InvalidArgumentException
		// driver.findElement(By.id("file-upload")).click();
		Actions actions = new Actions(driver);
		WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
		actions.moveToElement(chooseFileButton).click().build().perform();
		
		
		Robot robot = new Robot();
		robot.delay(2000);
		
		// Datei(pfad) aus der Zwischenablage in Dateiname einfügen <== entspricht CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(2000);

		// anstatt auf den "Öffnen" Button ENTER klicken
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.delay(2000);
		
		// Klick auf den Upload-Button
		driver.findElement(By.id("file-submit")).click();
		
	}
}
