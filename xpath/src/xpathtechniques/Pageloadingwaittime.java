package xpathtechniques;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageloadingwaittime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/muhammedrislam/selenium_jar_files/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");
		//Thread.sleep(5000);
		//driver.findElement(By.cssSelector("#email")).sendKeys("muhammed");
		
		//Loading page wait time
		//driver.manage().timeouts().pageLoadTimeout(200,TimeUnit.SECONDS );

		//Explicit wait time 
		WebElement vet=driver.findElement(By.xpath("//*[@id='pass']"));
		
		WebDriverWait wt=new WebDriverWait(driver, 500);
		wt.until(ExpectedConditions.visibilityOfAllElements(vet));

		//Implicit wait
		
				driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);


		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
