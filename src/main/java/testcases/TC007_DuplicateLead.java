package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC007_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="DuplicateLead";
		testDescription="Duplicate To Opentaps";
		browserName="chrome";
		dataSheetName="TC007";
		category="Smoke";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName, String password) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickLeadsTab()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmail()
		.getNameOfFirstLead()
		.clickFirstResultingLeadByName()
		.clickDuplicateLead()
		.clickCreateLeadButton()
		.verifyFirstName()
		.closeAllBrowsers();
			
		
	}

}
