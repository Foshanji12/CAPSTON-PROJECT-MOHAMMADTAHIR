package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@And("User click on Orders section")
	public void serClickONOrders() {
		waitTillClickable(factory.accountpage().OrderButtom);
		click(factory.accountpage().OrderButtom);
		logger.info("User Clicked on order select");
	}

	@And("User click on first order in list")
	public void UserClickonFirstOrder() {
		waitTillClickable(factory.accountpage().FirstOrder);
		click(factory.accountpage().FirstOrder);
		logger.info("User Clicked on First order");
	}

	@And("User click on Cancel The Order button")
	public void UserClickOnChancleButtun() {
		waitTillClickable(factory.orderpage().ChancleOrderBtn);
		click(factory.orderpage().ChancleOrderBtn);
		logger.info("User Clicked on chancle Button");
	}

	@And("User select the cancelation Reason {string}")
	public void UserSelecttheReasen(String WA) {
		waitTillClickable(factory.orderpage().Reson);
		click(factory.orderpage().Reson);
		selectByVisibleText(factory.orderpage().Reson, WA);
		logger.info("User Selecetedd the reson");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		waitTillClickable(factory.orderpage().ChancleSubmitBtn);
		click(factory.orderpage().ChancleSubmitBtn);
		logger.info("User Clicked on Chancle order button");

	}

	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void AchancleMassageShouldBeDisplayedd() {
		logger.info("A massage should be displayed your order chancled");
	}

	// Scenario 2 Steps:

	@And("User click on Return Items button")
	public void UserClickOnReturnItemtn() {
		waitTillClickable(factory.orderpage().ReturnItemBtn);
		click(factory.orderpage().ReturnItemBtn);
	}

	@And("User select the Return Reason {string}")
	public void UserSelecTheReturnReson(String st) {
		selectByVisibleText(factory.orderpage().Reson, st);
		logger.info("User Selected The reson ");
	}

	@And("User select the drop off service {string}")
	public void UserSelectTheDropOfService(String fidx) {
		selectByVisibleText(factory.orderpage().WhereToDropOff, fidx);
		logger.info("User Selectted the drop off servise");
	}

	@And("User click on Return Order button")
	public void UserClickOnReturnOrderBtn() {
		waitTillClickable(factory.orderpage().ReturnSubmitBtn);
		click(factory.orderpage().ReturnSubmitBtn);
		logger.info("User Clicked on Return Order Btn");
	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void AMassegeSouldBeDidsplayedreturnsuccess() {
		logger.info("");

	}

	// steps for 3

	@And("User click on Review button")
	public void UserClickOnReviewBtn() {
		waitTillClickable(factory.orderpage().ReviewBtn);
		click(factory.orderpage().ReviewBtn);
		logger.info("User Clicked on ReviewBtn");
	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String red, String blue) {
		sendText(factory.orderpage().AddaHeadLine, red);
		sendText(factory.orderpage().AddAWritin, blue);
		logger.info("User Write Headlines");
	}

	@And("User click Add your Review button")
	public void UserClickAddYourReviewBtn() {
		waitTillClickable(factory.orderpage().ReciewSubmitBn);
		click(factory.orderpage().ReciewSubmitBn);
	}

	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void ReviewMassegeShouldBeDisplayed() {
		logger.info("A Review message Displayed");
	}

}
