package PabloNuevoOne;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.PageHomePage;
import Pages.PageSelecVehicle;
import helpers.Helpers;

@Test
public class RunExample {

	public static void setUp()
	{
		//Set The Gecko Driver Path
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//URL 
		String url = "https://pre.carglass.es/";
		
		//Goig to Carglass
		driver.get(url);
		
		//Object declaration
		PageHomePage homePage = new PageHomePage(driver);
		PageSelecVehicle SelectVehicle = new PageSelecVehicle(driver);
		Helpers helper = new Helpers();
		
		//Object instance
		helper.sleepSeconds(driver);
		homePage.makeAnAppointmentbutton();
		SelectVehicle.VerifyPageSelectVehicleWorks();
		helper.sleepSeconds(driver);
		//SelectVehicle.SelectCar();
		WebElement car = driver.findElement(By.partialLinkText("Furgoneta"));
		car.click();

		driver.quit();
	
	}
	
}
