package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.resusables;

@SuppressWarnings("unused")
public class amazon_homePage extends resusables {
//	 WebDriver driver;
	
	By sell_on_Amazon = By.xpath("//a[contains(text(),'Sell on Amazon')]");	
	By start_selling_button = By.xpath("//a[contains(text(),'Start selling')]");
	
//	resusables reuse = new resusables();
	
	public  void launch_application(String url)
	{
		 launch_browser(url);
		
	}
	
	public  void select_sellOnAmazon()
	{
		wait_until_elementLoads( 5, sell_on_Amazon);
		click( sell_on_Amazon);
		implicit_wait( 5);
		click(start_selling_button );
		
		
	}
}
