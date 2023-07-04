package demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ts5 extends Generic_spt
{
	@Test
	public void hi() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("ravi");
	driver.findElement(By.id("pass")).sendKeys("ravi");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	String title = driver.getTitle();
}
}
	
	


