package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewContact extends LeafTapsWrappers  {

	public ViewContact(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Contact | opentaps CRM")){
			reportStep("This is not View Contact Page", "FAIL");
		}
	}

}
