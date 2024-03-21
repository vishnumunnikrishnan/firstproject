package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void tiltleverification()
	{
		String exp="facebook";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		if (actualtitle.equals(exp))
			System.out.println("pass");
		else
			System.out.println("fail");
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	
}
