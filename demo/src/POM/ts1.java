package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ts1{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver .get("https://www.facebook.com/");
		POM_Script P=new POM_Script(driver);
		P.clicklogin();
		driver.nav
		
	}