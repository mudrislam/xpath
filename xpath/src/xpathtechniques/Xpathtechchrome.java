package xpathtechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtechchrome {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/Users/muhammedrislam/selenium_jar_files/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().window().fullscreen();
driver.get("https://www.facebook.com/");
//System.out.println("app initialized");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("test selenium");
driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys("test selenium");
driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("phone number");
driver.findElement(By.xpath("//*[@id='u_0_q']")).sendKeys("new password");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("muhammed");
	
	
	
	
	}

		
	}

