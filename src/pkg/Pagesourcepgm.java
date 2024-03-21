package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {
	public static void main(String[] args) {
		String baseurl="http://www.google.com";
		ChromeDriver driver =new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		System.out.println("Gmail text is present" );
		else
			System.out.println("Gmail text is not present");
		driver.quit();
	}
}
