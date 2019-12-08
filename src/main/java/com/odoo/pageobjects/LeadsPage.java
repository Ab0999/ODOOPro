package com.odoo.pageobjects;

public class LeadsPage 
{
	
public String Create= "//button[contains(text(),'Create')]";	
public String LeadNameTxBx= "//input[@name='name']";
public String CompanyTxBx= "//input[@name='partner_name']";
public String ContactName= "//input[@name='contact_name']";
public String TitleDropDown= "//input[contains(@class,'o_input ')][@placeholder='T﻿i﻿t﻿l﻿e']";
public String EmailTxBx= "//input[@name='email_from']";
public String JobPositionTxBx= "//input[@name='function']";
public String PhoneTxBx= "//input[@name='phone']";
public String MobileTxBx= "//input[@name='mobile']";
public String SalesTeamDropDown= "//select[@name='team_id']";
public String SalesPerson= "//ul[contains(@class,'ui-menu ')]/li/a[text()='"+"" +"']";
public String SaveButton= "//button[contains(text(),'Save')]";
public String LeadsTab= "(//a[contains(text(),'Leads')])[2]";  // Exists on the Create leads Page Redirects back to the Leads List Page.
public String Streat1 = "//input[@name='street']";
public String Streat2 = "//input[@name='street2']";
public String CityName= "//input[@name='city']";
public String State= "//div[@class='o_input_dropdown']/input[@placeholder='S﻿t﻿a﻿t﻿e']";
public String Country= "//div[@class='o_input_dropdown']/input[@placeholder='C﻿o﻿u﻿n﻿t﻿r﻿y']";
public String ZipCode= "//input[@name='zip']";
public String ConvertToOpp= "//span[contains(text(),'Convert')]";
public String SalesTeamopp= "//select[@name='team_id']";
public String SelectCustomerDropdown="(//div[@class='o_input_dropdown']/input)[2]";
public String Customers="//li[@class='ui-menu-item']/a";


}
 