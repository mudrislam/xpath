package xpathtechniques;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readproperties {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http.www.tizag.com");	
		Properties pro = new Properties();
		//FileInputStream fs = new FileInputStream (System.getProperty(null))
	//	pro.load(fs);
		
		
		
		
		
		
		
		
		
		
	}

}
