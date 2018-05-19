package xpathtechniques;
//-ID, Name, Link Text, and Partial Link Text apply on 10 different objects respectively for chrome and firefox

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathtechchromeidnamelink {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
WebDriver driver = new FirefoxDriver();
driver.manage().window().fullscreen();
driver.get("http:www.facebook.com");
//driver.findElement(By.id("email")).sendKeys("id technique");
//driver.findElement(By.name("email")).sendKeys("name technique");
//driver.findElement(By.linkText("Forgot account?")).click();
//driver.findElement(By.partialLinkText("Forgot")).click();
//driver.findElement(By.tagName("Create Account")).click();
//driver.findElement(By.name("First name")).sendKeys("shohag");	
//driver.findElement(By.xpath("//*[@id=\'u_0_w\']")).click();
//driver.findElement(By.linkText("Log In")).click();
//driver.findElement(By.partialLinkText("Log")).click();
//driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
//driver.findElement(By.linkText("People")).click();
//driver.findElement(By.partialLinkText("Peopl")).click();
//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/ul/li[7]/a")).click();
//driver.findElement(By.id("email")).sendKeys("7182001318");
//driver.findElement(By.partialLinkText("About")).click();	
//driver.findElement(By.partialLinkText("Abou")).click();
driver.findElement(By.partialLinkText("Sign")).click();	
driver.findElement(By.xpath("//*[@id=\'u_0_m\']")).sendKeys("muhammed");
driver.findElement(By.xpath("//*[@id=\'u_0_o\']")).sendKeys("islam");	
	
	
	}

}
