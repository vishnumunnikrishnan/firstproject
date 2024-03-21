package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");//to open browser
String s="Google";//expectation
String a=driver.getTitle();
//System.out.println(s.equals(a));
if (s.equals(a))

	System.out.println("pass");
	
else
	System.out.println("fail");
driver.quit();

}

}
