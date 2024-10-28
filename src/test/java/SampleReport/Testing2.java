package SampleReport;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClassExtents;
import com.crm.BaseClass.DWsBaseClass;

public class Testing2 extends DWsBaseClass {
@Test
	public void main2() {
		Reporter.log("I am the main2",true);
	}
}
