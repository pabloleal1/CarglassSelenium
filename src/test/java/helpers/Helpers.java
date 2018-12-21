package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Helpers {

	public void sleepSeconds(WebDriver driver)
	{		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
}
