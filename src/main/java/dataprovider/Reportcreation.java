package dataprovider;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
@Test
public class Reportcreation {

	public void extentReport() throws IOException {

		ExtentHtmlReporter html = new ExtentHtmlReporter(new File("./reports/result.html"));
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC001_MergeLead","Merge lead combine");
		test.assignAuthor("MukeshPlayboy");
		test.assignCategory("Regression");
		test.pass("User id entered", MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/Snap1.jpeg").build());
		test.pass("password entered",MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/Snap10.jpeg").build());
		test.pass("Login clicked",MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/Snap4.jpeg").build());
		extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		extent.flush();



	}

}
