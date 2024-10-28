package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test(dataProvider = "login")
	public void readFromExcel(String email,String password) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\DataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Object[][] obj = new Object[2][2];
		obj[0][0]= sheet.getRow(0).getCell(0).toString();
		obj[0][1]= sheet.getRow(0).getCell(1).toString();
		obj[1][0]= sheet.getRow(1).getCell(0).toString();
		obj[1][1]= sheet.getRow(1).getCell(1).toString();

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	@DataProvider(name="login")
	public Object[][]provider(){
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="admin01";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="Admin02";
		return obj;
}
}
