package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Test.Baseclass;

public class Fbsignup  {
	
WebDriver driver;
By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
By signupbutton=By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/a");

public Fbsignup(WebDriver driver)
{
	this.driver=driver;
}
public void createpage()
{
	driver.findElement(createpage).click();
	
}
public void signupclick()
{
	driver.findElement(signupbutton).click();
}
public void titleverification()
{
	String actualtitle= driver.getTitle();
	String exp="Facebook";
	if(actualtitle.equals(exp))
	{
		System.out.println("title verifed");
		
	}
	else
	{
		System.out.println("title verification failed");
	}
}
}
