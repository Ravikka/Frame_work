package DEMO_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_scripts.Base_Page;

public class POM1 extends Base_Page {
	@FindBy(name="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement pWord;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public POM1(WebDriver driver)
	{
		super(driver);
	}
	public void passUn(String un)
	{
		uName.sendKeys(un);
	}
	public void passPwd(String pwd)
	{
		pWord.sendKeys(pwd);
	}
	public void click()
	{
		loginBtn.click();
		
	}
	
	

}
