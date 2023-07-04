package DEMO_QA;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_scripts.Base_Test;

public class Runner1 extends Base_Test {
	@Test(dataProvider="testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		POM1 p = new POM1(driver);
		p.passUn(d1);
		p.passPwd(d2);
		Thread.sleep(2000);
		p.click();
		Assert.fail();
	}
	
	@DataProvider(name="testdata")
	public Object[][] createData1()
	{
		return new Object[][]
				{
		{"ravi","1234"},
		{"ramya","5678"},
	};
}
}
		
	


