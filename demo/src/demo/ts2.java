package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ts2 {
	@Test
	public void test1()
	{
		Reporter.log("hi",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("bye",true);
	}

}


