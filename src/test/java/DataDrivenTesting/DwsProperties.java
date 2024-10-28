package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DwsProperties {
	private String email;

	@Test
public void login() throws IOException, InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(1000);
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(1000);

Properties prop = new Properties();
FileInputStream fis = new FileInputStream("../com.crm.AdvanceSeleniumM4/Configrationfile/Login.properties");
prop.load(fis);

String browser = prop.getProperty("browser");
String url = prop.getProperty("url");
driver.get(url);
Thread.sleep(2000);
driver.findElement(By.className("ico-login")).click();

WebElement email_feild = driver.findElement(By.id("Email"));
String email=prop.getProperty("email");
email_feild.sendKeys(email);

WebElement pass_feild = driver.findElement(By.id("Password"));
String password=prop.getProperty("password");
pass_feild.sendKeys(password);
	
driver.findElement(By.id("RememberMe")).click();
driver.findElement(By.cssSelector("input[value='Log in']")).click();

FileInputStream fis1 = new FileInputStream("");
Workbook wb = WorkbookFactory.create(fis1);
org.apache.poi.ss.usermodel.Sheet sheet= wb.getSheet("Sheet1");

WebElement search_feild = driver.findElement(By.id("small-searchterms"));
String search = sheet.getRow(0).getCell(0).toString();
search_feild.sendKeys(search);

driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(3000);


}
	
	
}
