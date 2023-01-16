package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Employee_Page {
	
	public New_Employee_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Pages ']")
	private WebElement PagesButton;
	
	@FindBy(xpath="//a[text()='Admin Login']")
	private WebElement AdminLoginButton;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement UsernameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement PasswordTextfield;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//p[text()='Employees']")
	private WebElement EmployeeButton;
	
	@FindBy(xpath="//div[text()=' New Employee ']")
	private WebElement NewEmployeeButton;
	
	@FindBy(id="inputEmail4")
	private WebElement EmailTextField;
	
	@FindBy(id="inputPassword4")
	private WebElement NameTextField;
	
	@FindBy(id="inputAddress")
	private WebElement AddressTextField;
	
	@FindBy(id="inputAddress2")
	private WebElement AreaTextField;
	
	@FindBy(id="inputCity")
	private WebElement UserNameTextField;
	
	@FindBy(xpath="//option[text()='ROLE_ADMIN']")
	private WebElement RoleDropdown;
	
	@FindBy(xpath="(//input[@placeholder='Apartment, studio, or floor'])[2]")
	private WebElement SalaryTextFiel;
	
	@FindBy(id="inputZip")
	private WebElement MobileNumberTextField;
	
	@FindBy(xpath="//button[text()=' AddEmployee ']")
	private WebElement AddEmployeeButton;
	
	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement CancelButton;

	public WebElement getPagesButton() {
		return PagesButton;
	}

	public WebElement getAdminLoginButton() {
		return AdminLoginButton;
	}

	public WebElement getUsernameTextfield() {
		return UsernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getEmployeeButton() {
		return EmployeeButton;
	}

	public WebElement getNewEmployeeButton() {
		return NewEmployeeButton;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getNameTextField() {
		return NameTextField;
	}

	public WebElement getAddressTextField() {
		return AddressTextField;
	}

	public WebElement getAreaTextField() {
		return AreaTextField;
	}

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getRoleDropdown() {
		return RoleDropdown;
	}

	public WebElement getSalaryTextFiel() {
		return SalaryTextFiel;
	}

	public WebElement getMobileNumberTextField() {
		return MobileNumberTextField;
	}

	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

}
