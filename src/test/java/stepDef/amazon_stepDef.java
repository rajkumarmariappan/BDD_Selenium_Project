package stepDef;

import org.openqa.selenium.WebDriver;

import Utils.resusables;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.amazon_homePage;
import pages.amazon_selling_loginPage;

public class amazon_stepDef  {
	   amazon_homePage home  = new amazon_homePage();
	   amazon_selling_loginPage sell_login = new amazon_selling_loginPage();
	   resusables res = new resusables();
//	   Scenario scenario = null;
	   
	@Given("Launch amazon website {string}")
	public void launch_amazon_website(String url) {
	    home.launch_application(url);
//	    res.addScrrenshot(Scenario scenario);
	    
	}
	
	@When("click selling link at the bottom of the page")
	public void click_selling_link_at_the_bottom_of_the_page() {
		home.select_sellOnAmazon();
//		res.addScrrenshot(scenario);
	}
	
	
	@Then("click start selling button on New page")
	public void click_start_selling_button_on_new_page() {
		home.implicit_wait(5);
		System.out.println("Implemented in above step so ignore this");
	}
	
	@Then("Validate the error message on login page of Selling functionalityby entering invalid {string} and {string} and {string}" )
	public void read_the_error_message_on_login_page_of_selling_functionalityby_entering_invalid_and(String email_ID, String pwd, String exp_error) {
		
		WebDriver driver = resusables.driver;
		
		
		
		sell_login.enterUser_Email_and_Pswd(email_ID, pwd);
		sell_login.click_sign_in_button();
		sell_login.validate_error_message(exp_error);
//		res.addScrrenshot(scenario);
		
		
		
		
	}


}
