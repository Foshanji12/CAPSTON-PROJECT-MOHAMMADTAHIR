package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountPageSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void UserClickonAccountPage() {
		click(factory.accountpage().AccountOption);
		logger.info("User Clicked on accountoption");
	}

	@And("User update Name {string} and Phone {string}")
	public void Userupdatenameandphonenumber(String name, String phonenumber) {
		sendText(factory.accountpage().nameFeiled, name);
		sendText(factory.accountpage().phoneFeiled, phonenumber);
		logger.info("Namefieled and PhoneNumber got updated");
	}

	@And("User click on Update button")
	public void UserclickonupdateButton() {
		click(factory.accountpage().Updatefieled);
		logger.info("User updated Name and Password successfullly");
	}

	@Then("user profile information should be updated")
	public void Userpofileinformationupdated() {
		logger.info("User should See your Information got updated");
	}

	// Steps for Scenario 2
	@When("User enter below information")
	public void UserenterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountpage().PerviousPasswod, data.get(0).get("previousPassword"));
		sendText(factory.accountpage().NewPassword, data.get(0).get("newPassword"));
		sendText(factory.accountpage().ConfirmPassword, data.get(0).get("confirmPassword"));
		logger.info("User interd all the Value");
	}

	@And("User click on Change Password button")
	public void UserClickonChangePassword() {
		click(factory.accountpage().ChangePasswordBtn);
		logger.info("User Changed the password successfuly");
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void AmassegeShouldBedisplayed() {
		waitTillPresence(factory.accountpage().passwordUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountpage().passwordUpdatedSuccessfully));
		logger.info("success");
	}

	// Steps for Scenario 3
	@And("User click on Add a payment method link")
	public void UserClickonAddaPayment() {
		click(factory.accountpage().AddaNewPaymentMethod);
		waitTillClickable(factory.accountpage().AddaNewPaymentMethod);
		logger.info("User Clicked on Add a payment Option");
	}

	@And("User fill Debit or credit card information")
	public void UserFillDebitOrcridetInformatin(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountpage().CardNumber, data.get(0).get("cardNumber"));
		sendText(factory.accountpage().NameOnTheCard, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountpage().ExpirationMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountpage().EpirationYear, data.get(0).get("expirationYear"));
		sendText(factory.accountpage().securityCode, data.get(0).get("securityCode"));
		logger.info("User interd all information");
	}

	@And("User click on Add your card button")
	public void UserClickonAddYourCrad() {
		click(factory.accountpage().AddaNewPaymentMethod);
		waitTillClickable(factory.accountpage().AddaNewPaymentMethod);
		logger.info("User Clicked on Add Your card");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void AmessageShouldBeDisplayed() {
		waitTillPresence(factory.accountpage().PaymentMethodAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed((factory.accountpage().PaymentMethodAddedSuccessfully)));
		logger.info("A Massege Should Be displayed");
	}

	// steps for 4
	@And("User click on Edit option of card section")
	public void UserClickOnEditOptionOfTheCard() {
		click(factory.accountpage().clicingonThecardNumber);
		click(factory.accountpage().EditOptionBtn);
		waitTillClickable(factory.accountpage().EditOptionBtn);
		logger.info("User Clicked on EditOpton");
	}

	@And("user edit information with below data")
	public void UserEditInformationOption(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountpage().CardNumber);
		sendText(factory.accountpage().CardNumber, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountpage().NameOnTheCard);
		sendText(factory.accountpage().NameOnTheCard, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountpage().ExpirationMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountpage().EpirationYear, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountpage().securityCode);
		sendText(factory.accountpage().securityCode, data.get(0).get("securityCode"));
		logger.info("User Edited All the information");
	}

	@And("user click on Update Your Card button")
	public void UserClickOnUpdateButton() {
		click(factory.accountpage().Updatefieled);
		waitTillClickable(factory.accountpage().Updatefieled);
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void message() {
		waitTillPresence(factory.accountpage().messageUpdateSecc);
		Assert.assertTrue(isElementDisplayed(factory.accountpage().messageUpdateSecc));
	}

	// steps for 5
	@And("User click on remove option of card section")
	public void UserClickOnRemoveOptionOfCard() {
		click(factory.accountpage().RemoveBtn);
		waitTillClickable(factory.accountpage().RemoveBtn);
		logger.info("User Clicked on Remove Btn");
	}

	@Then("payment details should be removed")
	public void PaymentDetailShouldBeRemoved() {
		logger.info("Payment has been deleted");

	}

//	Scenario 6
	@And("User click on Add address option")
	public void UserClickOnAddAddressOption() {
		click(factory.accountpage().AddAccountOption);
		logger.info("User Clicked on Add Account Option");
	}

	@And("user fill new address form with below information")
	public void UserFillNewAddressInformation(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountpage().CountryField, data.get(0).get("country"));
		sendText(factory.accountpage().FullNameField, data.get(0).get("fullName"));
		sendText(factory.accountpage().PhoneNumber, data.get(0).get("phoneNumber"));
		sendText(factory.accountpage().StreetAdreess, data.get(0).get("streetAddress"));
		sendText(factory.accountpage().ApartmentAdreess, data.get(0).get("apt"));
		sendText(factory.accountpage().CityAddress, data.get(0).get("city"));
		selectByValue(factory.accountpage().Statefield, data.get(0).get("state"));
		sendText(factory.accountpage().ZipcodeAddress, data.get(0).get("zipCode"));
		logger.info("User interd all  the information");
	}

	@And("User click Add Your Address button")
	public void UserClickOnAddAddress() {
		click(factory.accountpage().AddtoyourAddresBttn);
		logger.info("User Clicked On add to Your Adress Btn");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void AMassegeShouldBeDisplayedaddedsuccess() {
		waitTillPresence(factory.accountpage().AddressAddedSuccess);
		Assert.assertTrue(isElementDisplayed((factory.accountpage().AddressAddedSuccess)));
		logger.info("A massege should be displayed");
	}

	// Steps for Scenario7
	@And("User click on edit address option")
	public void UserClickOnEditAdsress() {
		click(factory.accountpage().EdditAddressinAddressSection);
		logger.info("User Clicked on Edit Address");
	}
	@And("user fill new address form with below informations")
	public void updateAddress(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountpage().CountryField, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountpage().CountryField);
		sendText(factory.accountpage().FullNameField, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountpage().phoneFeiled);
		sendText(factory.accountpage().phoneFeiled, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountpage().StreetAdreess);
		sendText(factory.accountpage().StreetAdreess, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountpage().ApartmentAdreess);
		sendText(factory.accountpage().ApartmentAdreess, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountpage().CityAddress);
		sendText(factory.accountpage().CityAddress, data.get(0).get("city"));
		selectByValue(factory.accountpage().Statefield, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountpage().ZipcodeAddress);
		sendText(factory.accountpage().ZipcodeAddress, data.get(0).get("zipCode"));
		
	}

	@And("User click update Your Address button")
	public void UserClickUpdateYourAddressBn() {
		click(factory.accountpage().AddtoyourAddresBttn);
		logger.info("User Clicked on Add to Your Address Btn");

	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountpage().addressUPDATedSuccfully);
		Assert.assertTrue(isElementDisplayed(factory.accountpage().addressUPDATedSuccfully));
		logger.info("Message displayed");
	}
	

	// Steps for number 8
	@And("User click on remove option of Address section")
	public void UserCickOnRemoveAddressOption() {
		click(factory.accountpage().RemoveBtn);
		waitTillClickable(factory.accountpage().RemoveBtn);
		logger.info("User Clicked on Remove Option Of the address");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("the address datail is removed");
	}

}