package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateContact extends LeafTapsWrappers  {

	public CreateContact(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Contact | opentaps CRM")){
			reportStep("This is not CreateLead Page", "FAIL");
		}
	}
	public CreateContact enterFirstNameInContact(String firstname){
	enterByXpath("//input[@id='firstNameField']",firstname);
	return this;	
	}
	
	public CreateContact enterLastNameInContact(String lastname){
		enterByXpath("//input[@id='lastNameField']",lastname);
		return this;
	}
	
	public ViewContact clickCreateContactButton(){
		clickByName("submitButton");
		return new ViewContact(driver, test);
	}
	
	public CreateContact sleepTime() throws InterruptedException
	{
		Thread.sleep(3000);
		return this;
	}
	
}
