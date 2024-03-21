package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkvalidation {


ChromeDriver driver;
String baseurl="https://www.google.com";
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()
{
	List <WebElement> ele= driver.findElements(By.tagName("a"));
	System.out.println("Total links="+ele.size());
	for (WebElement li:ele)
	{
		String link=li.getAttribute("href");
		verify(link);
	}
	
	
}
private void verify(String link) {
	
	try
	{
		URL u= new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		if(con.getResponseCode()==200)
		{
			System.out.println("The resonse code is 200-Sucessful");
		}
		else if (con.getResponseCode()==404)
		{
			System.out.println("the response code is 404-client error");
		}
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
}
}

