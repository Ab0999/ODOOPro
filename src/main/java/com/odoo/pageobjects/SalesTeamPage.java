package com.odoo.pageobjects;


public class SalesTeamPage 
{	
	
public String CreateTab =  "//button[contains(text(),'Create')]";
public String EnterSalesTeamName =  "//input[@name='name']";
public String TeamLeaderTxtInput = "(//div[@class='o_input_dropdown']/input)[1]";
public String TlNameINP="(//h1//input[@name='name'])[2]";
public String CreateTlbtn= "//span[text()='Create']";
public String EmailTxBxTL =  "//input[@name='login']";
public String SaveTab =  "//span[text()='Save']";
public String AssignToTxBx=  "(//div[@class='o_input_dropdown']/input)[3]";
public String AssignToEmail=  "//input[@name='login']";
public String TLSaveTab=  "//button[contains(text(),'Save')]";
public String EmailAlias="//input[@name='alias_name']";
public String OKbutton="//button/span[text()='Ok']";
public String SalesTeamTab="//a[text()='Sales Teams']";
public String Create_Edit="//li//a[text()='Create and Edit...']";

} 