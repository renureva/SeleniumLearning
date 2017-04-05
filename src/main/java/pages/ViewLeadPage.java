package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers  {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not ViewLead Page", "FAIL");
		}
	}

	public UpdateLeadFormPage clickEdit(){
		clickByLink("Edit");
		return new UpdateLeadFormPage(driver, test);
	}


	public ViewLeadPage verifyCompanyName(String Name){	
		verifyTextContainsById("viewLead_companyName_sp",Name);
		return this;

	}
	public LeadsMainPage clickDelete(){
		clickByLink("Delete");
		return new LeadsMainPage(driver, test);
		
	}
	public DuplicateLeadPage clickDuplicateLead() throws InterruptedException{
		clickByLink("Duplicate Lead");
		Thread.sleep(1000);
		return new DuplicateLeadPage(driver, test);
		
	}

	public ViewLeadPage verifyFirstName(){	
		String Name=FindLeadsPage.txtname;
		verifyTextContainsById("viewLead_firstName_sp", Name);
		return this;
	}
	
	public ViewLeadPage clickFindLeadsInViewLeadPage() throws InterruptedException{
		clickByLink("Find Leads");
		Thread.sleep(3000);
		return this;
		
	}
}
