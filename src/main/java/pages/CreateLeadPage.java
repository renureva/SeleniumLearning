package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers  {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not CreateLead Page", "FAIL");
		}
	}
	
	public CreateLeadPage enterCompanyName(String compName){
		enterById("createLeadForm_companyName", compName);
		return this;

	}
	public CreateLeadPage enterFirstName(String firstName) {
		enterById("createLeadForm_firstName", firstName);
		return this;

	}

	public CreateLeadPage enterLastName(String lastName) {
		enterById("createLeadForm_lastName", lastName);
		return this;

	}

	public CreateLeadPage chooseSource(String source) {
		selectVisibileTextById("createLeadForm_dataSourceId", source);
		return this;

	}
	
	public CreateLeadPage chooseMarketingCampaign(String mktCam) {
		selectVisibileTextById("createLeadForm_marketingCampaignId", mktCam);
		return this;

	}
	
	public CreateLeadPage enterPhoneNum(String phoneNum) {
		enterById("createLeadForm_primaryPhoneNumber", phoneNum);
		return this;

	}
	
	public CreateLeadPage enterEmailAddress(String emailAdd) {
		enterById("createLeadForm_primaryEmail", emailAdd);
		return this;

	}
	
	public VerifyLeadPage clickCreateLead(){
		clickByClassName("smallSubmit");
		return new VerifyLeadPage(driver, test);
	}
	
	
	
	
	
}
