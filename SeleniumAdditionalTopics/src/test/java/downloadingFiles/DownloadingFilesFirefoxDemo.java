package downloadingFiles;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class DownloadingFilesFirefoxDemo {

	public static void main(String[] args) throws InterruptedException {

		// disable confirmation dialog

		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		
		// preference which is by default set to 1, need to be set to 2 by the automation code
		profile.setPreference("browser.download.folderList",2);
		
		// preference which is not shown by default, need to be 
		// set to the path at which you want to download the file to
		String downloadPath = System.getProperty("user.dir")+"\\DownloadsFilesHere";
		profile.setPreference("browser.download.dir",downloadPath);
		
		//preference need to be set the desired mime types (siehe auch https://wiki.selfhtml.org/wiki/MIME-Type/%C3%9Cbersicht)
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		
		options.setProfile(profile);

		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		
		driver.findElement(By.linkText("ZIP file")).click();
		
		//Give time to download
		Thread.sleep(3000);
				
		File file = new File(downloadPath+"\\DownloadDemo-master.zip");
				
		if(file.exists()) {

			System.out.println("ZIP file got successfully downloaded.");
					
		}else {
					
			System.out.println("ZIP file download got failed.");
		}
				
		driver.quit();
	}
}
