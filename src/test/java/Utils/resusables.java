package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import junit.framework.Assert;

public class resusables {
	
	 public static WebDriver driver;
	
	public  void wait_until_elementLoads(long wait_secs, By xpath)
	{
		try{WebElement element = driver.findElement(xpath);
		WebDriverWait wait = new WebDriverWait(driver, wait_secs);
		wait.until(ExpectedConditions.visibilityOf(element));
		}catch(NoSuchElementException e) {
			e.getMessage();
			Assert.assertFalse(false);
			
		}catch(NoSuchWindowException e) {
			e.getMessage();
			Assert.assertFalse(false);
		}catch(StaleElementReferenceException e) {
			e.getMessage();
			Assert.assertFalse(false);
		}catch(ElementNotSelectableException e) {
			e.getMessage();
			Assert.assertFalse(false);
		}catch(WebDriverException e) {
			e.getMessage();
			Assert.assertFalse(false);
		}
	}
	
	
	public void addScrrenshot(Scenario scenario)
	{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);		
		scenario.attach(screenshot, "image/png", "screenshot");
					
	}
	
	public  void implicit_wait( long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public void enterText( By xpath, String text)
	{
		driver.findElement(xpath).clear();
		driver.findElement(xpath).sendKeys(text);
	}
	
	public void  launch_browser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\API_Projects_Workpsace\\BDD_Selenium\\driver\\chromedriver_102.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public  void click(By xpath) {
		
		try{WebElement element = driver.findElement(xpath);
		element.click();
		}catch(NoSuchElementException e) {
			e.getMessage();
			Assert.assertFalse(false);
		}catch(NoSuchWindowException e) {
			e.getMessage();
		}catch(StaleElementReferenceException e) {
			e.getMessage();
		}catch(ElementNotSelectableException e) {
			e.getMessage();
		}catch(WebDriverException e) {
			e.getMessage();
		}
	}

public String read_text(By xpath) {
		
		WebElement element = driver.findElement(xpath);
		String error = element.getText();
		return error;
	}

public void cloe_browser()
{
	driver.quit();
	System.out.println("driver quit");
}
}
