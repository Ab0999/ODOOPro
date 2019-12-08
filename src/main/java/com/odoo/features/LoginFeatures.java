package com.odoo.features;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.odoo.steps.LoginSteps;

public class LoginFeatures 
{
	LoginSteps ls;
	CommonFeatures cf;
	
	public LoginFeatures(WebDriver driver)
	{
		ls=new LoginSteps(driver);
		cf= new CommonFeatures(driver);
	}
	
	public void login(String username, String password)
	{
		ls.enterUN(username);
		ls.enterPwd(password);
		ls.clickLoginBtn();
	}
	
	public void verifyValidLogin(String username)
	{
		ls.verifyCRM();
		ls.verifyLoggedInEmailID(username);
		cf.logout();
		Reporter.log("Login successfully done", true);
	}
	
	public void verifyInValidLogin(String ExpText)
	{
		ls.verifyInvalidLoginTxt(ExpText);
		Reporter.log(ExpText, true);
	}
}
