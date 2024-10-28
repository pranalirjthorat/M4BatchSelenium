package DWSPom;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example {
	public Example(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	private @FindBy(css = "a[class='ico-login']")
	WebElement icon_login;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(xpath="//input[@value='Log in']")
	WebElement login_button;
	
	
	public void iconlogin() {
		icon_login.click();
	}
	public void email(String data) {
		email.sendKeys(data);
	}
	public void password(String data) {
		password.sendKeys(data);
	}
	public void loginbutton() {
		login_button.click();
	}

	
	public void login(String email,String password) {
		iconlogin();
		email(email);
		password(password);
		loginbutton();
	}
}
