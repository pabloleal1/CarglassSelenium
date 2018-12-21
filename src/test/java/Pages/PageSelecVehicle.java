package Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PageSelecVehicle {

	
	
	private WebDriver driver;
	private By Car;
	private By Van;
	private By Truck;
	
		public PageSelecVehicle(WebDriver driver) 
		{
			this.driver = driver;
			Car = By.xpath("//*[@id=\"edit-answser\"]/div[1]/label");
			Van = By.xpath("//*[@id=\"edit-answser\"]/div[2]/label");
			Truck = By.xpath("//*[@id=\"edit-answser\"]/div[3]/label");

		}
		
		public void VerifyPageSelectVehicleWorks()
		{
			boolean present; 
			try { 
			    driver.findElement(By.xpath("//*[@id=\"edit-answser\"]/div[1]/label")); 
			    present = true; 
			} catch (NoSuchElementException e) { 
			    present = false; 
			} 			
		}
		
		public void SelectCar() 
		{
			driver.findElement(Car).click();
			
		}
		
		public void SelectVan() 
		{
			driver.findElement(Van).click();
			
		}
		
		public void SelectTruck() 
		{
			driver.findElement(Truck).click();
			
		}
	
}
