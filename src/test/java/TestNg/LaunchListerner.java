package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.crm.Listerners.Sample.class)
public class LaunchListerner  {
	@Test
public void cks() {
//		String val1 ="mani";
//		String val2 = "money";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://www.chennaisuperkings.com/");
//	assertEquals(val1, val2);
	driver.quit();
}

}
