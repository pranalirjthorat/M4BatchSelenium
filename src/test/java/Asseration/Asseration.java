package Asseration;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asseration {
	@Test
public void main() throws InterruptedException {
	String excepted = "https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	String actual = driver.getCurrentUrl();
	assertEquals(excepted, actual);
	driver.findElement(By.id("small-searchterms")).sendKeys("Watch",Keys.ENTER);
}
}
