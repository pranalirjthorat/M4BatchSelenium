package DWSPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {
	@FindBy(id="Email")
	public WebElement email;
	@FindBy(id="Password")
	public WebElement password;
	@FindBy(css="input[value='Log in']")
	public WebElement login_button;
	
	public DwsLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
