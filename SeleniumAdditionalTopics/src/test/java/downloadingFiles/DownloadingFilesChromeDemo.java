package downloadingFiles;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class DownloadingFilesChromeDemo {

	public static void main(String[] args) throws InterruptedException {

		// Download File in Folder DownloadsFilesHere und nicht in den 
		// default Download Folder (Explorer)
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String,Object> preferences = new HashMap<String,Object>();
		
		// optional: preference needs to be set to 0
		preferences.put("profile.default_content_settings.popups",0);

		// preference needs to be set to the Download path
		String downloadPath = System.getProperty("user.dir")+"\\DownloadsFilesHere";
		preferences.put("download.default_directory",downloadPath);
		
		options.setExperimentalOption("prefs", preferences);
		
		WebDriver driver = new ChromeDriver(options);
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
