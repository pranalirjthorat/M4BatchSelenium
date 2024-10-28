package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.crm.FileUtility.PropertieFile;

public class Vtiger_TestCases {

	public WebDriver driver;
	
	@BeforeClass
	public void precondition() throws IOException {
		String browser = PropertieFile.property("browser");
		String url = PropertieFile.property("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		if(browser.equalsIgnoreCase("edge"))
		{
			driver = new ChromeDriver();
			
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
	}
}
