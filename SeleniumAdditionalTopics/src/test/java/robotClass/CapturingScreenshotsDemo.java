package robotClass;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshotsDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		
		Robot robot = new Robot();

		// Screenshot von einem bestimmten Bildschirmausschnitt machen
		
		// x-Koordinate, y-Koordinate, Weite, Höhe
		Rectangle rectangle = new Rectangle(25, 50, 1000, 300);
		BufferedImage srcImage = robot.createScreenCapture(rectangle);
		ImageIO.write(srcImage, "PNG", new File("./Screenshots/robotRectangle.png"));

		// Robot.delay() ist eine Alternative für Thread.sleep(2000)
		robot.delay(2000);

		// Screenshot vom sichtbaren Bildschirm machen
		
		// Größe des sichtbaren Teils des Screens
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle2 = new Rectangle(dimension);
		BufferedImage srcImage2 = robot.createScreenCapture(rectangle2);
		ImageIO.write(srcImage2, "PNG", new File("./Screenshots/robotVisibleScreen.png"));
		
		
	}
}
