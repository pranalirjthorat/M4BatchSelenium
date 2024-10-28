package DWSPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHeadLinks {
	@FindBy(xpath = "//a[contains(text(),'Books')]")
	public WebElement books;
	
	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	public WebElement computer;
	
	@FindBy(xpath = "//a[contains(text(),'Electronics')]")
	public WebElement Electronics;
	
	@FindBy(xpath = "//a[contains(text(),'Apparel & Shoes')]")
	public WebElement Apparel_Shoes;
	
	@FindBy(xpath = "//a[contains(text(),'Digital downloads')]")
	public WebElement Digital_downloads;
	
	@FindBy(xpath = "//a[contains(text(),'Jewelry')]")
	public WebElement Jewelry;
	
	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	public WebElement Gift_Cards;
	
	
	public DWSHeadLinks(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
}

