package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgm {
ChromeDriver driver;
String baseurl="https://www.amazon.in/";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
public void testing()
{
	WebElement search=driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
	search.sendKeys("mobile phones",Keys.ENTER);
   String exptitle="Amazon.in:Mobile Phones";
   String acttitle=driver.getTitle();
   if (acttitle.equalsIgnoreCase(exptitle))
   {
	   System.out.println("The title is verified");
	   
   }
   String parentwindow=driver.getWindowHandle();
   driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
   Set <String> allwindowhandles=driver.getWindowHandles();
   for(String handle:allwindowhandles)
   {
	   if(!handle.equalsIgnoreCase(parentwindow))
	   {
		   driver.switchTo().window(handle);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,500)", "");
		   driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		   driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
	   }
   }
}
}