package skills;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.New_Employee_Page;

public class TC_NewEmployee_004Test extends Base_Class{

	@Test
	public void Booking() throws InterruptedException { 
		New_Employee_Page newEmployee =new New_Employee_Page(driver);
		
		newEmployee.getPagesButton().click();
		newEmployee.getAdminLoginButton().click();
		Thread.sleep(2000);

		String username=readFromPropertyFile.getValueProperty("UserName");
		newEmployee.getUsernameTextfield().sendKeys(username);
		
		String password=readFromPropertyFile.getValueProperty("Password");
		newEmployee.getPasswordTextfield().sendKeys(password);
		
		newEmployee.getLoginButton().click();
		Thread.sleep(2000);
		
		newEmployee.getEmployeeButton().click();
		newEmployee.getNewEmployeeButton().click();
		
		String email=readFromPropertyFile.getValueProperty("Email");
		newEmployee.getEmailTextField().sendKeys(email);
		Thread.sleep(2000);
		
		String name=readFromPropertyFile.getValueProperty("FullName");
		newEmployee.getNameTextField().sendKeys(name);
		Thread.sleep(2000);
		
		String address=readFromPropertyFile.getValueProperty("Address");
		newEmployee.getAddressTextField().sendKeys(address);
		Thread.sleep(2000);
		
		String area=readFromPropertyFile.getValueProperty("Area");
		newEmployee.getAreaTextField().sendKeys(area);
		Thread.sleep(2000);
		
		String userName=readFromPropertyFile.getValueProperty("Username");
		newEmployee.getUserNameTextField().sendKeys(userName);
		Thread.sleep(2000);
		
		newEmployee.getRoleDropdown().click();
		Thread.sleep(2000);
		
		String salary=readFromPropertyFile.getValueProperty("Salary");
		newEmployee.getSalaryTextFiel().sendKeys(salary);
		Thread.sleep(2000);
		
		String mobilenumber=readFromPropertyFile.getValueProperty("MobileNumber");
		newEmployee.getMobileNumberTextField().sendKeys(mobilenumber);
		Thread.sleep(2000);
		
		newEmployee.getCancelButton().click();
		
		//newEmployee.getAddEmployeeButton().click();
		
		
		
		
	}
}
	
