package com.td.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.base.TestBase;

public class HomePage extends TestBase {
	//Page Factory
	@FindBy(xpath="//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a")
	List<WebElement> allLinks;
	
	@FindBy(xpath="//div[@class='td-segments']/ul/li")
	List<WebElement> headerList;
	
	@FindBy(xpath="(//div[@class='td-col-md-12 single']/button)[1]")
	WebElement loginButton;
	
	//Write x path to click Login button
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public int getHomePageListSize() {
		 System.out.println(allLinks.size());
		 return allLinks.size();
	}
	
	public int getHomePageHeaderSize() {
		 System.out.println(headerList.size());
		 return headerList.size();
	}
	
	//Write method to chain the pages
	public LoginPage clickOnLoginButton() {
		loginButton.click();
		return new LoginPage();
	}
}