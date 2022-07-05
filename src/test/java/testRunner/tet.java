package testRunner;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class tet {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\API_Projects_Workpsace\\BDD_Selenium\\driver\\chromedriver_102.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String windid = driver.getWindowHandle();
		
		
		System.out.println("home page-"+windid);
		driver.findElement(By.xpath("//a[contains(text(),'Sell on Amazon')]")).click();
		 windid = driver.getWindowHandle();
		System.out.println("cetre page-"+windid);
		driver.findElement(By.xpath("//a[contains(text(),'Start selling')]")).click();
		 windid = driver.getWindowHandle();
			System.out.println("login page-"+windid);
		driver.findElement(By.xpath("//input[contains(@id,'ap_email')]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[contains(@id,'ap_password')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]")).click();
		
			
			Actions act  = new Actions(driver);
		Robot rb = new Robot();
		
		RemoteWebDriver driverss = new ChromeDriver();
		
		

	}

}
