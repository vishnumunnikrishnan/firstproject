package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerthandling {
	ChromeDriver driver;
	String baseurl=" ";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
@Test
public void handling()
{
	driver.findElement(By.xpath(""));
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println("ALert text="+alerttext);
	a.accept();
}
}
