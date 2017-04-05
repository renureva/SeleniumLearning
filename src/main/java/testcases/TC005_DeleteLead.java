package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;
public class TC005_DeleteLead extends LeafTapsWrappers{
	@BeforeClass
	public void setData() {
		testCaseName="DeleteLead";
		testDescription="Delete a Lead ";
		browserName="chrome";
		dataSheetName="TC005";
		category="Sanity";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String userName,String password,String Phonenumber) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickLeadsTab()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(Phonenumber)
		.clickFindLeadsButton()
		.captureFirstLeadID()
		.clickFirstResultingLead()
		.clickDelete()
		.clickFindLeads()
		.captureFirstLeadID()
		.clickFindLeadsButton()
		.verifyErrorMessage()
		.closeBrowser();

			

	}
}
