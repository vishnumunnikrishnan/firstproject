package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;


public class Fblogintest  {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	
	@Test
	public void testing()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abcd@gmail.com","123456");
		ob.login();
		
	}
}
