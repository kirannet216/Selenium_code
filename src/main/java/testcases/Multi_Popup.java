
package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Multi_Popup extends GenericWrappers {
	@Test
	public void Invokeapp() throws Exception{
		
		//Getting the URL
		invokeApp("chrome", "http://popuptest.com/");		
		//Click on Multi pop link 
		clickByLink("Multi-PopUp Test #2");
		//Called method to close all child windows except parent
		closeExceptParent();
		//Switch to Parent window
		switchToParentWindow();
		//Click on Back button
		clickByXpath("/html/body/table[2]/tbody/tr/td/form/input");
		//Title of the main window
		getTitle();
				
	}
}
