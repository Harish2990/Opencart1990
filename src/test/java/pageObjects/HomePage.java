package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//Constructor
		public HomePage  (WebDriver Driver)
		
		{
			
			super(Driver);
		}
		
	
	//Locators
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	
	
	
	
	//Actions
	
	public void clickMyAccount()
	
	{
		
		lnkMyAccount.click();
	}
	
	public void clickMyRegister()
	
	{
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
		
	}
	
	
	
}
