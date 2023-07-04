package listener;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ts2 {
	@Test
	public void test1()
	{
		System.out.println("ravi");
	}
	@Test
	public void test2()
	{
		System.out.println("ramya");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("hi");
	}
}
	

	
	


