package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class LookupLeadsPage extends LeafTapsWrappers  {

	public LookupLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Find Leads")){
			reportStep("This is not LookupLead Page", "FAIL");
		}
	}
	public LookupLeadsPage enterLeadIDInLookup(String leadID){
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",leadID);
		return this;
	}
	
	public LookupLeadsPage clickFindLeadsButtonInLookup() throws InterruptedException{
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(1000);
		return this ;
	}
	
	public MergeLeadPage clickFirstResultInLookup() throws InterruptedException{
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		Thread.sleep(1000);
		switchToParentWindow();
		return  new MergeLeadPage(driver, test);
	}
	
	public LookupLeadsPage nextWindow(){
		switchToLastWindow();
		return this;
	}
	
	/*public MergeLeadPage parentWindowNavigation(){
		switchToParentWindow();
		return new MergeLeadPage(driver, test);
	}
	*/
}
