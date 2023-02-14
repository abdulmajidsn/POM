package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.BaseClass;

public class Login_Page extends BaseClass {
	static By text_username = By.name("txtUserName");
	static By text_password = By.name("txtPassword");
	static By login_button = By.name("Submit");

public static void login(String un, String pw) {
	driver.findElement(text_username).sendKeys(un);
	driver.findElement(text_password).sendKeys(pw);
	driver.findElement(login_button).click();
	Reporter.log("Login Compeleted");
}
}
