package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void btest()
	{
		reporter= new ExtentHtmlReporter("./Reportss/myreports.html");
reporter.config().setDocumentTitle("Automationreport");
reporter.config().setReportName("Functional test");
reporter.config().setTheme(Theme.DARK);
extent =new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("host name","local host");
extent.setSystemInfo("os","Windows10");
extent.setSystemInfo("tester name", "Vishnu");
extent.setSystemInfo("Browser name","Chrome");
driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
   @Test
   public void titleverification()
   {
	 test=extent.createTest("FBTitleverifiaction");
	 String exp="Facebook";
	 String actual=driver.getTitle();
	 Assert.assertEquals(exp,actual);
	 
   }
   @AfterTest
   public void teardown()
   {
	   extent.flush();
	   
   }
@AfterMethod
public void browserclose(ITestResult result)
{
	if (result.getStatus()==ITestResult.FAILURE)
	{
		
	test.log(Status.FAIL, "test case failed is"+result.getName());
	test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	}
else if(result.getStatus()==ITestResult.SKIP)
{
	test.log(Status.SKIP,"test case skipped is "+result.getName());
}
else if(result.getStatus()==ITestResult.SUCCESS)
{
	test.log(Status.PASS,"test case passed is "+result.getName());
}

	
}}
	

