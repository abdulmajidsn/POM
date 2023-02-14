package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.BaseClass;

public class Logout_Page extends BaseClass{
static By logout_button=By.linkText("Logout");

public static void logout() {
	driver.findElement(logout_button).click();
	Reporter.log("Logout Completed");	
}
}
