package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ts1 {
	@Test
	public void test1()
	{
		Reporter.log("hello",true);
	}

}
