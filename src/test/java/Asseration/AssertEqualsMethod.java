package Asseration;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEqualsMethod {
	@Test
public void assertEqual() throws InterruptedException {
	String excepted = "https://demowebshop.tricentis.com/";
//	String excepted = "https://demowebshop.tricentis.com/login";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	String actual = driver.getCurrentUrl();
	assertEquals(excepted, actual);
	driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(2000);
	driver.close();
}
}