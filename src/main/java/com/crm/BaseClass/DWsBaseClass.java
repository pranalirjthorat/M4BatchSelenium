package com.crm.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DWsBaseClass {
protected WebDriver driver;

@BeforeClass
public void preCondition() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod
public void login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("pranalithorat@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("pranu@123");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.className("ico-logout")).click();
}
@AfterClass
public void postCondition() {
	driver.quit();
}
}
