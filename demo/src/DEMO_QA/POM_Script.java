package DEMO_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script extends BasePage{
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement FN;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement LN;
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement Email;
	@FindBy(xpath="//label[@for='gender-radio-2']")
	private WebElement radio;
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement number;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dob;
	@FindBy(xpath="//div[text()='30']")
	private WebElement dd;
	
	public POM_Script(WebDriver driver)
	{
		super(driver);
	}
	public void first(String fn)
	{
		FN.sendKeys(fn);
	}
	public void last(String ln)
	{
		LN.sendKeys(ln);
	}
	public void mail(String em)
	{
		Email.sendKeys(em);
	}
	public void rb()
	{
		radio.click();
	}
	public void ph(String no)
	{
		number.sendKeys(no);
	}
}
	
	
	


