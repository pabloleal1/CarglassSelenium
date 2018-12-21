package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;


public class PageHomePage {

	private WebDriver driver;
	private By MakeAnAppointmentButton;
	
		public PageHomePage(WebDriver driver) 
		{
			this.driver = driver;
			MakeAnAppointmentButton = By.xpath("//*[@id=\"block-carglass-main-menu\"]/ul/li[1]/a");
		}
		
		
		public void makeAnAppointmentbutton() 
		{
			driver.findElement(MakeAnAppointmentButton).click();
			
			/*File myScreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
			try 
			{
				FileUtils.copyFile(myScreenshot, new File("C:\\SeleniumScreenshot\\Screnshot "+System.currentTimeMillis()+".png"));
			}catch(IOException e)
			{
				e.printStackTrace();
			}*/
		}
	
	
}
