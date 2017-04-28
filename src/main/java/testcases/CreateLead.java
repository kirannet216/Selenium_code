package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class CreateLead extends GenericWrappers{
	
	@Test
	public void login() throws InterruptedException{
	//throws Exception{
		//Launching URL
		invokeApp("chrome", "http://leaftaps.com");
		
		//Input UserName
		enterById("username","DemoSalesManager");
		
		//Input Password
		enterById("password","crmsfa");

		//Click Login Button
		clickByClassName("decorativeSubmit");
		
		//Click on Link
		clickByLink("CRM/SFA");
		
		//Click CreateLead 
		clickByLink("Create Lead");
		
		//Input Company Name
		enterById("createLeadForm_companyName","Plintron");
		
		//Input  Name
		enterById("createLeadForm_firstName","kiran");
		
		//Input  Lasr Name
		enterById("createLeadForm_lastName","kumar");
		
		//Input  source Id
		selectVisibileTextById("createLeadForm_dataSourceId","Employee");
		
		//Select id 
		selectVisibileTextById("createLeadForm_marketingCampaignId","Automobile");
		
		//Input Name
		enterById("createLeadForm_firstNameLocal","kiran");
		
		//Input Last Name
		enterById("createLeadForm_lastNameLocal","kumar");
		
		//Input G
		enterById("createLeadForm_personalTitle","Mr");
		
		//Input Title
		enterById("createLeadForm_generalProfTitle","kk");
		
		//Input Department
		enterById("createLeadForm_departmentName","Testing");
		
		//Input Revenue
		enterById("createLeadForm_annualRevenue","15");		
		
		//Input currency
		selectVisibileTextById("createLeadForm_currencyUomId","AOK - Angolan Kwanza");
		
		//Input industry		
		selectVisibileTextById("createLeadForm_industryEnumId","Aerospace"); 

		//Input no of employees
		enterById("createLeadForm_numberEmployees","15");
		
		//Input owner
		selectVisibileTextById("createLeadForm_ownershipEnumId","Partnership");
		
		//Input code
		enterById("createLeadForm_sicCode","1");
		
		//Input symbol
		enterById("createLeadForm_tickerSymbol","2");
		
		//Input currency
		enterById("createLeadForm_description","2");
		
		//Input Description
		enterById("createLeadForm_importantNote","hi");
		
		//Input cc 
		enterById("createLeadForm_primaryPhoneCountryCode","2");
		
		//Input area code
		enterById("createLeadForm_primaryPhoneAreaCode","12");
		
		//Input phone number 
		enterById("createLeadForm_primaryPhoneNumber","875455464");
		
		//Input extension 
		enterById("createLeadForm_primaryPhoneExtension","464");
		
		//Input ask for 
		enterById("createLeadForm_primaryPhoneAskForName","kya");
		
		//Input Email 
		enterById("createLeadForm_primaryEmail","kk@gmail.com");
		
		//Input URL
		enterById("createLeadForm_primaryWebUrl","www.gmail.com");

		//Input General name
		enterById("createLeadForm_generalToName","kk");
		
		//Input atten name
		enterById("createLeadForm_generalAttnName","kumar");
		
		//Input address1
		enterById("createLeadForm_generalAddress1","madipakkam");
		
		//Input address2
		enterById("createLeadForm_generalAddress2","madipakkamc");
		
		//Input address3
		enterById("createLeadForm_generalAddress2","madipakkamc");
		
		//Input City
		enterById("createLeadForm_generalCity","mkamc");

		//Input country
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","Arizona");
		
		//Input pincode
		enterById("createLeadForm_generalPostalCode","600091");
		
		//Input cc
		selectVisibileTextById("createLeadForm_generalCountryGeoId","Angola");
		
		//Input pin
		enterById("createLeadForm_generalPostalCodeExt","60081"); 
		 
		//Click submit button 
		clickByName("submitButton");
			
	}

	
	
}
