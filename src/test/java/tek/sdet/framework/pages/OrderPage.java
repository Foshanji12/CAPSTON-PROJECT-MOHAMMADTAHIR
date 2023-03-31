package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class OrderPage extends BaseSetup {
	
	public OrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "searchInput")
	public WebElement searchInput;
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	@FindBy(xpath = "//img[@class='image']")
	public WebElement pokemonImage;
	@FindBy(id = "orderLink")
	public WebElement OrderOption;
	@FindBy(xpath ="//p[contains(text(),'Show Details')]")
	public WebElement FirtOrder;
	@FindBy(xpath ="//button[@id='returnBtn']")
	public WebElement ReturnItemBtn;
	@FindBy(id ="reasonInput")
	public WebElement Reson;
	@FindBy(id ="dropOffInput")
	public WebElement WhereToDropOff;
	@FindBy(id ="orderSubmitBtn")
	public WebElement ReturnSubmitBtn;
	@FindBy(id ="reviewBtn")
	public WebElement ReviewBtn;
	@FindBy(id ="headlineInput")
	public WebElement AddaHeadLine;
	@FindBy(xpath ="//textarea[@id='descriptionInput']")
	public WebElement AddAWritin;
	@FindBy(id ="reviewSubmitBtn")
	public WebElement ReciewSubmitBn;
	@FindBy(id ="cancelBtn")
	public WebElement ChancleOrderBtn;
	@FindBy(id ="orderSubmitBtn")
	public WebElement ChancleSubmitBtn;
}