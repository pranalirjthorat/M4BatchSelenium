package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TaskDws {
@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\LoginDws.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String email = sheet.getRow(0).getCell(0).toString();
		String password = sheet.getRow(0).getCell(1).toString();
		System.out.println(email);
		System.out.println(password);

		String excepted = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String actual = driver.getCurrentUrl();
		if(excepted.equals(actual))
		{
			System.out.println("verification is done");
			WebElement login = driver.findElement(By.linkText("Log in"));
			Thread.sleep(1000);
			if(login.isEnabled())
			{
				login.click();
				driver.findElement(By.id("Email")).sendKeys(email);
				Thread.sleep(1000);
				driver.findElement(By.id("Password")).sendKeys(password);
				Thread.sleep(1000);
				driver.findElement(By.id("RememberMe")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				Thread.sleep(1000);
				System.out.println("login is display..");
				
			}
		}
		else
		{
			System.out.println("verification is not done");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
