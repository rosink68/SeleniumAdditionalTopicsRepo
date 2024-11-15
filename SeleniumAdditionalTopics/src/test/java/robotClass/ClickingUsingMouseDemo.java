package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingUsingMouseDemo {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// die Maus zum Link bewegen und draufklicken
		
		Robot robot = new Robot();

		robot.mouseMove(300, 380); // Kordinaten ausprobiert
		
		// für den Mausklick benutzt man InputEvent NICHT KeyEvent
		// BUTTON1 ist für Linksklick
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
