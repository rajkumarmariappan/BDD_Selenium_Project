package pages;


import org.openqa.selenium.By;

import Utils.resusables;
import junit.framework.Assert;

public class amazon_selling_loginPage extends resusables{
	
	
	
	By email = By.xpath("//input[@id='ap_email']");
	By pswd = By.xpath("//input[@id='ap_password']");
	By sign_in_button = By.id("signInSubmit");
	By error_text = By.xpath("//span[contains(text(),'To better protect')]");
	
	public void enterUser_Email_and_Pswd(String email_text, String pswd_text) {
		
		enterText( email, email_text);
		enterText( pswd, pswd_text);
	}
	
	public void click_sign_in_button()
	{
		click(sign_in_button);
		implicit_wait(5);
	}
	@SuppressWarnings("deprecation")
	public void validate_error_message(String expected_err_msg)
	{
		String actual_error_msg = read_text(error_text);
		Assert.assertEquals(actual_error_msg, expected_err_msg);
		System.out.println("actual------"+actual_error_msg);
		System.out.println("expected------"+expected_err_msg);
	}

}
