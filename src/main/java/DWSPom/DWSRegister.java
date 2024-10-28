package DWSPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegister {
	@FindBy(id="FirstName")
	public WebElement FirstName;
	
	@FindBy(id="LastName")
	public WebElement LastName;
	
	@FindBy(id="Email")
	public WebElement Email;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	public WebElement register_button;
	
	@FindBy(id="gender-female")
	public WebElement gender_female;
	
	public DWSRegister(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
}