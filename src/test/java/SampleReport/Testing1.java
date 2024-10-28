package SampleReport;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassExtents;
import com.crm.BaseClass.DWsBaseClass;

public class Testing1 extends DWsBaseClass {
@Test
	public void main1() {
		Reporter.log("I am the main1",true);
	}
}
