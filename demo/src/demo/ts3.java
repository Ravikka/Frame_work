package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ts3 {
	@Test
	public void hi() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("RAVI");
	}
}






