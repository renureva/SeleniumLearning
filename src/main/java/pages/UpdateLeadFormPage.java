package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class UpdateLeadFormPage extends LeafTapsWrappers  {

	public UpdateLeadFormPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not UpdateLeadFormPage", "FAIL");
		}
	}

	public UpdateLeadFormPage changeCompanyName(String compName){
		enterById("updateLeadForm_companyName",compName);
		return this;
	}

	public ViewLeadPage clickUpdate() throws InterruptedException{
		clickByName("submitButton");
		Thread.sleep(3000);
		return new ViewLeadPage(driver, test);
	}

}