package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtechchromedriver {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/muhammedrislam/selenium_jar_files/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().fullscreen();
driver.get("http:www.facebook.com");
driver.findElement(By.linkText("Log In")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
