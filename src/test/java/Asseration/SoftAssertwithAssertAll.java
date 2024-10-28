package Asseration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssertwithAssertAll {
	@Test
	public void main() {
	String excepted = "https://demowebshop.tricentis.com";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	String actual = driver.getCurrentUrl();
    org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
//	SoftAssert soft = new SoftAssert();
    soft.assertEquals(excepted, actual);
    driver.findElement(By.id("small-searchterms")).sendKeys("Watch");
	WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
	soft.assertTrue(search.isEnabled());
	search.click();
	soft.assertAll();
}
}
// if we are providing wrong url with assertAll() it give failure output
