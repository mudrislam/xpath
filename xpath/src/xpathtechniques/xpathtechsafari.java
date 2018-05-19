package xpathtechniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class xpathtechsafari {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/muhammedrislam/selenium_jar_files/chromedriver");
		WebDriver driver = new SafariDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");
				
	}

}
