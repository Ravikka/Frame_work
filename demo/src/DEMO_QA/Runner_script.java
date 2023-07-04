package DEMO_QA;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic_scripts.Base_Test;

public class Runner_script extends Base_Test {
	@Test
	public void test1() throws InterruptedException
	{
		POM_Script P=new POM_Script(driver);
		P.first("RAVI");
		P.last("Dhiya");
		P.mail("ravikka2930@gmail.com");
		P.rb();
		P.ph("9876543789");

		
		
	}
	

}
