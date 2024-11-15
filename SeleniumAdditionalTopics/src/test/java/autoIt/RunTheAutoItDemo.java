package autoIt;

import java.io.IOException;

public class RunTheAutoItDemo {

	public static void main(String[] args) throws IOException {
		
		// Ausführen SciTe erstellten AutoIt-Skripts
		
		String autoItScriptFilePath = System.getProperty("user.dir") + "\\AutoItScripts\\AutoItScriptDemo.exe";
		String titleOnBox = "Selenium 4";
		String messageOnBox = "Welcome to Selenium 4 Training!";
		
		String[] cmd = {autoItScriptFilePath,titleOnBox,messageOnBox};
		Runtime.getRuntime().exec(cmd);
	}
}
