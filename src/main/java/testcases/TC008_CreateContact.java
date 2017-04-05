package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC008_CreateContact extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateContact";
		testDescription="Create a new Contact";
		browserName="chrome";
		dataSheetName="TC008";
		category="Smoke";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void createContact(String userName, String password,String fn, String ln) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickCreateContact()
		.sleepTime()
		.enterFirstNameInContact(fn)
		.enterLastNameInContact(ln)
		.clickCreateContactButton();
		
	}

}
