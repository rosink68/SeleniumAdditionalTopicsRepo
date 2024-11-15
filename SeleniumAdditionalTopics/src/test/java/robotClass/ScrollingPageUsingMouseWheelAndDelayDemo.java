package robotClass;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageUsingMouseWheelAndDelayDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Robot robot = new Robot();
		
		// Paramater: wie viel das Mausrad gedreht werden soll
		// positiver Wert: scroll down
		robot.mouseWheel(15);
		
		// Robot.delay() ist eine Alternative für Thread.sleep(2000)
		robot.delay(2000);
		
		// negativer Wert: scroll up
		robot.mouseWheel(-8);
	}
}
