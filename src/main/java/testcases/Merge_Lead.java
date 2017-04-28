package testcases;

import org.junit.Test;
import org.openqa.selenium.Alert;

import wrappers.GenericWrappers;

public class Merge_Lead extends GenericWrappers{
	
	@Test
	public void Merge_Lead() throws Exception{
		
		//Launching URL
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
		
		//Click Merge Leads
		clickByLink("Merge Leads");
		
		//Click From Lead window
		clickByXpath("(//img[@alt='Lookup'])[1]");

		//Switch to Child window 
		switchToLastWindow();
		
		//input From lead id
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","10232");
		
		//Click on Find Leads
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
    	//waiting to Load 
		Thread.sleep(5000);
		//Click on First Listed Item
		
		clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		//Switch to Parent window
		switchToParentWindow();

		//Click To Lead window
		 clickByXpath("(//img[@alt='Lookup'])[2]");
		
		//Switch to Child window
		 switchToLastWindow();
		
		//input To Lead id 
		 enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","10233");
		
		//Click on Find Leads
		 clickByXpath("//button[contains(text(),'Find Leads')]");
		
		 //waiting to Load 
		 Thread.sleep(5000);
		
		 //Click on First Listed Item
		 clickByXpathNoSnap("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		 //Switch to Parent window
		 switchToParentWindow();
		 
		 //Click on Merge 
		 clickByLink("Merge"); 
		
		 //Accepting alert		 
		 acceptAlert();
		
		 //waiting to Load 
		 Thread.sleep(5000);
		 
		 //Click on Find Leads		 	
		 clickByLink("Find Leads");
		 
		 //input From lead id
		 enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","10232");
     	 
		 //Click on Find Leads
  	    clickByXpath("//button[contains(text(),'Find Leads')]");
		 
		 //Reading the error message
		 verifyTextByXpath("//div[contains(text(),'No records to display')]","No records to display");
		 
	}
	

}
