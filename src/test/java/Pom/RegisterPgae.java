package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DWSPom.DWSRegister;
import DWSPom.DwsLogin;

public class RegisterPgae {
	@Test
public void Register() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://demowebshop.tricentis.com/register");
	DWSRegister ref = new DWSRegister(driver);
	
	WebElement gender_female = ref.gender_female;
	WebElement FirstName = ref.FirstName;
	WebElement LastName = ref.LastName;
	WebElement Email = ref.Email;
	WebElement Password = ref.Password;
	WebElement ConfirmPassword = ref.ConfirmPassword;
	WebElement register_button = ref.register_button;

	gender_female.click();
	FirstName.sendKeys("Pranali");
	LastName.sendKeys("Thorat");
	Email.sendKeys("pranalithorat6@gmail.com");
	Password.sendKeys("Admin02");
	ConfirmPassword.sendKeys("Admin02");
	register_button.click();
	
}
}

