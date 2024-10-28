package TestScriptMethods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.BaseClass.DWsBaseClass;


public class Task1 extends DWsBaseClass{
	@Test
	public void testScript1() throws InterruptedException {
		System.out.println("tesct Script1");
		String rss = "https://demowebshop.tricentis.com/news/rss/1";
		String fb="https://www.facebook.com/nopCommerce";
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		String parent= driver.getWindowHandle();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
			for (WebElement webElement : links) {
			webElement.click();
			String actual = driver.getCurrentUrl();
			if(rss.equals(actual))
			{
				driver.navigate().back();
			}	
		}
		
		Set<String> childs = driver.getWindowHandles();
		for (String string : childs) {
			driver.switchTo().window(string);
			String actualr = driver.getCurrentUrl();
			if(fb.equals(actualr))
			{
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Thread.sleep(2000);
				break;
			}
		}

		driver.switchTo().window(parent);

	}
	@Test
	public void testScript2() throws InterruptedException {
		System.out.println("tesctScript2");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(3000);
		List<WebElement> item = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement webElement : item) {
			webElement.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(2000);
		List<WebElement> removecart = driver.findElements(By.xpath("//td[@class='remove-from-cart']"));
		for (WebElement webElement1 : removecart) {
			webElement1.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.name("updatecart")).click();
	}

}
