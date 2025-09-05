package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage {

	
	//constructor
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmailAddress;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement btnLogin;
		
		
		//Actions
		
		public void SetEmail(String email)
		{
			txtEmailAddress.sendKeys(email);
		}
		
		public void SetPassword(String pwd)
		
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void clickLogin()
		
		{
			btnLogin.click();
		}
	}
	
	


