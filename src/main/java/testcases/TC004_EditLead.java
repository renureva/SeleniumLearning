package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="EditLead";
		testDescription="Update a new Lead ";
		browserName="chrome";
		dataSheetName="TC004";
		category="Sanity";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String userName,String password,String fn,String compName,String verifyName) throws InterruptedException {

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickLeadsTab()
		.clickFindLeads()
		.enterFirstName(fn)
		.clickFindLeadsButton()
		.clickFirstResultingLead()
		.clickEdit()
		.changeCompanyName(compName)
		.clickUpdate()
		.verifyCompanyName(verifyName)
		.closeAllBrowsers();
		
	}

}