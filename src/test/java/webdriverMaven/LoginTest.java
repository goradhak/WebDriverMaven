package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	public static WebDriver driver;
	public ChromeOptions o;
	
	@BeforeSuite
	public void setUp(){
		o = new ChromeOptions();
		driver = new ChromeDriver(o);
		
	}
	
	@Test
	public void doLogin(){
		driver.get("http://gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("trainer@way2automation.com");
		//driver.findElement(By.xpath(span(text(),"Next"))).click();
		//driver.findElement(By.id("password")).sendKeys("sdfdf");
		driver.findElement(By.id("SignIn")).click();
	}
	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
