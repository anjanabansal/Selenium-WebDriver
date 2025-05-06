package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import po.Signup;
import utility.utility;
//import po.Signup;
public class testsignup {
	
	public static WebDriver driver;
	ExtentSparkReporter  et  =  new ExtentSparkReporter("src\\test\\resources\\htmlreport.html");
	ExtentReports e =  new ExtentReports();
	
	
	
	 
//	 extent.attachReporter(spark);
//	 extent.attachReporter(spark);
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		
		
		driver.get(utility.getDataFromPropertiesFile("url"));
		driver.manage().window().maximize();
	}
	@Test
	public void testsignup() {
		e.attachReporter(et);
		ExtentTest test  =  e.createTest("Testing the framework");
		Signup s = new Signup(driver);
		boolean status  = s.performSignup();
		
		System.out.println(status);
		if (status ==true) {
			test.log(Status.PASS, "Able to fill the signup");
		}else {
			test.log(Status.FAIL, "Not able to fill the signup");
		}
		Assert.assertEquals(false, status);
	}
	
	@AfterClass
	public void teardown() {
		e.flush();
		driver.close();
	}
}
