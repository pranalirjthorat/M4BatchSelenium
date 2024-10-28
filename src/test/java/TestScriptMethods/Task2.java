package TestScriptMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.DWsBaseClass;

public class Task2 extends DWsBaseClass{

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
