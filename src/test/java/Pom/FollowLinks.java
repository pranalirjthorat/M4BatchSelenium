package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FollowLinks {
	public WebElement followlinks;

	@Test
	public void AllFollowLinks() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demowebshop.tricentis.com/");
		
		FollowLinks ref = new FollowLinks();
		WebElement followlinks = ref.followlinks;
		followlinks.click();
		
		
	}

}
