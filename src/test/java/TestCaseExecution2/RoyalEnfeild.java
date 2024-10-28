package TestCaseExecution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoyalEnfeild {

	@Test(groups="smoke")
	public void royal_enfeild() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
