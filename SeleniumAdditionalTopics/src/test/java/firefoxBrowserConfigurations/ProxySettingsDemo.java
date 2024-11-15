package firefoxBrowserConfigurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class ProxySettingsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile2 = allProfiles.getProfile("Profil2");
		
		// für http://www.tutorialsninja.com/demo/ erfolgt der Zugriff OHNE Proxy-Server, wenn man
		// nun welche setzt, bricht der Aufruf der Seite (Connection) mit Timeout ab
		profile2.setPreference("network.proxy.type", 1);
		profile2.setPreference("network.proxy.http","192.168.30.3");
		profile2.setPreference("network.proxy.http_port",9193);
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
	}
}
