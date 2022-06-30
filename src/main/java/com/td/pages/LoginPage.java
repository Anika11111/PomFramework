package com.td.pages;

import org.openqa.selenium.support.PageFactory;

import com.td.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		 return driver.getTitle();
		 
	}

}
