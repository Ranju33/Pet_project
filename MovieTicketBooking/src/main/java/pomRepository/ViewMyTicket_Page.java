package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMyTicket_Page {
		public ViewMyTicket_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//a[text()='View MyTicket']")
		private WebElement ViewMyTicketButton;	
		
		@FindBy(id="fname")
		private WebElement MobileNumbertextField;
		
		@FindBy(id="birthday")
		private WebElement BookedDate;
		
		@FindBy(xpath="//button[text()='Get Tickets']")
		private WebElement GetTicketsButton;
		
		@FindBy(xpath="//p[text()='View']")
		private WebElement ViewButton;
		
		@FindBy(xpath="//span[text()='click here']")
		private WebElement Download;

		public WebElement getViewMyTicketButton() {
			return ViewMyTicketButton;
		}

		public WebElement getMobileNumbertextField() {
			return MobileNumbertextField;
		}

		public WebElement getBookedDate() {
			return BookedDate;
		}

		public WebElement getGetTicketsButton() {
			return GetTicketsButton;
		}

		public WebElement getViewButton() {
			return ViewButton;
		}

		public WebElement getDownload() {
			return Download;
		}
}
