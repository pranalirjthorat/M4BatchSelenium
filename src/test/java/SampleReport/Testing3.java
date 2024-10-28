package SampleReport;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassExtents;
import com.crm.BaseClass.DWsBaseClass;

public class Testing3 extends DWsBaseClass{
@Test
	public void main3() {
		Reporter.log("I am the main3",true);
		assertEquals("money", "mani");
	}
}
