package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers  {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}
	public MergeLeadPage clickImageNearFromLead() throws InterruptedException{
		clickByXpathNoSnap("(//img[@alt='Lookup'])[1]");
		Thread.sleep(1000);
		return this;
	}
	
	public MergeLeadPage clickImageNearToLead() throws InterruptedException{
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		Thread.sleep(3000);
		return this;
	}

	public MergeLeadPage clickMerge(){
		clickByLinkNoSnap("Merge");
		return this ;

	}

	public ViewLeadPage accepttheAlert(){
		acceptAlert();
		return new  ViewLeadPage(driver, test);

	}

	public MergeLeadPage parentWindowNavigation(){
		switchToParentWindow();
		return this;
	}

}
