package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsType {

	
	private WebDriver driver;
	private By Windshield;
	private By SideWindow;
	private By BackWindow;
	private By OtherGlass;

	
		public WindowsType(WebDriver driver) 
		{
			this.driver = driver;
			Windshield = By.xpath("//*[@id=\"edit-answser\"]/div[1]/label");
			SideWindow = By.xpath("//*[@id=\"edit-answser\"]/div[2]/label");
			BackWindow = By.xpath("//*[@id=\"edit-answser\"]/div[3]/label");
			OtherGlass = By.xpath("//*[@id=\"edit-answser\"]/div[3]/label");
		}

		public void SelectWindshield() 
		{
			driver.findElement(Windshield).click();
			
		}
		public void SelectSideWindow() 
		{
			driver.findElement(SideWindow).click();
			
		}
		public void SelectBackWindow() 
		{
			driver.findElement(BackWindow).click();
			
		}
		public void SelectOtherGlass() 
		{
			driver.findElement(OtherGlass).click();
			
		}
	
}
