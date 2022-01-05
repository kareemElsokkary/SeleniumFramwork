package Steps;

import org.testng.Assert;

import data.LoadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import tests.TestBase;

public class RegisterwithBackgorund extends TestBase {
	
	HomePage homePage;
	RegisterPage reg;
	@Given("User in Register page")
	public void user_in_register_page() {
		homePage = new HomePage(driver);
		driver.navigate().to("https://www.lidl.de/");
		homePage.clickOnmyAccount();
		homePage.register();
	}
	@When("Enter User invalid Data with {string} , {string}")
	public void enter_user_invalid_data_with(String string, String string2) {
		reg = new RegisterPage(driver);
		reg.registerNewUser(string, string2);
	}
	@Then("Registeration is unsuccesfully")
	public void registeration_is_unsuccesfully() {
		  Assert.assertTrue(reg.getinvaildEmail().contains("Ungültige E-Mail-Adresse"));

	}
	
	@When("EnterUser Data with {string} , {string}")
	public void enter_user_data_with(String string, String string2) {
		reg = new RegisterPage(driver);
		reg.registerNewUser(string, string2);
	}
	@Then("Registeration is succesfully")
	public void registeration_is_succesfully() {
		
			reg.IsEmailsent();
	}
	
	
}
