package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BaseClass {
//driver
	public static  WebDriver driver;
	//OpenApplication
	public static void OpenApplication() {
		System.getProperty("webdriver.gecko.driver", "D:\\02-Projects\\CoreJava\\geckodriver.exe");
		driver=new 	FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Open");
		
	}
	//CloseApplication
	
	public static void CloseApplication() {
		driver.quit();
		Reporter.log("Application Close");
	}
	
	
	
	
	
}
