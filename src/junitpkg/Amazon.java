package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
ChromeDriver driver;
String baseurl="https://www.amazon.in";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void amazonpage()
{
	
	WebElement search=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[2]/div[1]/input"));
	search.sendKeys("mobiles", Keys.ENTER);
	driver.navigate().back();
	driver.findElement(By.xpath("//header[@id='navbar-main']/div/div[1]/div[3]/div/a[2]/div/span")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//header[@id='navbar-main']/div/div[4]/div[1]/a/i")).click();
	
}
/*@After
public void termination()
{
	driver.quit();
}*/
}

