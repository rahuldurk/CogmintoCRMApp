package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass{
	
	private static LoginPage login;
	
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		
		BaseClass.initialization();
	  
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		
		//String userName=prop.getProperty("prafulp1010@gmail.com");
		//String passwd=prop.getProperty("Pr@ful0812");
		
		 login=new LoginPage();
		 login.userEnterUserNameAndPassword(prop.getProperty("USERNAME"), prop.getProperty("PAASWORD"));
		
	   
	}

	@Then("user click on loginButton")
	public void user_click_on_login_button() {
		login.userClickOnLoginButton();
	    
	}

}
