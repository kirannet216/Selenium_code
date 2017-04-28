package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Duplicate_Lead extends GenericWrappers {
	@Test
	public void Merge_Lead() throws Exception{
		
		//Getting the URL
		invokeApp("chrome", "http://leaftaps.com/");
		
		
		
		//Input UserName
		enterById("username","DemoSalesManager");
		
		//Input Password
		enterById("password","crmsfa");
		
		//Click Login
		clickByClassName("decorativeSubmit");
		
		//Click Link
		clickByLink("CRM/SFA");
		
		//Click Leads
		clickByLink("Leads");
		
		//Click on FindLeads
		clickByLink("Find Leads");
		
		//Click on Email field
		clickByXpath("//span[contains(text(),'Email')]");
		
		//Input Email
		enterByName("emailAddress","kishore@ymail.com");
		
		//Click on Find Lead button 
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		//Get text of First listed item name  
		String Name = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		
		//Prinnting the Selected Item
		System.out.println(Name);
		
		//Click on First Resulting Item
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		//Click On Duplicate Lead
		clickByLink("Duplicate Lead");
		
		//Verify text duplicate Lead 
		verifyTextByXpath("//div[contains(text(),'Duplicate Lead')]","Duplicate Lead");
		
		//Click Create Lead button 
		clickByName("submitButton");
		
		//Getting and storing duplicate lead name
		String Text = getTextById("viewLead_firstName_sp");
		
		//Printing Lead name
		System.out.println(Text);
		
		//Comparing the duplicated lead name is same as captured name
		verifyTextById("viewLead_firstName_sp","KISHORE");
		
		//Closing the Browser
		closeBrowser();
		
	}
}
