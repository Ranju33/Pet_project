package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Owner_Page {
	
	public Owner_Page(WebDriver driver) {
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
	
	@FindBy(xpath="//a[text()='Admin']")
	private WebElement AdminButton;
	
	@FindBy(id="exampleInputEmail1")
	private WebElement MoviesNameTextField;
	
	@FindBy(xpath="//option[text()='One']")
	private WebElement DaysDropdown;
	
	@FindBy(xpath="//option[text()='3']")
	private WebElement ScreenDropdown;
	
	@FindBy(xpath="//option[text()='U/A']")
	private WebElement CertificateDropdown;
	
	@FindBy(id="datee")
	private WebElement Date;
	
	@FindBy(xpath="//option[text()='12:00 PM']")
	private WebElement TimeDropdown;
	
	@FindBy(xpath="//option[text()='150']")
	private WebElement PriceDropdown;
	
	@FindBy(xpath="//input[@placeholder='Enter Trailer Url']")
	private WebElement TrailerTextField;
	
	@FindBy(xpath="//option[text()='OPEN']")
	private WebElement BookingOpenDropdown;
	
	@FindBy(xpath="//option[text()='RUNNING']")
	private WebElement MovieStatusDropdown;
	
	@FindBy(xpath="//button[text()=' SUBMIT ']")
	private WebElement SubmitButton;

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

	public WebElement getAdminButton() {
		return AdminButton;
	}

	public WebElement getMoviesNameTextField() {
		return MoviesNameTextField;
	}

	public WebElement getDaysDropdown() {
		return DaysDropdown;
	}

	public WebElement getScreenDropdown() {
		return ScreenDropdown;
	}

	public WebElement getCertificateDropdown() {
		return CertificateDropdown;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getTimeDropdown() {
		return TimeDropdown;
	}

	public WebElement getPriceDropdown() {
		return PriceDropdown;
	}

	public WebElement getTrailerTextField() {
		return TrailerTextField;
	}

	public WebElement getBookingOpenDropdown() {
		return BookingOpenDropdown;
	}

	public WebElement getMovieStatusDropdown() {
		return MovieStatusDropdown;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}	

}
