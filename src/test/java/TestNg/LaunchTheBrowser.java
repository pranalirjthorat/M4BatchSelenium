package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTheBrowser {
	@Test
	public void main() {
		System.out.println("launch the browser");
		WebDriver driver = new ChromeDriver();
	}
	
	@Test
	public void main1() {
		
		System.out.println("launch second browser");
	}

}
// it is allowing multiple @annotation method in same class file