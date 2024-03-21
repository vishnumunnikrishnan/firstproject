package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkelements {
	
	
	ChromeDriver driver;
	String baseurl="https:/www.facebook.com";
	@Before
	public void serup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
   @Test
   public void linkelements()
   {
	   
	 List <WebElement> links= driver.findElements(By.tagName("a")); 
	 System.out.println(links.size());
	 for (WebElement ele:links)
	 {
		 String link=ele.getAttribute("href");
		 String linktext=ele.getText();
		 System.out.println(link+"------------------"+linktext);
	 }
   }
}
