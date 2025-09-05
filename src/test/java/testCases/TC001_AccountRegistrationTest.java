package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {
	

	
	
	@Test
	public void Account_Registration_Page()
	
	{
		logger.info("**********TC001_AccountRegistrationTest********");
		
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("Clicked on my account link");
		
		hp.clickMyRegister();
		logger.info("Clicked on my Register link");
		
		
		
		AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
		regPage.setFirstName(randomeString().toUpperCase());
		regPage.setLastName( randomeString().toUpperCase());
		regPage.setEmail(randomeString()+"@gmail.com");
		regPage.setTelephone(randomeNumber());
		
		
		String password=randomeAlphNumeric();
		
		regPage.setPassword(password);
		regPage.setConfirmPassword(password);
		
		regPage.setPrivacyPolicy();
		regPage.clickContinue();
		
		logger.info(" Validating expected message");
		String confmsg=regPage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch (Exception e)
		{
			logger.error("test Failed..");
			logger.debug("debug logs..");
			Assert.fail();
			
		}
		
		logger.info("**********Finished  TC001_AccountRegistrationTest********");
	}
	
}
	
	
	
	
	


