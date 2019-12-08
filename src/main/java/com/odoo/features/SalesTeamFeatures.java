package com.odoo.features;

import org.openqa.selenium.WebDriver;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.Customerpage;
import com.odoo.steps.CustomerSteps;
import com.odoo.steps.SalesTeamSteps;

public class SalesTeamFeatures 
{
	Customerpage custp;
	CommonFeatures cf;
	CustomerSteps cs;
	BasePage bp;
	SalesTeamSteps sts;
	
 public SalesTeamFeatures(WebDriver driver)
 {
	 custp= new Customerpage();
	 cf= new CommonFeatures(driver);
	 cs= new CustomerSteps(driver);
	 bp= new BasePage(); 
	 sts= new SalesTeamSteps(driver);
 }	
 public void CreateSalesTeam(String TeamName,String TlName,String Email,String Assignee,String AssigneeMail)
 {
	 
	 sts.commonSalesTeam();
	 sts.CreateSalesTeam(TeamName, TlName, Email, Assignee, AssigneeMail);
	 cf.logout();
	 
 }
}
