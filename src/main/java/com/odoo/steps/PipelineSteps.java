package com.odoo.steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.PipelinePage;

public class PipelineSteps 
{
	WebDriver driver;
    PipelinePage ppg;
	BasePage bp;
	SeleniumLib sl;

	public PipelineSteps(WebDriver driver) 
	{
		this.driver = driver;
		ppg = new PipelinePage();
		bp = new BasePage();
		sl = new SeleniumLib(driver);
	}

	public void commonPipeline()
	{
			sl.iSleep(3);
			driver.findElement(By.xpath(bp.Crm)).click();	
			sl.iSleep(3);
			driver.findElement(By.xpath(bp.sales)).click();
			sl.iSleep(3);
			driver.findElement(By.xpath(bp.MyPipeline)).click();
	}
	
	public void CreatePipeline(String opportunity,String customer,String revenue)
	{	
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.createpipeline)).click();
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.opportunityTxBx)).sendKeys(opportunity);
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.customerTxBx)).sendKeys(customer);
	sl.iSleep(3);
	driver.findElement(By.xpath(ppg.customerTxBx)).sendKeys(Keys.ENTER);
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.revenueTxBx)).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.revenueTxBx)).sendKeys(revenue);	
	sl.iSleep(4);	  
	driver.findElement(By.xpath(ppg.SetPriorityHigh)).click();	 
	sl.iSleep(4);
	driver.findElement(By.xpath(ppg.addbutton)).click();
	sl.iSleep(5);
	}
	
	public void ShiftStageQual(String opportunity)
	{
		sl.iSleep(5);
		WebElement NewStage = driver.findElement(By.xpath("//div[@data-id='1']//span[text()='"+opportunity+"']"));
		System.out.println(NewStage.getText());
		WebElement QualifiedStage = driver.findElement(By.xpath(ppg.qualified));
		
		sl.DragandDrop(NewStage,QualifiedStage );	
	   }
	
	  public void ShiftStagePro(String opportunity) 
	  {
	      sl.iSleep(5);
	      WebElement QualifiedStage =driver.findElement(By.xpath("//div[@data-id='2']//span[text()='"+opportunity+"']"));
	      System.out.println(QualifiedStage.getText());
	      WebElement PropositionStage =driver.findElement(By.xpath(ppg.proposition));
	      sl.DragandDrop(QualifiedStage,PropositionStage ); 
	  }
	  
	  public void ShiftStageWon(String opportunity)
	  { 
		  sl.iSleep(5);
		  WebElement PropositionStage =driver.findElement(By.xpath("//div[@data-id='3']//span[text()='"+opportunity+"']"));
		  System.out.println(PropositionStage.getText());
		  WebElement WonStage =driver.findElement(By.xpath(ppg.Won));
	      sl.DragandDrop(PropositionStage,WonStage); 
	   }
	  
	  public void ShiftStageLost(String opportunity) 
	  { 
		  sl.iSleep(5);
		  WebElement WonStage =driver.findElement(By.xpath("//div[@data-id='4']//span[text()='"+opportunity+"']")); 
		  System.out.println(WonStage.getText());
		  WebElement LostStage =driver.findElement(By.xpath(ppg.Lost));
	      sl.DragandDrop(WonStage,LostStage);
	  }
	  
	  public void DeleteAllOpportunity()
	  {
		  sl.iSleep(2);
		  driver.findElement(By.xpath("//button[contains(@class,'switch_list')]")).click();
		  sl.iSleep(2);
		  driver.findElement(By.xpath("(//th//div[contains(@class,'custom-checkbox')])[1]")).click();
		  sl.iSleep(2);
		  driver.findElement(By.xpath("//button[contains(text(),'Action')]")).click();
		  sl.iSleep(2);
		  driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		  sl.iSleep(5);
		  driver.findElement(By.xpath("//button/span[text()='Ok']")).click();
		  sl.iSleep(5);
	  }
	  
	  public void CreateSalesTeam()
	  {
		  
		  
	  }
	 
}
