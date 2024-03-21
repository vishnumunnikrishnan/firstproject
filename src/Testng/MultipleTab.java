package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTab {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/popup.php";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
	@Test
	public void windows() throws InterruptedException
	{
		String parentwindow=driver.getWindowHandle();//current window 
		System.out.println("parent window title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set <String> allwindowhandle = driver.getWindowHandles();
		for(String handle:allwindowhandle)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
                Thread.sleep(3000);
				driver.close();	
			}
		driver.switchTo().window(parentwindow);
	}
}
}
