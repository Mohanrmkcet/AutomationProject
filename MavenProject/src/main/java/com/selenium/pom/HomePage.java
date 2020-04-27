package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchField;
	
	@FindBy(className="nav-input")
	private WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Hello. Sign in']")
	private WebElement signIn;
	
	@FindBy(xpath="(//span[text()='Sign in'])[2]")
	private WebElement signInButton;

	public WebElement getSearchField() {
		return searchField;
	}

	public void setSearchField(WebElement searchField) {
		this.searchField = searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn(WebElement signIn) {
		this.signIn = signIn;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public void setSignInButton(WebElement signInButton) {
		this.signInButton = signInButton;
	}
	
	

}
