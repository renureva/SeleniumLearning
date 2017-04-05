package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class VerifyLeadPage extends LeafTapsWrappers  {

	public VerifyLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not VerifyLeadPage", "FAIL");
		}
	}
	
	public VerifyLeadPage verifyLoggedName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public LoginPage clickLogout() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new LoginPage(driver,test);

	}
	
	
	
}
