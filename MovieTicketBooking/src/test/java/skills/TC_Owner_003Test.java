package skills;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Owner_Page;

public class TC_Owner_003Test extends Base_Class {
	
	@Test
	public void Booking() throws InterruptedException {
		Owner_Page admin=new Owner_Page(driver);
		
		
		admin.getPagesButton().click();
		admin.getAdminLoginButton().click();
		Thread.sleep(2000);

		String username=readFromPropertyFile.getValueProperty("UserName");
		admin.getUsernameTextfield().sendKeys(username);
		
		String password=readFromPropertyFile.getValueProperty("Password");
		admin.getPasswordTextfield().sendKeys(password);
		
		admin.getLoginButton().click();
		Thread.sleep(2000);
		
//		admin.getAdminButton().click();
//		Thread.sleep(1000);
		String moviesname=readFromPropertyFile.getValueProperty("MoviesName");
		admin.getMoviesNameTextField().sendKeys(moviesname);
		Thread.sleep(1000);
		admin.getDaysDropdown().click();
		Thread.sleep(1000);
		admin.getScreenDropdown().click();
		admin.getCertificateDropdown().click();
		String moviedate=readFromPropertyFile.getValueProperty("MovieDate");
		admin.getDate().sendKeys(moviedate);
		Thread.sleep(1000);
		admin.getTimeDropdown().click();
		Thread.sleep(1000);
		admin.getPriceDropdown().click();
		Thread.sleep(1000);
		String trailer=readFromPropertyFile.getValueProperty("Trailer");
		admin.getTrailerTextField().sendKeys(trailer);
		Thread.sleep(1000);
		admin.getBookingOpenDropdown().click();
		Thread.sleep(1000);
		admin.getMovieStatusDropdown().click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(10,1120);");
		Thread.sleep(2000);
		admin.getSubmitButton().click();	
		Thread.sleep(1000);
		
	}

}
