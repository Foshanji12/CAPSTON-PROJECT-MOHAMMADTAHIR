package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class Accountpage extends BaseSetup {
	public Accountpage() {
	PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "accountLink")
	public WebElement AccountOption;
	@FindBy(id = "nameInput")
	public WebElement nameFeiled;
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneFeiled;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement Updatefieled;
	@FindBy(id = "orderLink")
	public WebElement OrderButtom;
	@FindBy(id = "cancelBtn")
	public WebElement ChancleBtn;
	@FindBy(xpath = "//p[text() = 'Show Details']")
	public WebElement FirstOrder;
	@FindBy(id = "reasonInput")
	public WebElement ResonInput;
	@FindBy(id= "orderSubmitBtn")
	public WebElement OrderSubmentBtn;
	@FindBy(id ="previousPasswordInput")
	public WebElement PerviousPasswod;
	@FindBy(id="newPasswordInput")
	public WebElement NewPassword;
	@FindBy(id= "confirmPasswordInput")
	public WebElement ConfirmPassword;
	@FindBy(id= "credentialsSubmitBtn")
	public WebElement ChangePasswordBtn;
	@FindBy(xpath ="//div[@class='Toastify__toast-body']")
	public WebElement passwordUpdatedSuccessfully;
	@FindBy(xpath ="//button[@id='paymentSubmitBtn']")
	public WebElement AddaNewPaymentMethod;
	@FindBy(id ="cardNumberInput")
	public WebElement CardNumber;
	@FindBy(id ="nameOnCardInput")
	public WebElement NameOnTheCard;
	@FindBy(id ="securityCodeInput")
	public WebElement securityCode;
	@FindBy(id ="expirationMonthInput")
	public WebElement ExpirationMonth;
	@FindBy(id ="expirationYearInput")
	public WebElement EpirationYear;
	@FindBy(id ="paymentSubmitBtn")
	public WebElement PyamentSubmitBtn;
	@FindBy(xpath ="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement PaymentMethodAddedSuccessfully;
	@FindBy(xpath ="//button[@class='text-blue-800 cursor-pointer hover:underline']")
	public WebElement EditOptionBtn;
	@FindBy(xpath ="//p[@class='account__payment-sub-title']")
	public WebElement clicingonThecardNumber;
	@FindBy(xpath ="//button[contains(text(),'Remove')]")
	public WebElement RemoveBtn;
	@FindBy(xpath ="//*[@class='account__address-new-icon']")
	public WebElement AddAccountOption;
    @FindBy(xpath ="//select[@id='countryDropdown']")
    public WebElement CountryField;
    @FindBy(id ="fullNameInput")
    public WebElement FullNameField;
    @FindBy(id ="streetInput")
    public WebElement StreetAdreess;
    @FindBy(id ="apartmentInput")
    public WebElement ApartmentAdreess;
    @FindBy(id ="cityInput")
    public WebElement CityAddress;
    @FindBy(id ="zipCodeInput")
    public WebElement ZipcodeAddress;
    @FindBy(xpath = "//select[@name='state']")
    public WebElement Statefield;
    @FindBy(xpath ="//div[contains(text(),'Address Added Successfully')]")
    public WebElement AddressAddedSuccess;
    @FindBy(id ="addressBtn")
    public WebElement AddtoyourAddresBttn;
    @FindBy(id ="account__address-btn")
    public WebElement EdditAddress;
    @FindBy(xpath  ="//button[contains(text(),'Edit')]")
    public WebElement EdditAddressinAddressSection;
    @FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
    public WebElement messageUpdateSecc;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")public WebElement addressUPDATedSuccfully;
    @FindBy(id ="phoneNumberInput")
    public WebElement PhoneNumber;
}