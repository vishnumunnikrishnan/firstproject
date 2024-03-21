package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin() throws InterruptedException
	{  
	Thread.sleep(1000);
		//driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("ahghg");
		//driver.findElement(By.name("login")).click();
		
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
