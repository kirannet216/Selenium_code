package week1day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initializing webdriver
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		
		//ClassName obj = New ClassName 
		ChromeDriver chrome = new ChromeDriver();
		//Loading URL
		chrome.get("http://leaftaps.com/");
		
		//Implicit Wait
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    //Passing Login name
		chrome.findElementById("username").sendKeys("DemoSalesManager"); 	 
		//Passing Login password
		chrome.findElementById("password").sendKeys("crmsfa");
		//Clicking Login Button 
		chrome.findElementByClassName("decorativeSubmit").click();
        //Clicking on CRM/SFA Link 
		chrome.findElementByLinkText("CRM/SFA").click();
		//chrome.findElementByLinkText("Create Lead").click(); //Clicking on Create Lead using  Link Test
		chrome.findElementByPartialLinkText("Create").click(); //Clicking on Create Lead using Partial Link Test 
		
		chrome.findElementById("createLeadForm_companyName").sendKeys("PlintronTechnologies,.com"); // Input company name
		chrome.findElementById("createLeadForm_firstName").sendKeys("kiran");// Input first name
		chrome.findElementById("createLeadForm_lastName").sendKeys("kumar");// Input Last name
		chrome.findElementById("createLeadForm_dataSourceId").click();// Clicking dropdown
		
		WebElement dd = chrome.findElementById("createLeadForm_dataSourceId"); //Initializing WebElement
		//ClassName obj = New ClassName
		Select Dropdown = new Select(dd);  //Calling WebElement in a Class
		Dropdown.selectByVisibleText("Cold Call"); // Select dropdown item by visible text
		Thread.sleep(1000);//Waits 10 milli seconds
		Dropdown.selectByValue("LEAD_CONFERENCE"); //Select dropdown item by value
		Thread.sleep(1000);//Waits 10 milli seconds
		Dropdown.selectByIndex(3);//Select dropdown item by value
		
		
		List<WebElement> allOptions = Dropdown.getOptions();
		allOptions.size();   // Counting total no of drop down Items
		System.out.println(allOptions.size()); // Prinnting total no of drop down Items 
		Dropdown.selectByIndex(allOptions.size()-1); //Selecting Last Item from Dropdown Using Index
		
		
      
		

	}

	

}
