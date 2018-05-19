package xpathtechniques;
//-For any site home page count all links & print all links and also count all links at the bottom of the page and print them
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.amazon.com");
		List<WebElement> xy=driver.findElements(By.tagName("a"));
		for ( int c=0; c<xy.size();c++ )
   
		System.out.println(xy.get(c).getText());
    
    
    
    
    
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
	}


