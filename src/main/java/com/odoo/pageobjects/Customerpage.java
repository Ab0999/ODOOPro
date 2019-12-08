package com.odoo.pageobjects;

public class Customerpage 
{
public String create="//div/button[contains(text(),'Create')]";
public String Import="//div/button[contains(text(),'Import')]";
public String IndividualRadioBtn="//label[text()='Individual']";
public String CustNameField="//input[@placeholder='Name']";
public String CountryNameSel="//div[@name='country_id']//input";
public String StateNameSelect="//div[@name='state_id']//input";
public String CityTxtField="//input[@name='city']";
public String StreetTxtBx="//input[@name='street']";
public String JobPositionTxBx="//input[@name='function']";
public String EmailField="//input[@name='email']";
public String ContactNoField="//input[@name='phone']";
public String saveTab="//div/button[contains(text(),'Save')]";
public String CustomersTab="//a[text()='Customers']";
public String LoadFileTab="//div//button[text()='Load File']";
public String TestImportTab="//div//button[text()='Test Import']";
public String ImportFile="//div/button[text()='Import']";
public String validationText="//li//span[contains(text(),'Everything seems valid.')]";
public String Selectcustomer=" //strong[contains(@class,'kanban_record')]/span[contains(text(),'')]";
public String EditTab="//div/button[contains(text(),'Edit')]";
public String mobileno="//div/input[@name='mobile']";
public String actiondropdown="//div[contains(@class,'dropdown')]/button[contains(text(),'Action')]";
public String duplicatetab="//a[contains(text(),'Duplicate')]";
public String deletetab="//a[contains(text(),'Delete')]";
public String EditImage="//button[@title='Edit']";
public String DeleteAllHamburger="//button[contains(@class,'switch_list')]";
public String CustomerList="//tbody[@class='ui-sortable']/tr";
public String SelectOK="//button/span[text()='Ok']";
}
