package xpathtechniques;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//-Check cookies on two different sites -Delete all cookies and verify   
public class Allcookie {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().fullscreen();
	//driver.get("http:www.amazon.com");
	//Set<Cookie> allcookies= driver.manage().getCookies();
	//System.out.println("before delete cookies"+allcookies.size());
	//driver.manage().deleteAllCookies();
		
	driver.get("http:www.wikipedia.com")	;
	Set<Cookie>allcookies1 = driver.manage().getCookies();
	System.out.println("After delete cookies"+allcookies1.size());
		driver.manage().deleteAllCookies();
		
		
		
		
		
		
		
	}

}
