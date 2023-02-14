package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Page;
import com.hrms.pages.VerifyPageTitle;
import com.hrms.utility.BaseClass;
import com.hrms.utility.Log;

public class TC001 {
@Test
public static void tc001() {
	DOMConfigurator.configure("log4j.xml");
	BaseClass.OpenApplication();
	Log.info("Browser Opened");
	VerifyPageTitle.verifyTitle("HRMS");
	Log.info("verifytit");
	Login_Page.login("nareshit", "nareshit");
	Log.info("loginn");
	VerifyPageTitle.verifyTitle("OrangeHRM");
	Logout_Page.logout();
	BaseClass.CloseApplication();
}
}
