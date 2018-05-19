package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathtechfirefoxdriver {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
WebDriver driver = new FirefoxDriver();
driver.manage().window().fullscreen();
driver.get("http:www.facebook.com");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
driver.findElement(By.xpath("//*[@id='month']")).sendKeys("month");
driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("muhammed");
driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys("islam");
driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("7182001318");	
driver.findElement(By.xpath("//*[@id='u_0_q']")).sendKeys("new password");
driver.findElement(By.xpath("//*[@id='u_0_2']")).sendKeys("test");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
