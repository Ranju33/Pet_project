package skills;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ViewMyTicket_Page;

public class TC_ViewMyTicket_002Test extends Base_Class {
	
	@Test
	public void Booking() throws InterruptedException {
		ViewMyTicket_Page myticket=new ViewMyTicket_Page(driver);
		
		Assert.assertEquals(driver.getTitle(), 
		readFromPropertyFile.getValueProperty("HomePage"),"Home Page is displayed not successfully");
		Reporter.log("Home Page is displayed successfully",true);
				
		myticket.getViewMyTicketButton().click();
		Thread.sleep(2000);
		String phonenumber=readFromPropertyFile.getValueProperty("MobileNumber");
		myticket.getMobileNumbertextField().sendKeys(phonenumber);
		Thread.sleep(2000);
		myticket.getBookedDate().click();
		String date=readFromPropertyFile.getValueProperty("BookedDate");
		myticket.getBookedDate().sendKeys(date);
		myticket.getGetTicketsButton().click();
		Thread.sleep(3000);
		myticket.getViewButton().click();
		Thread.sleep(2000);
		Assert.assertEquals(myticket.getDownload().getText(), 
		readFromPropertyFile.getValueProperty("TicketBook"),"View y Ticket not Successfully");
		Reporter.log("View My Ticket successfully",true);
	}

}
