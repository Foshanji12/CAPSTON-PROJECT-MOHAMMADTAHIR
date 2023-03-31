package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class Homepagesteps extends BaseSetup {

	public Homepagesteps() {
		PageFactory.initElements(getDriver(), this);
	
	
	}
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	@FindBy(xpath = "//*[text()='TEKSCHOOL']")
	public WebElement tekschoolLogo;
	@FindBy(xpath = "//*[@class='image']")
	public WebElement pokemonImage;
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountOption;
	@FindBy(id = "logoutBtn")
	public WebElement logoutoption;
	@FindBy(xpath = "//button[@id='hamburgerBtn']")
	public WebElement allIconbutton;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;
	@FindBy(id = "accountLink")
	public WebElement account1;
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computer;
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smarthome;
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement Sports;
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement Automative;
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement TvAndVideo;
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement VideoGames;
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement Accessories;
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement Networking;
	@FindBy(xpath = "//span[text()=\"Smart Home Lightning\"]")
	public WebElement smarthomelight;
	@FindBy(xpath = "//span[text()=\"Plugs and Outlets\"]")
	public WebElement plag;
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement AthleticClothing;
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement ExerciseFitness;
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement AutomativePartsAccessories;
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement MotorCyclePowersports;
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sidebar;
	@FindBy(xpath = "//select[@id='search']")
	public WebElement searchforcategory;
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement ItemKASASMARTPLUG;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement QTYOption;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addTOtheCardOption;
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartQuantity;
	@FindBy(xpath = "//div[@id='cartBtn']")
	public WebElement cartButton;
	@FindBy(id = "proceedBtn")
	public WebElement proceedBtnCheckout;
	@FindBy(id = "addAddressBtn")
	public WebElement clickONADDnewAddress;
	@FindBy(id = "addPaymentBtn")
	public WebElement Addingpaymentmethod;
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrder;
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement ordermessage;
	@FindBy(xpath = "//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement iconAPEX;
	
	
}
