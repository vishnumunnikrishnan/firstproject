package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginverification {
ChromeDriver driver;
String baseurl="https://automationexercise.com/";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void testing()
{
	String exp="https://automationexercise.com/";
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/input[2]")).sendKeys("vishnuunnikrishnan@gmail.com");
	driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[3]")).sendKeys("Vishnu@mu");
	driver.findElement(By.xpath("//*[@id=\'form\']/div/div/div[1]/div/form/button")).click();
	String actual=driver.getCurrentUrl();
	if(exp.equals(actual))
	{
		System.out.println("The login is sucessfull");
	}
	else
	{
		System.out.println("Login not sucessfull");
	}
}
}
