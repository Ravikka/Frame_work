package Verify;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo.Generic_spt;

public class ts2 extends Generic_spt {
	@Test
	public void hi() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("ravi");
	driver.findElement(By.id("pass")).sendKeys("ravi");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	String title = driver.getTitle();
	Assert.assertEquals(title,"hi");
	System.out.println("1");
	}

}
