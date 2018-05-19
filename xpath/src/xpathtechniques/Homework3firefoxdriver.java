package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework3firefoxdriver {

	public static void main(String[] args) throws InterruptedException {
	//-Use css selector all different techniques, find ten different web elements  
	
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");		
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("#email")).sendKeys("test");
	
		//driver.findElement(By.cssSelector("input#email")).sendKeys("test");
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("1234er56");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("1234wertrt");
		//driver.findElement(By.cssSelector("#u_0_e")).sendKeys("muhammed");
		//driver.findElement( By.cssSelector(("input[type^='ema']"))).sendKeys("Test");
		//driver.findElement( By.cssSelector(("input[type#='ail']"))).sendKeys("Test");
		//driver.findElement( By.cssSelector(("input[type*='mai']"))).sendKeys("Test");
		
		//driver.findElement(By.cssSelector("#u_0_j")).sendKeys("7182001318");
		//driver.findElement(By.cssSelector("input#u_0_j")).sendKeys("7181313233");
		//driver.findElement(By.cssSelector("#u_0_w")).click();
		//driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[type#='word']")).sendKeys("whdkeieu");
		
	}

}
