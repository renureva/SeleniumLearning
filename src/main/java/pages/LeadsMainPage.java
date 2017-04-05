package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LeadsMainPage extends LeafTapsWrappers  {

	public LeadsMainPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not LeadsMainPage", "FAIL");
		}
	}
	
	public FindLeadsPage clickFindLeads() throws InterruptedException{
	clickByLink("Find Leads");
	Thread.sleep(2500);
	return new FindLeadsPage(driver, test);
	}
	
	public LeadsMainPage enterFirstName(String fname){
	enterByXpath("(//input[@name='firstName'])[3]",fname);
	return this;
	}
	
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException{
	clickByXpath("//button[contains(text(),'Find Leads')]");
	Thread.sleep(3000);
	return new FindLeadsPage(driver, test);
	}
	
	public ViewLeadPage clickOnFirstResultingLead() throws InterruptedException{
		Thread.sleep(3000);
	clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
	return new ViewLeadPage(driver, test);
	}
	
	public MergeLeadPage clickMergeLead() throws InterruptedException {
		clickByLink("Merge Leads");
		Thread.sleep(1000);
		return new MergeLeadPage(driver, test) ;
		
	}
	
	
}

