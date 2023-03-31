package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class SignInPage extends BaseSetup {

	public SignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id ="email")
	public WebElement LoginEmail;
	@FindBy(id ="password")
	public WebElement LoginPassword;
	@FindBy(id = "emailInput")
	public WebElement emailField;
	@FindBy(id = "passwordInput")
	public WebElement passwordField;
	@FindBy(id = "loginBtn")
	public WebElement loginButton;
	@FindBy(id = "signinLink")
	public WebElement SignInoption;
	@FindBy(id = "accountLink")
	public WebElement AccountPage;
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement TekSchoologgo;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement Accontoption;
	@FindBy(id = "newAccountBtn")
	public WebElement NewAccount;
	@FindBy(id = "nameInput")
	public WebElement Name;
	@FindBy(id = "confirmPasswordInput")
	public WebElement ConfirmPassword;
	@FindBy(id = "signupBtn")
	public WebElement SingnUpBtn;
	

}
