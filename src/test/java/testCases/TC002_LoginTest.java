package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {
	
	@Test
	public void Verify_login()
	{
		logger.info("*******Starting TC 0002 LoginTest*****");
	
	try {
	    // Home Page actions
	    HomePage hp = new HomePage(driver);
	    hp.clickMyAccount();
	    hp.clickLogin();

	    // Login Page actions
	    LoginPage lp = new LoginPage(driver);
	    lp.SetEmail(p.getProperty("email"));           // Reading email from config.properties
	    lp.SetPassword(p.getProperty("password"));     // Reading password from config.properties
	    lp.clickLogin();

	    // My Account Page validation
	    MyAccountPage macc = new MyAccountPage(driver);
	    boolean targetPage = macc.isMyAccountPageExists();
	    Assert.assertTrue(targetPage);                 // Validate successful login
	}
	catch (Exception e) {
	    Assert.fail();                                 // Fail the test if any exception occurs
	}

}
}