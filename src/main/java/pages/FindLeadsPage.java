package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadsPage extends LeafTapsWrappers  {
	static String txtval;
	static String txtname;

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not FindLead Page", "FAIL");
		}
	}

	public FindLeadsPage clickPhoneTab(){
	clickByXpath("(//span[@class='x-tab-strip-inner'])[2]/span");
	return this ;
		}
	
	public FindLeadsPage enterPhoneNumber(String phnum){
		enterByXpath("//input[@name='phoneNumber']",phnum );
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(3000);
		return this;
	}

	public FindLeadsPage enterFirstName(String fname) {
		enterByXpath("(//input[@name='firstName'])[3]",fname);
		return this;
	}
	
	public ViewLeadPage clickFirstResultingLead() throws InterruptedException{
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a");
		Thread.sleep(3000);
		return new ViewLeadPage(driver, test);
	}
	public FindLeadsPage enterLeadID(){
		enterByXpath("//input[@name='id']",txtval);	
		return this;
	}
	
	public FindLeadsPage enterLeadIDWithID(String LeadID){
		enterByXpath("//input[@name='id']",LeadID);	
		return this;
	}
	
	public FindLeadsPage verifyErrorMessage(){
		verifyTextContainsByXpath("//div[contains(text(),'No records to display')]", "No records to display");
		return this;
	}
	
	public FindLeadsPage captureFirstLeadID(){
		 txtval=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		 return this;
	}

	public FindLeadsPage clickEmailTab(){
		clickByXpath("(//span[@class='x-tab-strip-inner'])[3]/span");
		return this ;
			}
	public FindLeadsPage enterEmail(){
		clickByName("emailAddress");
		return this ;
	}
	public FindLeadsPage getNameOfFirstLead(){
		txtname=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		return this;	
	}
	
	public ViewLeadPage clickFirstResultingLeadByName() throws InterruptedException{
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		Thread.sleep(3000);
		return new ViewLeadPage(driver, test);
	}

}

