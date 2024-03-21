package junitpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
String link="https://www.facebook.com";
@Test
public void test()
{
	try {
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		    if (code==200)
		     {
			System.out.println("Response code is 200-sucessful");
		     }
			else
			{
			System.out.println("response code not expected");
			}
	} 
	catch( Exception e)
	{
System.out.println(e.getMessage());
	}
}
}
