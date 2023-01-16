package skills;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.Base_Class;
import pomRepository.Movies_Page;

/***
 * 
 * @author ranjitha kp
 *
 */

public class TC_MovieBooking_001Test extends Base_Class{

	@Test
	public void Booking() throws InterruptedException {
		Movies_Page movies=new Movies_Page(driver);
		
		Assert.assertEquals(driver.getTitle(), 
		readFromPropertyFile.getValueProperty("HomePage"),"Home Page is displayed not successfully");
		Reporter.log("Home Page is displayed successfully",true);
		
		movies.getMovies().click();
		
//		Assert.assertEquals(movies.getMovies().getText(), 
//		readFromPropertyFile.getValueProperty("Movies"),"Movies Page is not displayed");
//		Reporter.log("Movie page is displyed",true);
		
		movies.getSaturday().click();
		Thread.sleep(2000);
		movies.getTime().click();
		Thread.sleep(2000);
		movies.getSeats().click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(10,1120);");
		Thread.sleep(2000);
		movies.getContinueButton().click();
		String email=readFromPropertyFile.getValueProperty("Email");
		movies.getEmailTextField().sendKeys(email);
		String phonenumber=readFromPropertyFile.getValueProperty("Mobilenumber");
		movies.getPhoneNoTextField().sendKeys(phonenumber);
		Thread.sleep(2000);
		movies.getConfirmButton().click();	
		
		Thread.sleep(2000);
		
		Alert alertPopUp = driver.switchTo().alert();
        alertPopUp.accept();
        Thread.sleep(4000);
        
        Assert.assertEquals(movies.getDownlaod().getText(), 
        readFromPropertyFile.getValueProperty("TicketBook"),"Movie Ticket Booked not Successfully");
        Reporter.log("Movie Ticket Booked successfully",true);
        
        Thread.sleep(2000);
        movies.getDownlaod().click();
        Thread.sleep(2000);
				
	}
}
