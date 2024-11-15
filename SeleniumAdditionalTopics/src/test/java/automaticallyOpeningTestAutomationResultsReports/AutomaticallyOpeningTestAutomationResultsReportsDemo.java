package automaticallyOpeningTestAutomationResultsReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomaticallyOpeningTestAutomationResultsReportsDemo {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extent = new ExtentReports();
		
		File file = new File(System.getProperty("user.dir") + "\\extentReports\\eReport.html");

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		
		extent.attachReporter(sparkReporter);
		
		// Report wird erzeugt
		extent.flush();
		
		
		// den erzeugten Report automatisch im Browser öffnen
		Desktop.getDesktop().browse(file.toURI());
	}
}
