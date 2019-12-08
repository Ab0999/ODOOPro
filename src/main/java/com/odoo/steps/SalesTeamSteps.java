package com.odoo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.LoginPage;
import com.odoo.pageobjects.SalesTeamPage;

public class SalesTeamSteps 
{
	WebDriver driver;
	LoginPage lp;
	BasePage bp;
	SeleniumLib sl;
    SalesTeamPage sp;
    
    public SalesTeamSteps(WebDriver driver)
    {
        this.driver=driver;
    	lp=new LoginPage();
    	bp= new BasePage();
    	sl= new SeleniumLib(driver);
    	sp= new SalesTeamPage();
    }
    
    public void commonSalesTeam()
    
    {
    	
    sl.iSleep(5);
    driver.findElement(By.xpath(bp.Crm)).click();
    sl.iSleep(5);
    driver.findElement(By.xpath(bp.ConfigurationTab)).click();
    sl.iSleep(5);
    driver.findElement(By.xpath(bp.SalesTeam)).click();
    	
    }
   
  public void CreateSalesTeam(String TeamName,String TlName,String Email,String Assignee,String AssigneeMail)
  { 
	 sl.iSleep(5);
	 sl.jsClick(driver.findElement(By.xpath(sp.CreateTab)));
	 sl.iSleep(5);
	 driver.findElement(By.xpath(sp.EnterSalesTeamName)).sendKeys(TeamName);
	 sl.iSleep(5);
	 sl.jsClick(driver.findElement(By.xpath(sp.TeamLeaderTxtInput)));
	 sl.iSleep(10);
	 sl.eWaitForVisiblity(10, sp.Create_Edit).click();
	 sl.iSleep(5);
	 sl.eWaitForVisiblity(10,sp.TlNameINP).sendKeys(TlName);
	 sl.eWaitForVisiblity(10,sp.EmailTxBxTL).sendKeys(Email);
	 sl.iSleep(5);
	 sl.jsClick(driver.findElement(By.xpath(sp.SaveTab)));
	 sl.iSleep(20);
	 driver.findElement(By.xpath(sp.EmailAlias)).sendKeys(TlName);
	 sl.iSleep(20);
	 driver.findElement(By.xpath(sp.AssignToTxBx)).sendKeys(Assignee);
	 sl.iSleep(5);
	 driver.findElement(By.xpath(sp.AssignToTxBx)).sendKeys(Keys.ARROW_DOWN);
	 driver.findElement(By.xpath(sp.AssignToTxBx)).sendKeys(Keys.ENTER);	     
	 sl.iSleep(5); 
	 driver.findElement(By.xpath(sp.AssignToEmail)).sendKeys(AssigneeMail);
	 sl.iSleep(3);
	 sl.jsClick(driver.findElement(By.xpath(sp.SaveTab)));
	 sl.iSleep(5);
	 sl.jsClick(driver.findElement(By.xpath(sp.TLSaveTab))); 
	 sl.iSleep(10);
	 sl.jsClick(driver.findElement(By.xpath("//a[text()='Sales Teams']")));
	 sl.iSleep(5);	 
  }	
}
