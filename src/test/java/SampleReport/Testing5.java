package SampleReport;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DWsBaseClass;

public class Testing5 extends DWsBaseClass{
@Test
	public void main5() {
		Reporter.log("I am the main5",true);
		assertEquals("abe", "bca");
	}
}
