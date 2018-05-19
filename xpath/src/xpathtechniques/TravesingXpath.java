package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TravesingXpath {

	public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().fullscreen();
	driver.get("http:www.facebook.com");
	String part1 ="/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[1]/div[1]/div[2]/span[1]";
	
	String part2 ="]";
	
	//for (int = 1 ;i<=2; i+1+;)
		
	{
		//System.out.println(drive.findelement(By.xpath(part1)+));
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
}
