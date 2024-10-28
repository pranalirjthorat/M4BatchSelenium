package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWSPom.DWSHeadLinks;

public class HeaderAllLinks {
	@Test
public void AllLinks() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/");
	
	DWSHeadLinks ref = new DWSHeadLinks(driver);
	
	WebElement books = ref.books;
	WebElement computer= ref.computer;
	WebElement Electronics = ref.Electronics;
	WebElement Apparel_Shoes= ref.Apparel_Shoes;
	WebElement Digital_downloads = ref.Digital_downloads;
	WebElement Jewelry= ref.Jewelry;
	WebElement Gift_Cards= ref.Gift_Cards;
	
	books.click();
	driver.navigate().back();
	computer.click();
	driver.navigate().back();
	Electronics.click();
	driver.navigate().back();
	Apparel_Shoes.click();
	driver.navigate().back();
	Digital_downloads.click();
	driver.navigate().back();
	Jewelry.click();
	driver.navigate().back();
	Gift_Cards.click();
	driver.navigate().back();
}
}

