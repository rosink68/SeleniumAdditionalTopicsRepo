package firefoxBrowserConfigurations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class LaunchASpecificProfileDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile2 = allProfiles.getProfile("Profil2");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);

		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		
		Thread.sleep(1000);
		
//		driver.quit();

	}
}
