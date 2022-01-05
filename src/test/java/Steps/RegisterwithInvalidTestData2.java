package Steps;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import tests.TestBase;
import tests.TestBaseForRegister;

public class RegisterwithInvalidTestData2 extends TestBaseForRegister {

	HomePage homePage;
	RegisterPage reg;

	public void setupTest() {
		homePage = new HomePage(driver);
		driver.navigate().to("https://www.lidl.de/");
		homePage.clickOnmyAccount();
		homePage.register();
		reg = new RegisterPage(driver);

	}

	@Given("User in Registeration page with invalid TestData")
	public void user_in_registeration_page_with_invalid_test_data() {

		homePage = new HomePage(driver);
		driver.navigate().to("https://www.lidl.de/");
		homePage.clickOnmyAccount();
		homePage.register();

	}
	@When("Enter The User invalid Data with {string} , {string}")
	public void enter_the_user_invalid_data_with(String string, String string2) {
		reg = new RegisterPage(driver);
		reg.registerNewUser(string, string2);
	}
	@Then("Registeration is unsuccesful")
	public void registeration_is_unsuccesful() {

		Assert.assertTrue(reg.getinvaildEmail().contains("Ungültige E-Mail-Adresse"));

	}



	@Given("User in Registeration page with invalid Password TestData")
	public void user_in_registeration_page_with_invalid_password_test_data() {

	}
	@When("Enter The User invalid Password Data with {string} , {string}")
	public void enter_the_user_invalid_password_data_with(String string, String string2) {

		reg = new RegisterPage(driver);
		reg.clearTestdatainput();
		reg.registerNewUser(string, string2);


	}
	@Then("Registeration is unsuccesful with invalid Password")
	public void registeration_is_unsuccesful_with_invalid_password() throws InterruptedException {

		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(200);
		//Assert.assertTrue(reg.getColorofPasswordthatLessthan10Chrachters().asHex().equals("#e60a14"));


		reg.IsPasswordhasRedColour();




	}


}
