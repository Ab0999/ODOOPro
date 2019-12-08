package com.odoo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.Customerpage;
import com.odoo.pageobjects.LeadsPage;

public class LeadsSteps 
{

	WebDriver driver;
	Customerpage custp;
	BasePage bp;
	SeleniumLib sl;
	LeadsPage lp;

	public LeadsSteps(WebDriver driver) 
	{
		this.driver = driver;
		custp = new Customerpage();
		bp = new BasePage();
		sl = new SeleniumLib(driver);
		lp= new LeadsPage();	
	}
	
	public void CommonLeads()
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(bp.Crm)).click();
		sl.iSleep(5);
		driver.findElement(By.xpath(bp.Leads)).click();
		sl.iSleep(5);
		driver.findElement(By.xpath(bp.Leads1)).click();	
	}
	public void Createleads(String LeadsName,String CompanyName,String ContactName,String JobPosition,String City,
			String State,String Address1,String Address2,String Mobile,String Phone,String Country,String Zip)
	{
		
		sl.iSleep(5);
		driver.findElement(By.xpath(lp.Create)).click();
		sl.iSleep(5);
		driver.findElement(By.xpath(lp.LeadNameTxBx)).sendKeys(LeadsName);
		driver.findElement(By.xpath(lp.CompanyTxBx)).sendKeys(CompanyName);
		driver.findElement(By.xpath(lp.ContactName)).sendKeys(ContactName);
		sl.iSleep(5);
		/*
		 * WebElement TitleDropdown = driver.findElement(By.xpath(lp.TitleDropDown));
		 * Select sel= new Select(TitleDropdown); sl.iSleep(5);
		 * sel.selectByVisibleText("Mister");
		 */
		driver.findElement(By.xpath(lp.Streat1)).sendKeys(Address1);
		driver.findElement(By.xpath(lp.Streat2)).sendKeys(Address2);
		driver.findElement(By.xpath(lp.CityName)).sendKeys(City);
		driver.findElement(By.xpath(lp.State)).sendKeys(State,Keys.ENTER);
		sl.iSleep(5);
		driver.findElement(By.xpath(lp.Country)).sendKeys(Country);
		driver.findElement(By.xpath(lp.ZipCode)).sendKeys(Zip);
		driver.findElement(By.xpath(lp.JobPositionTxBx)).sendKeys(JobPosition);
		driver.findElement(By.xpath(lp.MobileTxBx)).sendKeys(Mobile);
		driver.findElement(By.xpath(lp.PhoneTxBx)).sendKeys(Phone);
		driver.findElement(By.xpath(lp.SaveButton)).click();
		driver.findElement(By.xpath(lp.LeadsTab)).click();
					
	}
	public void ConvertToOpportunity(String LeadsName,String SalesTeam)
	{
		driver.findElement(By.xpath("//td[text()='"+LeadsName+"']")).click();
		sl.iSleep(5);
		driver.findElement(By.xpath(lp.ConvertToOpp)).click();
		WebElement SalesTeamOpp = driver.findElement(By.xpath(lp.SalesTeamopp));
		Select sel= new Select(SalesTeamOpp); 
		sl.iSleep(5);
		sel.selectByVisibleText(SalesTeam);
		
		
		
	}
	
}
