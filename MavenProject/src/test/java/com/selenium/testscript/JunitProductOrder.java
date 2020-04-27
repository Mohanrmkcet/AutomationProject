package com.selenium.testscript;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class JunitProductOrder extends AutomationLogin { 

	public static WebDriver driver;
	static JunitProductOrder ju=new JunitProductOrder();
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		driver= BrowserLaunch("chrome");
		System.out.println("1.Browser Launch");
		ju.HomeSetUp();
	}
	@Before
	public void befoe() throws Exception {
		System.out.println("2.Login setup");
		ju.LoginSetUp(driver);
	}
	@Test
	public void test() throws Exception {
		System.out.println("3.Ordering the dress testcase");
		ju.orderingDress();
	}
	@After
	public void after() throws Exception {
		System.out.println("4.Logout");
		ju.logOut();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("5.Driver close");
		driver.close();
	}
	
}
