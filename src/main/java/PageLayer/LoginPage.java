package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement mailId;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void userEnterUserNameAndPassword(String email,String Pass)
	{
		Wait.sendKeys(mailId, email);
		Wait.sendKeys(pass, Pass);
	}
	
	public void userClickOnLoginButton()
	{
		Wait.click(loginButton);
	}
}
