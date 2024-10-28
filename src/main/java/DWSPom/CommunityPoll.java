package DWSPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityPoll {

	@FindBy(xpath = "//strong[text()='Community poll']")
	public WebElement cpoll;
	
	@FindBy(id = "pollanswers-1")
	public WebElement excellent;
	
	@FindBy(id = "pollanswers-2")
	public WebElement good;
	
	@FindBy(id = "pollanswers-3")
	public WebElement poor;
	
	@FindBy(id = "pollanswers-4")
	public WebElement veryBad;
	
	public  CommunityPoll (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
