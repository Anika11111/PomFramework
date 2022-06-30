package com.td.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.td.base.TestBase;
import com.td.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();	
	}
	
	@Test
	public void homePageAllLinksTest() {
		int number = homePage.getHomePageListSize();
		Assert.assertEquals(number,8);
	}
	@Test
	public void homePageHeaderSizeTest() {
		int headerSize= homePage.getHomePageHeaderSize();
		System.out.println(headerSize);
		Assert.assertEquals(headerSize, 5);
	}
	
	@Test
	public void goToLoginPageTest() {
		homePage.clickOnLoginButton();
		Assert.assertEquals(5, 5);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
