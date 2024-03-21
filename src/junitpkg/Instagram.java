package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
ChromeDriver driver;
String baseurl="https://www.instagram.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@Test
public void instagramlogin() throws InterruptedException
{
	Thread.sleep(1000);
driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abn@gmail.com");
WebElement password=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
password.sendKeys("abcdefg");
driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
	}
	
@After 
public void termination() throws InterruptedException
	{
	Thread.sleep(9000);
		driver.quit();
	}
}

