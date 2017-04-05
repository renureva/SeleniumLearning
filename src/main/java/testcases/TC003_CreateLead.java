package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="CreateLead";
		testDescription="Create a new Lead ";
		browserName="chrome";
		dataSheetName="TC003";
		category="Sanity";
		authors="Renu";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password, String compName,String firstName,String lastName,String source,String mktCam,String phoneNum,String emailAdd ) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.OnclickCRMlink()
		.clickCreateLead()
		.enterCompanyName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.chooseSource(source)
		.chooseMarketingCampaign(mktCam)
		.enterPhoneNum(phoneNum)
		.enterEmailAddress(emailAdd)
		.clickCreateLead()
		
		.closeAllBrowsers();
	}

}
