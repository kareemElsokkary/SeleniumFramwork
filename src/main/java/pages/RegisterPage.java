package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.support.Color;

public class RegisterPage extends PageBAse {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="field_Email")
	WebElement email;

	@FindBy(id="field_ConfirmEmail")
	WebElement confirmemail;

	@FindBy(id="field_Password")
	WebElement password;

	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/button")
	WebElement submit;

	@FindBy(xpath="/html/body/div/form/div/section/div/div/div[2]/div/div/div[1]/p")
	WebElement verify;

	@FindBy(xpath= "/html/body/div/form/div/section/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/p")
	WebElement invalidEmail;

	@FindBy(xpath= "/html/body/div/form/div/section/div/div/div[2]/div/div/div[2]/div/button[2]")
	WebElement emailIsSent;


	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/div[2]/p[1]/span")
	WebElement atLeast10Characters;

	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/div[2]/p[2]/span")
	WebElement atLeastsmallCharacters;


	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/div[2]/p[3]/span")
	WebElement atLeastbigCharacters;

	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/div[2]/p[4]/span")
	WebElement atLeast1number;

	@FindBy(xpath = "/html/body/div/form/div/section/div/div/div[1]/div/div[2]/p[5]/span")
	WebElement atLeastspecialcase;




	public void registerNewUser(String Email, String Pass) {
		email.clear();
		confirmemail.clear();
		password.clear();
		email.sendKeys(Email);
		confirmemail.sendKeys(Email);
		password.sendKeys(Pass);
		submit.click();
		
	}
	
	public void clearTestdatainput() {
		 email.sendKeys(Keys.CONTROL + "a");
		 email.sendKeys(Keys.DELETE);
		
		 confirmemail.sendKeys(Keys.CONTROL + "a");
		 confirmemail.sendKeys(Keys.DELETE);
		 
		 password.sendKeys(Keys.CONTROL + "a");
		 password.sendKeys(Keys.DELETE);
		 
	
		
	}

	public String getverifyText() {
		return verify.getText();
	}

	public String getinvaildEmail() {
		return invalidEmail.getText();
	}

	public boolean IsEmailsent() {

		return emailIsSent.isDisplayed();
	}

	public void clickOnConfirmTestData() {
		submit.click();
	}

	public void printColorofPasswordCondition() {
		String Colours = atLeast10Characters.getCssValue("color");
		System.out.println("the colour is "+ Colours ) ;
	}
	public Color getColorofPasswordthatLessthan10Chrachters() {

		Color colorOfPassword = Color.fromString(atLeast10Characters.getCssValue("color"));
		return colorOfPassword;
	}

	public void IsPasswordhasRedColour() {
		Color colorOfPassword1 = Color.fromString(atLeast10Characters.getCssValue("color"));
		Color colorOfPassword2 = Color.fromString(atLeastsmallCharacters.getCssValue("color"));
		Color colorOfPassword3 = Color.fromString(atLeastbigCharacters.getCssValue("color"));
		Color colorOfPassword4 = Color.fromString(atLeast1number.getCssValue("color"));
		Color colorOfPassword5 = Color.fromString(atLeastspecialcase.getCssValue("color"));

		Assert.assertTrue(
				colorOfPassword1.asHex().equals("#e60a14") ||
				colorOfPassword1.asHex().equals("#e60a14")||
				colorOfPassword2.asHex().equals("#e60a14")||
				colorOfPassword3.asHex().equals("#e60a14")||
				colorOfPassword4.asHex().equals("#e60a14")||
				colorOfPassword5.asHex().equals("#e60a14")
				);


	}



}
