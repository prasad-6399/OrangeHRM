package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	
//	public WebDriver driver;
	

	@Test
	public void verify_login()
	{
		
//		logger.info("*****Strting of test case");
//		LoginPage lp = new LoginPage(driver);
//		
//		
//		lp.setUserName("Admin");
//		logger.info("enter the username");
//		
//		lp.setPassword("admin@123");
//		logger.info("enter the password");
//		
//		
//		lp.clickLogin();
//		logger.info("clicked on the login button");
		
		logger.info("    Str=arting of test case");
		LoginPage lp = new LoginPage(driver);
		
		logger.info("enter the username");
		lp.setUserName("Admin");
		
		logger.info("enter the password");
		lp.setPassword("admin@123");
		
		logger.info("clicked on the login button ");
		lp.clickLogin();
	}
}
