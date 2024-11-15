package firefoxBrowserConfigurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class HandlingSSLCertificatesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Funktioniert NICHT, da die msg-Firewall das Öffnen von https://www.cacert.org/ abblocket!
		 */
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile2 = allProfiles.getProfile("Profil2");
		
		// die beiden Zeilen sorgen eigentlich dafür, dass die Webseite
		// https://www.cacert.org/ trotz fehlendem Zertifikats geöffnet wird
		profile2.setAcceptUntrustedCertificates(true);
		profile2.setAssumeUntrustedCertificateIssuer(false);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
				
		//driver.quit();

	}
}
