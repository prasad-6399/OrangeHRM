package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	 
	
	
	//constructor 
	
//	LoginPage2(WebDriver driver)
//	{
//		this.driver=driver;
//	}
	
//	LoginPage(WebDriver driver)
//	{
//	   this.driver=driver;
//	   PageFactory.initElements(driver, this);
//	}
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	
//	 By username =By.xpath("//input[@placeholder='Username']");
//	 
//	 By password =By.xpath("//input[@placeholder='Password']");
//	 
//	 By login_button =By.xpath("//button[normalize-space()='Login']");
	
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement password;	
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement login;
	 
	
//	@FindBy(tagName="a")
//	 List<WebElement> links;
	
	//action methods
	 
//	 public void setUserName(String user)
//	 {
//		username.sendKeys(user);
//	 }
//	 
//	 
//	 
//	 public void  setPassword(String pwd)
//	 {
//		 password.sendKeys(pwd);
//	 }
//	 
//	 public void clickLogin()
//	 {
//		 login.click();
//	 }
//	
//	
	
	
	
	public void setUserName(String user)
	{
		username.sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void clickLogin()
	{
		login.click();
	}
}
