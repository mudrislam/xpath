package xpathtechniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount {

	public static  void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://thez9.com");
		List<WebElement> brooklyn=driver.findElements(By.tagName("a"));
		System.out.println(brooklyn.size());
		for (int i=0;i<brooklyn.size();i++)
		System.out.println(brooklyn.get(i).getText());

		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


