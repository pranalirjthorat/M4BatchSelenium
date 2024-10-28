package TestCaseExecution2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ktm {

	@Test(groups="smoke")
	public void ktm() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktmindia.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
