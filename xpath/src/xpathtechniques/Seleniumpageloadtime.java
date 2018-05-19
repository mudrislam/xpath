package xpathtechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumpageloadtime {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.amazon.com");
		
	//driver.manage().timeouts().pageloadtimeout(200,timeunit.seconds)
//driver.manage().timeouts().implicitlywait(300,timeunit.seconds)
	//explicit wait time
		
		//WebElement vet =driver.findElement(By.cssSelector("#email")));
		//WebDriver wt = new WebDriverwait(driver,500);
		//wt.untill(expectedconditions visobilityofALELEments(vet));
	//driver.close/quit
	//
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	}

}
