/**
 * 
 */
package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author muhammedrislam
 *
 */
public class Testamazonwebsite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.amazon.com");
		driver.findElement(By.linkText("Gift Cards")).click();
		driver.findElement(By.linkText("Birthdays")).click();
		driver.findElement(By.linkText("By Brand")).click();
		driver.findElement(By.linkText("Careers")).click();
		driver.findElement(By.linkText("Teams")).click();
		driver.findElement(By.linkText("MENU")).click();
		//driver.findElement(By.linkText("North America")).click();
		//driver.findElement(By.linkText("Latin America")).click();
		//driver.findElement(By.linkText("Europe")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
