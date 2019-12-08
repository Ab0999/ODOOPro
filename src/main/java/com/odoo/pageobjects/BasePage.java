package com.odoo.pageobjects;

public class BasePage 
{
	public String Crm="//div[text()='CRM']";
	public String loggedInEmailID="//ul[@role='menu']//li[@class='o_user_menu']//span";
	public String menuDrpDwnList="//li[contains(@class,'menu')]/a";
	public String logout="//a[text()='Log out']";
	public String sales="//li//a[contains(@class,'dropdown')][contains(text(),'Sales')]";
	public String Customers="//a/span[contains(text(),'Customers')]";
	public String MyPipeline="//a/span[text()='My Pipeline']";
	public String ConfigurationTab="//a[contains(text(),'Configuration')]";
	public String SalesTeam="//span[contains(text(),'Sales Teams')]";
	public String Leads="//a[contains(text(),'Leads')]";                      //BasePage Leads Tab on Click gives another leads tab.
	public String Leads1="(//span[contains(text(),'Leads')])[1]";   //BasePage Leads Tab==>Leads tab on Click opens the Leads lIST Page.
	
	
}
