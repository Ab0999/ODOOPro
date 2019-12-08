package com.odoo.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.NewSessionPayload;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.Customerpage;
import com.odoo.steps.CustomerSteps;
import com.odoo.steps.LeadsSteps;

public class LeadsFeatures 
{
	Customerpage custp;
	CommonFeatures cf;
	CustomerSteps cs;
	BasePage bp;
	LeadsSteps ls;
	SeleniumLib sl;
	
public LeadsFeatures(WebDriver driver)
{
	bp= new BasePage();
	custp= new Customerpage();
	cs= new CustomerSteps(driver);
	cf= new CommonFeatures(driver);
	ls= new LeadsSteps(driver);
	sl= new SeleniumLib(driver);
	
}

public void CreateLeads(String LeadsName,String CompanyName,String ContactName,String JobPosition,String City,
		String State,String Address1,String Address2,String Mobile,String Phone,String Country,String Zip)
{
	ls.CommonLeads();
	ls.Createleads(LeadsName, CompanyName, ContactName, JobPosition, City, State, Address1,
			Address2, Mobile, Phone, Country, Zip);
	sl.iSleep(5);
	cf.logout();
	
}
}