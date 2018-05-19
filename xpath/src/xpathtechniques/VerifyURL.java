package xpathtechniques;
//-Verify URL title of the page for three different sites 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyURL {

	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");	
WebDriver driver = new FirefoxDriver();
driver.manage().window().fullscreen();
//driver.get("http:www.spikerdeveloper.com");
//String Title = driver.getTitle()	;
//System.out.println(Title);
//driver.get("http:www.facebook.com/");
//String title = driver.getTitle();
//System.out.println(title);
//if (!title.equals("facebook-Log In or Sign Up"))
	//System.out.println("window title is wrong");
//driver.get("http:www.amazon.com");
//String title = driver.getTitle();
//System.out.println(title);
driver.get("http:www.wikipedia.com");
String title = driver.getTitle();
System.out.println(title);


	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
