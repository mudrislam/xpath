package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//-Create a Facebook or CVS pharmacy account or your choice of the site using the concept -Verify site, page title, is displayed, is selected, is enabled 
public class Verifytiltepages {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");

		WebDriver driver = new FirefoxDriver() ;
		driver.manage().window().fullscreen();
		driver.get("http:cvs.com");
		WebElement sst=driver.findElement(By.xpath("//*[@id=\'featureArea\']"));
		boolean bol=sst.isDisplayed();
		if(bol==true)
			System.out.println("is exists");
		else
			System.out.println("Not exists");
		
		System.out.println(sst.isEnabled());
		System.out.println(sst.isSelected());
		sst.click();
		System.out.println(sst.isSelected());


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
