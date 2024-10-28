package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenTesting.GetPhysicalData;

public class DataProviderExcel {

	@Test(dataProvider = "login")
	public void DataDriverAn(String email,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(2000);
		driver.close();

	}
	@DataProvider(name="login")
	public Object[][]provider() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\DataDrivan.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
	    int row = sheet.getPhysicalNumberOfRows();
	    int colom = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[row][colom];
		for(int i=0;i<row;i++) {
			for(int j=0;j<colom;j++)
			{
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
}
}