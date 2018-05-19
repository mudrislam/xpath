package xpathtechniques;

import java.util.List;
//-For any site home page count all links & print all links and also count all links at the bottom of the page and print them
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkcount2 {

	private static Object webelemnt;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.wikipedia.com");
	//	List<WebElement> xyz=driver.findElements(By.tagName("a"));
		//System.out.println(xyz.size());
		//for(int i=0;i<xyz.size();i++)
			//System.out.println(xyz.get(i).getText());
		WebElement area = driver.findElement(By.xpath("/html/body/div[6]"));
		List<WebElement> it = driver.findElements(By.tagName("a"));
		System.out.println(it.size());
		for ( int i=0;i<it.size();i++)
		System.out.println(it.get(i).getText());
		
		
		
		
	}

}
