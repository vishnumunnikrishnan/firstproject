package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	ChromeDriver driver;
	String baseurl="http://register.rediff.com/register/register.php?FormName=user_details";
@BeforeTest
public void setup()
{
	
	driver = new ChromeDriver();
}
@BeforeMethod
public void siteloading()
{
	
	driver.get(baseurl);
	
}
@Test(priority=1)
public void titleverification()
{
	String exp="Rediffmail";
	String act=driver.getTitle();
	if (act.contains(exp))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
@Test(priority=2)
public void contentverification()
{
	String src=driver.getPageSource();
	if (src.contains("Full Name"))
	{
		System.out.println("Full name label is present");
		
	}
	else
	{
		System.out.println("Full name label is not present");
	}
}
@Test(priority=3)
public void heading()
{
boolean heading=driver.findElement(By.xpath("//div[@id='wrapper']/table [2]/tbody/tr/td[1]")).isDisplayed();
if (heading)
	System.out.println("the heading is present");
else
	System.out.println("the heading is not present");
}

@Test(priority=4)
public void buttonverification()
{
	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	if ( buttontext.equals("Create my account"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test (priority=5)
public void buttonenable()
{
boolean p= driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
if(p)
{
	System.out.println("Button is enabled");
	
}
else
	System.out.println("the button is not enabled");

}
}

