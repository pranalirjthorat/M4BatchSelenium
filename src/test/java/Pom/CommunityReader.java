package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWSPom.CommunityPoll;

public class CommunityReader {
	@Test
public void Community() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	
	CommunityPoll ref = new CommunityPoll(driver);
	
	WebElement cpoll = ref.cpoll;
	WebElement excellent = ref.excellent;
	WebElement good = ref.good;
	WebElement veryBad = ref.veryBad;
	cpoll.click();
	Thread.sleep(1000);
	excellent.click();
	Thread.sleep(1000);
	good.click();
	Thread.sleep(1000);
	veryBad.click();
	Thread.sleep(1000);
	}
}

