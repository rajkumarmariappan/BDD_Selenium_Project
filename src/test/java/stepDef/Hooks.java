package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver = Utils.resusables.driver;

//@After(order = 0)
//public void addScrrenshot(Scenario scenario)
//{
//	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);		
//	scenario.attach(screenshot, "image/png", "screenshot");
//}

@After
public void close_browser() {
	
	
driver.quit();
}

}
