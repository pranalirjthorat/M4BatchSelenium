package com.crm.Listerners;

	import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class SSDWSListerner implements ITestListener{
		WebDriver driver = null;
		public static ExtentSparkReporter spark;
		 public static ExtentReports report;
		 public static ExtentTest test;
		 
		 @Override
			public void onTestStart(ITestResult result) {
				String name = result.getMethod().getMethodName();
				test = report.createTest(name);	
			}
			
		 @Override
			public void onTestSuccess(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.PASS, "assertion is success");
			test.log(Status.INFO, name+"is success");
			}
		 
		 @Override
			public void onTestFailure(ITestResult result) {
			 String name = result.getMethod().getMethodName();
			 TakesScreenshot ts =(TakesScreenshot)driver;
			String from = ts.getScreenshotAs(OutputType.BASE64);
			test.addScreenCaptureFromBase64String(from);
			
			
				test.log(Status.FAIL, "assertion is Failed");
				test.log(Status.INFO, name+"is Failed");
			}
			
			@Override
			public void onTestSkipped(ITestResult result) {
				String name = result.getMethod().getMethodName();
				test.log(Status.SKIP, "assertion is Skipped");
				test.log(Status.INFO, name+"is Skipped");
			}
			
			@Override
			public void onStart(ITestContext result) {
				spark = new ExtentSparkReporter(".\\ExtentReports\\ExtentsReport.html");
				spark.config().setDocumentTitle("functional testing");
				spark.config().setDocumentTitle("Pranali");
				spark.config().setTheme(Theme.DARK);
				
				ExtentReports report = new ExtentReports();
				report.setSystemInfo("os", "windows-11");
				report.setSystemInfo("browser", "Chrome-101");
				report.attachReporter(spark);
				ExtentTest test = report.createTest("sampleTest");
				report.flush();
			}
	}


