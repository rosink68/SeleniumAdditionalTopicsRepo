package robotClass;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoveringMouseUsingMouseMoveDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		// wenn die Maus über "Blogs" bewegt wird, wird Blogs highlighted und es öffnet sich ein Popup
		
		Robot robot = new Robot();
		
		// x- und y-Koordinate der Maus
		robot.mouseMove(260, 320); // Kordinaten ausprobiert
		
		
	}
}
