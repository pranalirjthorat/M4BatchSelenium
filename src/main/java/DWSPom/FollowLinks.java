package DWSPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowLinks {
	@FindBy(xpath = "//div[@class='column follow-us']/ul/li/a")
	public WebElement followlinks;
	
	public FollowLinks(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
