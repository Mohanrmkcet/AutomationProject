package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import com.selenium.baseclass.BaseClass;

public class AmazonLogin extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = BrowserLaunch("chrome");
		getUrl("https://www.amazon.in");
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		sendKeys(hp.getSearchField(), "bags");
		clickOn(hp.getSearchButton());
		
		mouseHoverToElement(hp.getSignIn());
		clickOn(hp.getSignInButton());
		
		sendKeys(lp.getUserName(), "hemashree0306@gmail.com");
		clickOn(lp.getContinueButton());
		
		sendKeys(lp.getPwd(), "abc123");
		clickOn(lp.getLoginBtn());
		
	}

}
