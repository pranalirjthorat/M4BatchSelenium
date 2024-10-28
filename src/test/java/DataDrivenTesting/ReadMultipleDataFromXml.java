package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadMultipleDataFromXml {
	@Parameters({"url","log","pass"})
	@Test
	public void login(String url, String log,String pass) throws InterruptedException {
		String excepted = "https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		if(excepted.equals(actual))
		{
			System.out.println("varification is done");
			driver.findElement(By.linkText("Log in")).click();
			
				System.out.println("im in the log in");
				driver.findElement(By.id("Email")).sendKeys(log);
				driver.findElement(By.id("Password")).sendKeys(pass);
				driver.findElement(By.name("RememberMe")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[value='Log in']")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("ico-logout")).click();
				Thread.sleep(2000);
			}
			
		
		else
		{
			System.out.println("varification is not done");
		}
		driver.quit();
	}
}
