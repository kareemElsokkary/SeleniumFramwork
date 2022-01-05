package Steps;

import org.testng.Assert;

import data.LoadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import tests.TestBase;

public class RegisterwithValidTestData extends TestBase {
	String message = LoadProperties.userData.getProperty("messageforverifytheREgister");

	HomePage homePage;
	RegisterPage reg;
	
	@Given("User in Registeration page")
	public void user_in_registeration_page() {
		homePage = new HomePage(driver);
		driver.navigate().to("https://www.lidl.de/");
		homePage.clickOnmyAccount();
		homePage.register();
	}
	@When("Enter The User Data with {string} , {string}")
	public void enter_the_user_data_with(String string, String string2)
	{
		reg = new RegisterPage(driver);
		reg.registerNewUser(string, string2);
	}
	@Then("Registeration is succesful")
	public void registeration_is_succesful() {
		reg.IsEmailsent();
	}
	
	
	
	
}
