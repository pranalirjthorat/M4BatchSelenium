package Asseration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrueMethod {
@Test
public void main() {
	String excepted = "https://demowebshop.tricentis.com/";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	String actual = driver.getCurrentUrl();
	assertEquals(excepted, actual);
	driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
	WebElement serch = driver.findElement(By.cssSelector("input[type='submit']"));
	assertTrue(serch.isEnabled());
	serch.click();
}
}
