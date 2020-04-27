package com.selenium.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.baseclass.BaseClass;

public class AutomationLogin extends BaseClass {
	
	public void HomeSetUp() throws Exception {
		
		getUrl("http://automationpractice.com/index.php");
		
	}

	public void LoginSetUp(WebDriver driver) throws Exception {
		HomePageAutomationPractise hp=new HomePageAutomationPractise(driver);
		LoginAutomationPractise lp=new LoginAutomationPractise(driver);
		clickOn(hp.getSignIn());
		sendKeys(lp.getEmailAddress(), "jeevidinesh05@gmail.com");
		sendKeys(lp.getPassWord(), "Jeevidinesh04@123");
		clickOn(lp.getSubmitButton());	
	}
	public void orderingDress() throws Exception {
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		mouseHoverToElement(women);
		WebElement evedress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		mouseHoverToElement(evedress);
		clickOn(evedress);
		
		WebElement color = driver.findElement(By.xpath("//input[@rel='24_3']"));
		clickOn(color);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement dress = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		mouseHoverToElement(dress);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement more = driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']"));
		clickOn(more);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement quan = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		clickOn(quan);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement size=driver.findElement(By.xpath("//select[@id='group_1']"));
		selectDropDown(size, "2", "value");
		WebElement color1 = driver.findElement(By.name("Pink"));
		clickOn(color1);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement addCart = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickOn(addCart);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='layer_cart_cart col-xs-12 col-md-6']"));
		clickOn(frame);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOn(proceed);
		WebElement checkout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		clickOn(checkout);
		WebElement addText = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		sendKeys(addText, "Very excited to see");
		WebElement proceedShipping = driver.findElement(By.xpath("//button[@name='processAddress']"));
		clickOn(proceedShipping);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement chkbox = driver.findElement(By.xpath("//div[@id='uniform-cgv']"));
		clickOn(chkbox);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement proceedPayment = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOn(proceedPayment);
		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickOn(payment);
		
	}
	
	public void logOut() throws Exception {
		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		clickOn(logout);
	}

	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver= BrowserLaunch("chrome");
		AutomationLogin al=new AutomationLogin();
		al.HomeSetUp();
		al.LoginSetUp(driver);
		al.orderingDress();
		al.logOut();
			
	}
}
