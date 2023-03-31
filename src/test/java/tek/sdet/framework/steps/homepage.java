package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class homepage extends CommonUtility {
	POMFactory factory = new POMFactory();

	// 1
	@When("User click on All section")
	public void clickingAllTheButton() {
		click(factory.homepage().allIconbutton);
		logger.info("User clicked on all icon button");
	}

	@Then("below options are present in Shop by Department sidebar")
	public void optionAreAvilable(DataTable options) {
		List<List<String>> optionsToDisplay = options.asLists(String.class);
		Assert.assertTrue(isElementDisplayed(
				getDriver().findElement(By.xpath("//span[text() = '" + optionsToDisplay.get(0).get(0) + "']"))));
		logger.info("options Electronics, Computers, Smart Home, Sports and Automative are present");
	}

	// SC 2
	@And("User on {string}")
	public void displayingItem(String departement) {
		List<WebElement> dept = factory.homepage().sidebar;
		for (WebElement element : dept) {
			if (element.getText().equals(departement)) {
				element.click();
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void presentOption(DataTable dataTable) {
		List<List<String>> departmentSection = dataTable.asLists(String.class);
		List<WebElement> dept = factory.homepage().sidebar;
		for (int i = 0; i < departmentSection.get(0).size(); i++) {
			for (WebElement element : dept) {
				if (element.getText().equals(departmentSection.get(0).get(i))) {
					Assert.assertTrue(element.isDisplayed());
					logger.info("THe Items is present");
				}
			}
		}
	}

	// SC 3

	@And("User change the category to {string}")
	public void category(String namee) {
		selectByVisibleText(factory.homepage().searchforcategory, namee);
		logger.info("user choosed the smart home");
	}

	@And("User search for an item {string}")
	public void item(String item) {
		sendText(factory.homepage().searchBarInput, item);
		logger.info("user search the item and click on search Button");
	}

	@And("User click on Search icon")
	public void searchicon() {
		click(factory.homepage().searchButton);
		logger.info("User clicked on Search icon");
	}

	@And("User click on item")
	public void clickOnItem() {
		waitTillClickable(factory.homepage().ItemKASASMARTPLUG);
		click(factory.homepage().ItemKASASMARTPLUG);
		logger.info("user clicked on item");
	}

	@And("User select quantity {string}")
	public void quantity(String open) {
		selectByVisibleText(factory.homepage().QTYOption, open);
		logger.info("User select Quantity 2");
	}

	@And("User click add to Cart button")
	public void addToCard() {
		click(factory.homepage().addTOtheCardOption);
		logger.info("User clicked add to Cart button");
	}

	// SC 4

	@And("User click on Cart option")
	public void clickoption() {
		click(factory.homepage().cartButton);
		logger.info("User clicked on Cart option");
	}

	@And("User click on Proceed to Checkout button")
	public void checkout() {
		click(factory.homepage().proceedBtnCheckout);
		logger.info("User clicked on Proceed to Checkout button");
	}

	@And("User click Add a new address link for shipping address")
	public void newAddress() {
		click(factory.homepage().clickONADDnewAddress);
		logger.info("User clicked Add a new address link for shipping address");
	}

	@And("User click Add a credit card or Debit Card for Payment method")
	public void clickCridit() {
		click(factory.homepage().Addingpaymentmethod);
	}

	@And("User click on Place Your Order")
	public void placeOrder() {
		click(factory.homepage().placeOrder);
		logger.info("User clicked on Place Your Order");
	}

	// SC 5
	@And("User change the categorys to {string}")
	public void changeTOElectronics(String electronic) {
		selectByValue(factory.homepage().searchforcategory, electronic);
		logger.info("Change to category");

	}

	@And("User search for an items {string}")
	public void item1(String item) {
		click(factory.homepage().searchBarInput);
		sendText(factory.homepage().searchBarInput, item);
		logger.info("user search for item");
	}

	@And("User click on items")
	public void clickOnIttem() throws InterruptedException {
		waitTillPresence(factory.homepage().iconAPEX);
		click(factory.homepage().iconAPEX);
		logger.info("click on item");
	}

	@And("User select quantitys {string}")
	public void quantity1(String quan) {
		selectByValue(factory.homepage().QTYOption, quan);
		logger.info("search for quantity");
	}
}
