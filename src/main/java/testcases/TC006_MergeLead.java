package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LookupLeadsPage;
import wrappers.LeafTapsWrappers;

public class TC006_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="MergeLead";
		testDescription="Login To Opentaps";
		browserName="chrome";
		dataSheetName="TC006";
		category="Smoke";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String password,String ID1,String ID2) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickLeadsTab()
		.clickMergeLead()
		.clickImageNearFromLead()
		.nextWindow()
		.enterLeadIDInLookup(ID1)
		.clickFindLeadsButtonInLookup()
		.clickFirstResultInLookup()
		.parentWindowNavigation()
		.clickImageNearToLead()
		.nextWindow()
		.enterLeadIDInLookup(ID2)
		.clickFindLeadsButtonInLookup()
		.clickFirstResultInLookup()
		.parentWindowNavigation()
		.clickMerge()
		.accepttheAlert()
		.clickFindLeadsInViewLeadPage()
		.enterLeadID()
		.clickFindLeadsButton()
		.verifyErrorMessage();
		
		
		

	}

}
