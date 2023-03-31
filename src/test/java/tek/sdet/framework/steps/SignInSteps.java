package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	@Given("User is on retail website")
	public void UserIsonRetailWebsite() {
		String actual = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actual, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.signinpage().TekSchoologgo));
	}

	@When("User click on Sign in option")
	public void UserClickonsigninoptin() {
		click(factory.signinpage().SignInoption);
	}

	@And("User enter email {string} and password {string}")
	public void UserEnerEmalandPassword(String emailValue, String passValue) {
		sendText(factory.signinpage().LoginEmail, emailValue);
		sendText(factory.signinpage().LoginPassword, passValue);
		logger.info("User Enterd Email and password");
	}

	@And("User click on login button")
	public void UserClickonliggin() {
		click(factory.signinpage().loginButton);
		logger.info("User Clicked on loggin option");
	}

	@Then("User should be logged in into Account")
	public void Usershouldbesigin() {
		logger.info("User is loged in into account ");
	}

	// Scenario 2 Steps
	@And("User click on Create New Account button")
	public void ClickOnNewAccountButton() {
		waitTillClickable(factory.signinpage().NewAccount);
		click(factory.signinpage().NewAccount);
		logger.info("User Clicked On new account Optioon");
	}

	@And("User fill the signUp information with below data")
	public void UserFillTheSiginUpform(DataTable name) {
		List<Map<String, String>> data = name.asMaps(String.class, String.class);
		sendText(factory.signinpage().Name, data.get(0).get("name"));
		sendText(factory.signinpage().emailField, data.get(0).get("email"));
		sendText(factory.signinpage().passwordField, data.get(0).get("password"));
		sendText(factory.signinpage().ConfirmPassword, data.get(0).get("confirmPassword"));
		logger.info("User Insert The Values");
	}

	@And("User click on SignUp button")
	public void UserClickedSignUpButton() {
		click(factory.signinpage().SingnUpBtn);
		logger.info("User Clicked On SignUp button");
	}

	@And("User should be logged into account page")
	public void UserShouldBeLoggedin() {
		logger.info("UserShouldbeLoggedIn");
	}
}