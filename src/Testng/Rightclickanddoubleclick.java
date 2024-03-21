package Testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickanddoubleclick {
ChromeDriver driver;
String baseurl=https://
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	@Test
	public void testing()
	{
		WebElement rightclick=driver.findelement(By.xpath(""))	
	 Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		driver.findElement(By.xpath("")).click;
		driver.switchTo().alert().accept();
		WebElement doubleclick=driver.findElement(By.xpath(""));
		act.doubleClick(doubleclick).perform();
		Alert a=driver.switchTo().alert();
		System.out.println("alert text="+a.getText());
		a.accept();
		
	}
}
