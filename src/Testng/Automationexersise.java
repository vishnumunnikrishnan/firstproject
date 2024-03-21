package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexersise {
ChromeDriver driver;
String baseurl="https://automationexercise.com/";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
public void signup()
{
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("abcdefg");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("abcdefgh12345@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
}
@Test
public void zinformation()
{
	driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345378");
	Select day=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
	day.selectByVisibleText("1");
	Select month=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
	month.selectByVisibleText("April");
	Select year=new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
	year.selectByVisibleText("2018");
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,250)", "");
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("ABCDEFG");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("MNB");
	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("tesla");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("aaaaaaaa");
	driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("bbbbbbbbb");
	Select country=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
	country.selectByVisibleText("India");
	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("THRISSUR");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("680732");
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9895584766");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
	}

