package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functionnaltessting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
WebDriver driver = new FirefoxDriver ();
driver.manage().window().fullscreen();
driver.get("http:www.cvs.com");
driver.findElement(By.linkText("Create an Account")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("#firstName")).sendKeys("muhammed");
driver.findElement(By.cssSelector("#lastName")).sendKeys("islam");
driver.findElement(By.cssSelector("#email")).sendKeys("mudrislam@gmail.com");
Thread.sleep(4000);
driver.findElement(By.cssSelector("#pass")).sendKeys("ecplise2");
driver.findElement(By.cssSelector("#basicInfoForm > div:nth-child(7) > fieldset:nth-child(1) > div:nth-child(1) > label:nth-child(1)")).sendKeys("ecplise2");		
driver.findElement(By.cssSelector("#basicInfoForm > div:nth-child(8) > fieldset:nth-child(1) > div:nth-child(1) > label:nth-child(1)")).submit();
driver.findElement(By.cssSelector("#basicInfoForm > div:nth-child(9) > fieldset:nth-child(1) > div:nth-child(1) > label:nth-child(1)")).sendKeys("bronx");
driver.findElement(By.cssSelector("#basicInfoForm > div:nth-child(11) > div:nth-child(1)")).click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
