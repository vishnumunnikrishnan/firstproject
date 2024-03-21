package Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Parameters({"username","password"})
	@Test
	public void login(String username,String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

}
