package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listerners.Sample.class)
public class LaunchListerner2 {
	@Test
	public void csk() throws InterruptedException {
		String val1 ="mani";
		String val2 = "money";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://www.chennaisuperkings.com/");
	Thread.sleep(2000);
	driver.quit();
	Reporter.log("csk",true);
	assertEquals(val1, val2);
	
}
	@Test(dependsOnMethods = "csk")
	public void rcb() throws InterruptedException {
		String val1 ="mani";
		String val2 = "money";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://www.royalchallengers.com/");
	Thread.sleep(2000);
	driver.quit();
	Reporter.log("rcb",true);
	assertEquals(val1, val2);
	
}
}
