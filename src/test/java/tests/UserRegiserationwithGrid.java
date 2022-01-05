package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.RegisterPage;

public class UserRegiserationwithGrid extends TestBaseForGrid{

	HomePage homePage;
	RegisterPage reg;
	String Email = LoadProperties.userData.getProperty("NewEmail");
	String Password = LoadProperties.userData.getProperty("Password");
	String message = LoadProperties.userData.getProperty("messageforverifytheREgister");
	
	@Test
	public void openRegisterPage() {
		homePage = new HomePage(getDriver());
		homePage.clickOnmyAccount();
		homePage.register();
	}
	
	@Test
	public void register() {
	reg = new RegisterPage(getDriver());
	reg.registerNewUser(Email, Password);
	}
	
	@Test
	public void verifyRegisteration() {
		
	Assert.assertTrue(reg.getverifyText().contains(message));
	}

}
