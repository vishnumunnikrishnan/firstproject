package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
ChromeDriver driver;
String baseurl="https:/www.janasya.com";
@Before
public void setup()
{
	driver =new ChromeDriver();
	driver.get(baseurl);

}
	@Test
	public void sitepage()
	{
		driver.findElement(By.xpath("//div[@id=\'HeaderNavigation']/nav/ul/li[1]/a/span")).click();
		driver.navigate().back();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("salwar",Keys.ENTER);
		driver.navigate().back();
		
	}
	
}
