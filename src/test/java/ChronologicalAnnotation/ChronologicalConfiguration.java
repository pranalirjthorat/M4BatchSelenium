package ChronologicalAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalConfiguration {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void testScript() {
		System.out.println("Test Script");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suit");
	}
	
}
