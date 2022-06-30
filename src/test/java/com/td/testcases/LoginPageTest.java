package com.td.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.td.base.TestBase;
import com.td.pages.HomePage;
import com.td.pages.LoginPage;

public class LoginPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		homePage.clickOnLoginButton();
	}
	
	@Test
	public void getTitleTest() {
		System.out.print(loginPage.getPageTitle());
		Assert.assertEquals(loginPage.getPageTitle(), "EasyWeb Login");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
