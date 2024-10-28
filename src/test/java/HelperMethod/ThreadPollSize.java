package HelperMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPollSize {

	@Test(priority = 'a',invocationCount = 2,threadPoolSize = 3)
	public void dws() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 'b',invocationCount = 3)
	public void rcb() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority = 'c',invocationCount = 4,threadPoolSize = 2)
	public void csk() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
