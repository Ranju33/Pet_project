package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Movies_Page {
	public Movies_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Movies']")
	private WebElement Movies;
	
	@FindBy(xpath="//div[text()=' Saturday ']")
	private WebElement Saturday;
	
	@FindBy(xpath="//h6[text()='03:45 PM']")
	private WebElement Time;
	
	@FindBy(xpath="(//img[@class='sofaicon'])[2]")
	private WebElement Seats;
	
	@FindBy(xpath="//button[text()=' Continue ']")
	private WebElement ContinueButton;
	
	@FindBy(id="staticEmail")
	private WebElement EmailTextField;
	
	@FindBy(id="inputPassword")
	private WebElement PhoneNoTextField;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement ConfirmButton;
	
	@FindBy(xpath="//span[text()='click here']")
	private WebElement Download;

	public WebElement getMovies() {
		return Movies;
	}

	public WebElement getSaturday() {
		return Saturday;
	}

	public WebElement getTime() {
		return Time;
	}

	public WebElement getSeats() {
		return Seats;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPhoneNoTextField() {
		return PhoneNoTextField;
	}

	public WebElement getConfirmButton() {
		return ConfirmButton;
	}

	public WebElement getDownlaod() {
		return Download;
	}	
		
}
