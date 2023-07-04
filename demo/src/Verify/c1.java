package Verify;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import demo.Generic_spt;

public class c1 extends Generic_spt {
	@Test
	public void hi() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("ravi");
	driver.findElement(By.id("pass")).sendKeys("ravi");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	String title = driver.getTitle();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(title,"hi");
	System.out.println("1");
	sa.assertAll();
	}
	

}
