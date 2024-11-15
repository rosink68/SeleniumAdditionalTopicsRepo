package autoIt;

import java.io.File;

public class DownloadingFileDemo {

	public static void main(String[] args) throws Exception {

		// Ausführen eines AutoIt-Skripts zum Downloaden einer Datei 

		String autoItScriptFilePath = System.getProperty("user.dir") + "\\AutoItScripts\\FileDownloadDemo.exe";
		String downloadedFilePath = System.getProperty("user.dir") + "\\DownloadsFilesHere\\LambdaTest.txt";
		String fileURLPath = "https://the-internet.herokuapp.com/download/LambdaTest.txt";

		String[] cmd = {autoItScriptFilePath,downloadedFilePath,fileURLPath};

		Runtime.getRuntime().exec(cmd);
		
		Thread.sleep(5000);
		
		File file = new File(downloadedFilePath);
		if (file.exists()) {
			
			System.out.println("File got successfully downloaded.");
		}
	}
}
