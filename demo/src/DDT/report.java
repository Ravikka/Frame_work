package DDT;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class report {
	@Test
	public void test1()
	{
		ExtentReports rep = new ExtentReports("./Reports/r.html",false);
		ExtentTest t1 = rep.startTest("tc1");
		t1.log(LogStatus.PASS, "PASSED TC");
		t1.log(LogStatus.FAIL, "FAILED TC");
		t1.log(LogStatus.SKIP, "SKIPPED TC");
		rep.endTest(t1);
		rep.flush();
		
		
	}
	

}
