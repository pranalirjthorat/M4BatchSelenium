package Pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

import DWSPom.Example;

public class ReadPrivateMenmber {
	@Test
	public void main() {
    WebDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    driver.get("https://demowebshop.tricentis.com/");
//    driver.findElement(By.partialLinkText("Log in")).click();
    Example ref = new Example(driver);
    ref.login("admin01@gmail.com", "admin01");
}

}
