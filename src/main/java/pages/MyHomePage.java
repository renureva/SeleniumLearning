package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyHomePage extends LeafTapsWrappers  {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}
	public CreateLeadPage clickCreateLead(){
		clickByLink("Create Lead");
		return new CreateLeadPage(driver, test);
	}
	public LeadsMainPage clickLeadsTab(){
		clickByLink("Leads");
		return new LeadsMainPage(driver, test);

	}
	public CreateContact clickCreateContact(){
		clickByLink("Create Contact");
		return new CreateContact(driver, test);
	}


}
