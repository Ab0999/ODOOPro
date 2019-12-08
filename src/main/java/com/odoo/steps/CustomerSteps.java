package com.odoo.steps;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.odoo.generic.SeleniumLib;
import com.odoo.pageobjects.BasePage;
import com.odoo.pageobjects.Customerpage;
import com.odoo.webutils.RobotClass;

public class CustomerSteps {
	WebDriver driver;
	Customerpage custp;
	BasePage bp;
	SeleniumLib sl;

	public CustomerSteps(WebDriver driver) {
		this.driver = driver;
		custp = new Customerpage();
		bp = new BasePage();
		sl = new SeleniumLib(driver);
	}
	
	public void CommonSales() 
	{
		sl.iSleep(3);
		driver.findElement(By.xpath(bp.Crm)).click();	
		sl.iSleep(3);
		driver.findElement(By.xpath(bp.sales)).click();
		sl.iSleep(5);
		driver.findElement(By.xpath(bp.Customers)).click();
		sl.iSleep(5);
	}
	
	
	public void CreateCustomer(String name,String Jobposition,String StreetName,String Country,String State,String city,String Contact,String Email ) 
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(custp.create)).click();
		driver.findElement(By.xpath(custp.IndividualRadioBtn)).click();
		driver.findElement(By.xpath(custp.CustNameField)).sendKeys(name);
		driver.findElement(By.xpath(custp.JobPositionTxBx)).sendKeys(Jobposition);
		driver.findElement(By.xpath(custp.StreetTxtBx)).sendKeys(StreetName);
		driver.findElement(By.xpath(custp.CountryNameSel)).sendKeys(Country, Keys.ENTER);
		driver.findElement(By.xpath(custp.StateNameSelect)).sendKeys(State, Keys.ENTER);
		driver.findElement(By.xpath(custp.CityTxtField)).sendKeys(city);
		driver.findElement(By.xpath(custp.ContactNoField)).sendKeys(Contact);
		driver.findElement(By.xpath(custp.EmailField)).sendKeys(Email);
	}
	
	
	public void EditCustomer(String MobNo,String ImportPath,String name)
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(" //strong[contains(@class,'kanban_record')]/span[contains(text(),'" +name+ "')]")).click();
		sl.iSleep(3);
		driver.findElement(By.xpath(custp.EditTab)).click();
		driver.findElement(By.xpath(custp.mobileno)).sendKeys(MobNo);
		sl.iSleep(3);
		driver.findElement(By.xpath(custp.EditImage)).click();
		sl.iSleep(3);
		RuntimeImportFile(ImportPath);
	}
	
	
	public void DeleteAllCustomer()
	{
		sl.iSleep(2);
		driver.findElement(By.xpath("//button[contains(@class,'switch_list')]")).click();
		List<WebElement> Customers = driver.findElements(By.xpath("//td[@class='o_list_record_selector']"));
		for (int i = 1; i < Customers.size(); i++) 
		{
			WebElement selCustmr = Customers.get(i);
			selCustmr.click();
		}
		driver.findElement(By.xpath(custp.actiondropdown)).click();
		driver.findElement(By.xpath(custp.deletetab)).click();
		sl.iSleep(2);
		driver.findElement(By.xpath(custp.SelectOK)).click();	
	}
	
	// **********************************************************************************************************************
	/*
	 * public void ClickonSales() { sl.iSleep(5);
	 * driver.findElement(By.xpath(bp.sales)).click(); }
	 */
	// **********************************************************************************************************************
	/*
	 * public void ClickonCustomer() { sl.iSleep(5);
	 * driver.findElement(By.xpath(bp.Customers)).click(); }
	 */
	// **********************************************************************************************************************
	/*
	 * public void ClickonCreate() { sl.iSleep(5);
	 * driver.findElement(By.xpath(custp.create)).click(); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void ClickonIndividualRadio() { sl.iSleep(5);
	 * driver.findElement(By.xpath(custp.IndividualRadioBtn)).click(); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterName(String name) {
	 * driver.findElement(By.xpath(custp.CustNameField)).sendKeys(name); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterStreetname(String StreetName) {
	 * driver.findElement(By.xpath(custp.StreetTxtBx)).sendKeys(StreetName); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterCity(String city) {
	 * driver.findElement(By.xpath(custp.CityTxtField)).sendKeys(city); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterState(String State) {
	 * driver.findElement(By.xpath(custp.StateNameSelect)).sendKeys(State,
	 * Keys.ENTER); //
	 * driver.findElement(By.xpath(custp.CountryNameSel)).sendKeys(Keys.ENTER); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterCountry(String Country) {
	 * driver.findElement(By.xpath(custp.CountryNameSel)).sendKeys(Country,
	 * Keys.ENTER); //
	 * driver.findElement(By.xpath(custp.CountryNameSel)).sendKeys(Keys.ENTER); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterJobposition(String Jobposition) {
	 * driver.findElement(By.xpath(custp.JobPositionTxBx)).sendKeys(Jobposition); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterContact(String Contact) {
	 * driver.findElement(By.xpath(custp.ContactNoField)).sendKeys(Contact); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void EnterEmail(String Email) {
	 * driver.findElement(By.xpath(custp.EmailField)).sendKeys(Email); }
	 */

	// **********************************************************************************************************************
	/*
	 * public void ClickonCRM() { sl.iSleep(5);
	 * driver.findElement(By.xpath(bp.Crm)).click(); }
	 */

	// **********************************************************************************************************************
	public void ClickonSave() 
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(custp.saveTab)).click();

	}

	// **********************************************************************************************************************
	public void ClickonCustomerTab()
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(custp.CustomersTab)).click();
	}

	// **********************************************************************************************************************
	public void clickonImport() 
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(custp.Import)).click();
	}

	// **********************************************************************************************************************
	public void clickonLoadFile(String ImportPath) 
	{
		sl.iSleep(5);
		WebElement loadfile = driver.findElement(By.xpath(custp.LoadFileTab));
		loadfile.click();
		sl.iSleep(5);
		// RuntimeImportFile("./UploadAutoIT/UploadExcelFile.exe");
		try {
			RobotClass.fileupload(ImportPath);
		} catch (AWTException e) {

			e.printStackTrace();
		}
	}

	// **********************************************************************************************************************
	public void RuntimeImportFile(String ImportPath) {
		sl.iSleep(10);
		try {
			Process exec = Runtime.getRuntime().exec(ImportPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// **********************************************************************************************************************
	public void clickontestImport() 
	{
		driver.findElement(By.xpath(custp.TestImportTab)).click();

	}

	// **********************************************************************************************************************
	/*
	 * public void UploadImageFile(String ImportPath) { sl.iSleep(3);
	 * driver.findElement(By.xpath(custp.EditImage)).click(); sl.iSleep(3);
	 * RuntimeImportFile(ImportPath); }
	 */

	// **********************************************************************************************************************
	public void ClickOnEdit() {
		sl.iSleep(5);
		driver.findElement(By.xpath(custp.EditTab)).click();
	}

	// **********************************************************************************************************************
	public void CreateDuplicateCustomer() {
		sl.iSleep(2);
		driver.findElement(By.xpath(custp.actiondropdown)).click();
		sl.iSleep(2);
		driver.findElement(By.xpath(custp.duplicatetab)).click();
	}

	// **********************************************************************************************************************
	

	// **********************************************************************************************************************
	public void DeleteDuplicateCustomer(String name) {
		driver.findElement(By.xpath(" //strong[contains(@class,'kanban_record')]/span[contains(text(),'"+name+"')]")).click();
		sl.iSleep(2);
		driver.findElement(By.xpath(custp.actiondropdown)).click();
		sl.iSleep(2);
		driver.findElement(By.xpath(custp.deletetab)).click();
		sl.iSleep(3);
		driver.findElement(By.xpath("//button/span[contains(text(),'Ok')]")).click();
	}

	// **********************************************************************************************************************
	public void validateDeleteCustomer(String name) {
		sl.iSleep(3);
		List<WebElement> Customers = driver.findElements(By.xpath("//strong[contains(@class,'title')]/span"));
		for (int i = 0; i < Customers.size(); i++)
		{
			String custname = Customers.get(i).getText();
			
		   if(custname.concat(" (copy)").equalsIgnoreCase(name))
		{
			//Reporter.log("Duplicate Customer Exists", true);
		}
		}
		Reporter.log("Delete Duplicate Customer Verified Successfully", true);
	}

	// **********************************************************************************************************************
	public void validateDuplicateCustomer(String name)
	{
		sl.iSleep(3);
		List<WebElement> Customers = driver.findElements(By.xpath("//strong[contains(@class,'title')]/span"));
		for (int i = 0; i < Customers.size(); i++) {
			String custname = Customers.get(i).getText();
			if (custname.concat(("(copy)")).equalsIgnoreCase(name)) 
			{
				Reporter.log("Duplicate Customer Verified and validated successfully", true);
			}
		}
	}

	// **********************************************************************************************************************
	/*
	 * public void EditMobile(String MobNo) {
	 * driver.findElement(By.xpath(custp.mobileno)).sendKeys(MobNo); }
	 */

	// **********************************************************************************************************************
	public void SelectCustomer(String name) 
	{
		sl.iSleep(5);
		driver.findElement(By.xpath(" //strong[contains(@class,'kanban_record')]/span[contains(text(),'" + name + "')]")).click();
	}

	// **********************************************************************************************************************
	public void clickonImportFile(String expectedtext) 
	
	{
		String validText = driver.findElement(By.xpath("//li//span[contains(text(),'valid.')]")).getText();
		System.out.println(validText);
		if (validText.equalsIgnoreCase(expectedtext))
		{
		System.out.println(validText+" = "+expectedtext+" Verified");
		sl.iSleep(3);
		driver.findElement(By.xpath(custp.ImportFile)).click();
		}
	}

	
	
	// **********************************************************************************************************************
	public void ValidateEditCustomer(String MobNo) 
	{
		sl.iSleep(5);
		String actualNo = driver.findElement(By.xpath("//div[@class=\"o_row\"]/a[@name='mobile']")).getText();
		Assert.assertEquals(actualNo, MobNo);
		Reporter.log("Edit Customer Has been Successfully validated", true);
	}

	// **********************************************************************************************************************
	public void verifyCustomer(String name) 
	{
		sl.iSleep(5);
		List<WebElement> Customers = driver.findElements(By.xpath("//strong[contains(@class,'title')]/span"));
		for (int i = 0; i < Customers.size(); i++) {
			String custname = Customers.get(i).getText();
			if (custname.equalsIgnoreCase(name)) 
			{
				Reporter.log(custname+" = "+name, true);
				Reporter.log("Customer Verified and validated successfully", true);
			}
		}
	}
}
