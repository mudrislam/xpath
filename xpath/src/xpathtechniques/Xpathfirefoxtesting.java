package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathfirefoxtesting {

	private static final String by = null;

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
WebDriver driver = new FirefoxDriver();
driver.manage().window().fullscreen();
driver.get("http:www.facebook.com");
//driver.findElement(By.partialLinkText("Sign")).click();
//driver.findElement(By.linkText("Log into")).click();
driver.findElement(By.id("email")).sendKeys("mudrislam@gmail.com");
driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("masonary1!@");
driver.findElement(By.linkText("Log In")).click();

















	}

}
