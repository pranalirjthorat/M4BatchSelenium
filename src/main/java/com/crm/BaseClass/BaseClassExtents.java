package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassExtents {
public static WebDriver driver;

@BeforeClass
public static void precondition() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	}

@BeforeMethod
public static void login() {
	Reporter.log("login",true);
}

@AfterMethod
public static void logout() {
	Reporter.log("logout",true);
}

@AfterClass
public static void postcondition() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
}
