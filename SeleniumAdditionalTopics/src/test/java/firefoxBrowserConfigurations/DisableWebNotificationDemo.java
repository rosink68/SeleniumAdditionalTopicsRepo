package firefoxBrowserConfigurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class DisableWebNotificationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Funktioniert NICHT, da auch so keine Notification angezeigt wird!
		 * =================================================================
		 */
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile2 = allProfiles.getProfile("Profil2");
		profile2.setPreference("dom.webnotifications.enabled", false);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.jabong.com/");
				
		//driver.quit();

	}
}
