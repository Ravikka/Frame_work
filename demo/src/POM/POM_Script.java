package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script {
	@FindBy(name="login")
	private WebElement loginBtn;
	public POM_Script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clicklogin()
	{
		loginBtn.click();
	}
	

}
