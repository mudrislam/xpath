package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javaalert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/muhammedrislam/selenium_jar_files/geckodriver 2");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http.www.tizag.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
	}

}
