package xpathtechniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");

WebDriver driver = new FirefoxDriver() ;
driver.manage().window().fullscreen();
driver.get("http:facebook.com");
//List<WebElement> all=driver.findElements(By.tagName("a"));
//System.out.println(all.size());
//for (int i=0;i<all.size();i++)
//System.out.println(all.get(i).getText());
WebElement area = driver.findElement(By.cssSelector(".pvl"));
List<WebElement> kkt =area.findElements(By.tagName("a"));
System.out.println(kkt.size());
for (int i=0;i<kkt.size();i++)
System.out.println(kkt.get(i).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
