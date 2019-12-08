package com.odoo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.LoginPage;

public class LoginSteps 
{
	WebDriver driver;
	LoginPage lp;
	BasePage bp;
	SeleniumLib sl;
	
	public LoginSteps(WebDriver driver)
	{
		this.driver=driver;
		lp=new LoginPage();
		bp=new BasePage();
		sl=new SeleniumLib(driver);
	}
	
	public void enterUN(String username)
	{
		driver.findElement(By.xpath(lp.unTxtBx)).sendKeys(username);
	}
	
	public void enterPwd(String password)
	{
		driver.findElement(By.xpath(lp.pwdTxtBx)).sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(By.xpath(lp.loginBtn)).click();
	}
	
	public void verifyCRM()
	{
		sl.iSleep(5);
		boolean flag = sl.eWaitForVisiblity(30, bp.Crm).isDisplayed();
		Assert.assertTrue(flag);
		Reporter.log("Element Verified successfully ",true);
	}
	
	public void verifyLoggedInEmailID(String username)
	{
		String actualEmailID = driver.findElement(By.xpath(bp.loggedInEmailID)).getText();
		System.out.println("*********"+actualEmailID);
		Assert.assertEquals(actualEmailID, username);
	}
	
	public void verifyInvalidLoginTxt(String ExpText)
	{
		String actualtext = driver.findElement(By.xpath(lp.invalidLoginTxt)).getText();
		System.out.println("*********"+actualtext);
		Assert.assertEquals(actualtext, ExpText);
		Reporter.log("  Invalid login text has been verified and validated ",true);
	}
}
