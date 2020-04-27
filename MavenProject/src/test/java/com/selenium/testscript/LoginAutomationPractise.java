package com.selenium.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAutomationPractise {

	public WebDriver driver;
	public LoginAutomationPractise(WebDriver driver2) {
		this.driver=driver2;
	PageFactory.initElements(driver2, this);			
	}
	
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(WebElement emailAddress) {
		this.emailAddress = emailAddress;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	@FindBy(id="passwd")
	private WebElement passWord;
	
	@FindBy(name="SubmitLogin")
	private WebElement submitButton;
	
	
}
