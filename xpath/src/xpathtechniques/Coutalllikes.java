package xpathtechniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coutalllikes {
	//Create a Facebook or CVS pharmacy account or your choice of the site using the concept -Verify site, page title, is displayed, is selected, is enabled 
	//-For any site home page count all links & print all links and also count all links at the bottom of the page and print them

	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		//driver.get("http:www.facebook.com");
		driver.get("http:www.amazon.com");
		Thread.sleep(3000);
		List<WebElement> rrt=driver.findElements(By.tagName("a"));
		System.out.println(rrt.size());		
		for(int i=0;i<rrt.size();i++)
		{
			System.out.println(rrt.get(i).getText());			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
