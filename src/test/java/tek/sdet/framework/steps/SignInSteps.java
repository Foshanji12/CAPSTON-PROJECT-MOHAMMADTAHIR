package tek.sdet.framework.steps;

import org.junit.Assert;

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
		sendText(factory.signinpage().emailField, emailValue);
		sendText(factory.signinpage().passwordField, passValue);
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
}
