package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbsignup;

public class Fbsignuptest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

@Test
public void sigup()
{
	Fbsignup ob=new Fbsignup(driver);
	ob.titleverification();
	ob.createpage();
	ob.signupclick();
	
}
}
