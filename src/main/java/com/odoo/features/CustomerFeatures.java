package com.odoo.features;

import org.openqa.selenium.WebDriver;

import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.Customerpage;
import com.odoo.steps.CustomerSteps;

public class CustomerFeatures 
{
	Customerpage custp;
	CommonFeatures cf;
	CustomerSteps cs;
	BasePage bp;
public CustomerFeatures(WebDriver driver)
{
	bp= new BasePage();
	custp= new Customerpage();
	cs= new CustomerSteps(driver);
	cf= new CommonFeatures(driver);	
}
public void CreateCustomer(String name,String StreetName,String Email,String Contact,String city,String State,String Country,String Jobposition)
{
																													/*
																													 * cs.ClickonCRM(); cs.ClickonSales(); cs.ClickonCustomer(); 
																													 * cs.ClickonIndividualRadio(); cs.EnterName(name);
																													 * cs.EnterStreetname(StreetName); cs.EnterJobposition(jobPosition);
																													 * cs.EnterCountry(Country); cs.EnterState(State); cs.EnterCity(city);
																													 * cs.EnterContact(Contact); cs.EnterEmail(Email);
																													 */

	cs.CommonSales();
	cs.CreateCustomer(name, Jobposition, StreetName, Country, State, city, Contact, Email);
	cs.ClickonSave();
}


public void VerifyCreateCustomer(String name)
{
	cs.ClickonCustomerTab();
	cs.verifyCustomer(name);
	cf.logout();	
}
public void CreateCustomerImportFeature(String expectedText,String ImportPath)
{
																									/*
																									 * cs.ClickonCRM(); cs.ClickonSales(); cs.ClickonCustomer();
																									 */
	cs.CommonSales();
	cs.clickonImport();
	cs.clickonLoadFile(ImportPath);
	cs.clickontestImport();
	cs.clickonImportFile(expectedText);
}
public void VerifyCustomerImportFeature(String name)
{
	//cs.ClickonCustomerTab();
    cs.verifyCustomer(name);
	cf.logout();
}
public void DeleteAllCustomer() 
{
  cs.CommonSales();
  cs.DeleteAllCustomer();
}
public void EditCustomer(String name,String ImportPath,String MobNo)
{	
																														    /*
																															 * cs.ClickonCRM(); cs.ClickonSales(); cs.ClickonCustomer();
																															 */
cs.CommonSales();																																//cs.SelectCustomer(name);
cs.EditCustomer(MobNo,ImportPath,name);
cs.ClickonSave();																															//cs.ClickOnEdit();
																														//cs.EditMobile(MobNo);
																												       //cs.UploadImageFile("./UploadAutoITexefiles/UploadJPGFile.exe");

}
public void ValidateEditCustomer(String MobNo)
{	
cs.ValidateEditCustomer(MobNo);
cf.logout();
}
public void CreateDuplicateCustomer(String name)
{
		/*
		 * cs.ClickonCRM(); cs.ClickonSales(); cs.ClickonCustomer();
		 */
cs.CommonSales();
cs.SelectCustomer(name);
cs.CreateDuplicateCustomer();
cs.ClickonSave();
cs.ClickonCustomerTab();
}

public void validateDuplicateCustomer(String name)
{
	cs.validateDuplicateCustomer(name);
	cf.logout();
}
public void DeleteDuplicateCustomer(String name)
{
	/*
		 * cs.ClickonCRM(); cs.ClickonSales(); cs.ClickonCustomer();
		 */
cs.CommonSales();
cs.DeleteDuplicateCustomer(name);
cs.ClickonCustomerTab();
}

public void validateDeleteDuplicateCustomer(String name)
{
	cs.validateDeleteCustomer(name);
	cf.logout();
}

}

