package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWSPom.DwsLogin;

public class LoginPage {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demowebshop.tricentis.com/login");
		
		DwsLogin ref = new DwsLogin(driver);
		
		WebElement email = ref.email;
		WebElement password = ref.password;
		WebElement login_button = ref.login_button;
		
		email.sendKeys("admin01@gmail.com");
		password.sendKeys("admin01");
		login_button.click(); 
		
	}

	
}
