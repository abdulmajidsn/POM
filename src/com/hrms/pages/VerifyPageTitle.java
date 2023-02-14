package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class VerifyPageTitle extends BaseClass{

	public static void verifyTitle(String title) {
		if(driver.getTitle().endsWith(title)) {
			Reporter.log("Title Mtched");
		}
		else {
			Reporter.log("Title not match");
			Reporter.log(driver.getTitle());
		}
	}
	
}
