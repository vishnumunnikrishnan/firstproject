package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
@Test
public void drag()
{
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement debitaccount=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement debitamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement creditaccount=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement creditamount=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(bank, debitaccount);
	act.dragAndDrop(amount, debitamount);
	act.dragAndDrop(sales, creditaccount);
	act.dragAndDrop(amount, creditamount);
	act.perform();
	String src=driver.getPageSource();
	if (src.contains("Perfect!"))
		System.out.println("pass");
	else
		System.out.println("fail");
	
}
}
