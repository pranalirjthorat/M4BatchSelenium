package ExtentsReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.DWsBaseClass;

public class SampleReport extends DWsBaseClass{
	@Test
	public void sample() {
		//1. create the extent spark reporter
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\ExtentReports\\NewExtentReport.html");
		//2. configure extent spark report
		spark.config().setDocumentTitle("functional testing");
		spark.config().setReportName("Money");
		spark.config().setTheme(Theme.DARK);
		//3. create the extent report 
		ExtentReports report = new ExtentReports();
		report.setSystemInfo("os", "windows-12");
		report.setSystemInfo("browser", "chrome-101");
		//4. attach the spark report to the extent report
		report.attachReporter(spark);
		//5. create the testScript
		ExtentTest test = report.createTest("Sample");
		//6. Flush the report
		report.flush();
	}
}
