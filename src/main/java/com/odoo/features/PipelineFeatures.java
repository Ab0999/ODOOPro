package com.odoo.features;
import org.openqa.selenium.WebDriver;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.PipelinePage;
import com.odoo.steps.PipelineSteps;

import io.qameta.allure.Feature;

public class PipelineFeatures 
{
		PipelinePage ppg;
		CommonFeatures cf;
		PipelineSteps Ps;
		CustomerFeatures cs;
		BasePage bp;
		
	public PipelineFeatures(WebDriver driver)
	  {
		bp= new BasePage();
		ppg= new PipelinePage();
		Ps= new PipelineSteps(driver);
		cf= new CommonFeatures(driver);	
		cs= new CustomerFeatures(driver);
	  }
	
	@Feature("Creating an Opportunity in My pipeline of Sales Tab")
	public void CreatePipeline(String opportunity,String customer,String revenue)
	{
	    Ps.commonPipeline();
		Ps.CreatePipeline(opportunity, customer, revenue);
	    cf.logout();
	}
	
	@Feature("Shifting an opportunity from New tab to Opportunity tab")
	public void DragandDrop(String opportunity)
	{
		  Ps.commonPipeline();
		  Ps.ShiftStageQual(opportunity);
		
		  Ps.ShiftStagePro(opportunity); 
		  Ps.ShiftStageWon(opportunity);
		  Ps.ShiftStageLost(opportunity);
		 
		  cf.logout();
	}
	
	@Feature("Delete all opportunity")
	public void DeleteAllOpportunity()
	{
		Ps.commonPipeline();
	    Ps.DeleteAllOpportunity();
		cf.logout();
	}
	
}
