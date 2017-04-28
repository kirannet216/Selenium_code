package week2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class LeafWindowHandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		//ClassName obj = New ClassName 
		ChromeDriver chrome = new ChromeDriver();
		
		//Implicit wait
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximise window
		chrome.manage().window().maximize();
		
		//Loading URL
		chrome.get("http://leaftaps.com/");
	    
		//Passing Login name
		chrome.findElementById("username").sendKeys("DemoSalesManager"); 	 
		
		//Passing Login password
		chrome.findElementById("password").sendKeys("crmsfa");
		
		//Clicking Login Button
		chrome.findElementByClassName("decorativeSubmit").click();

        //Clicking on CRM/SFA Link 
		chrome.findElementByLinkText("CRM/SFA").click();
		
		//Clicking on Leads
		chrome.findElementByLinkText("Leads").click();
		
		//Clicking on Merge Leads
		chrome.findElementByLinkText("Merge Leads").click();
		
		//Get handle of parent window
		String Parenthandle = chrome.getWindowHandle();
		
		String Childhandle2 = null;

		
		//Clicking on From Lead Icon
		chrome.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		

		//Get handle of Childhandle1		
		String Childhandle1 = chrome.getWindowHandle();

		
		//Get all the window handles
		 Set<String> allhandles = chrome.getWindowHandles();
		 
        //Initialize variables
		 String i="10138";
		 String j="10141";
		 
		 
		 //Loop through each handle 
		 for (String eachhandle : allhandles) {

		//Printing the size of handles 	 
	      System.out.println("handles Sise is "+allhandles.size());			      	          
			 
			  	if(eachhandle.equals(Parenthandle)) 
				 {
			  		//Current Url 
					 System.out.println(chrome.getCurrentUrl());
					 //Title of the window
					 System.out.println(chrome.getTitle());
					 //Get the Parent Handle
					 System.out.println(chrome.getWindowHandle());					 
				 }
				 else 
				 {       
					     //Getting no of handles
						 System.out.println("handles Sise is "+allhandles.size());
						 
						 //Switching to child handle 
						 chrome.switchTo().window(eachhandle);
						 
                         //Selenium in URL    
						 System.out.println(chrome.getCurrentUrl());
						 
						 //Title of the Child window
						 System.out.println(chrome.getTitle());
						 
						 //Child window handle name  
						 System.out.println(chrome.getWindowHandle());
						 
						 //Input Lead ID 						 
						 chrome.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys(i);
						 
						 //Click on find in child window 
						 chrome.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
						 
						 //waiting to Load 
						 Thread.sleep(5000);
						 
						 //Click on listed item
						 chrome.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
						 
						 //Switching to parent window
						 chrome.switchTo().window(Parenthandle);
						 
						 //Click on To window
						 chrome.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
						 
						 System.out.println("Clicked");						 

                         //Storing parent window handle  				 
						 String Parenthandle1 = chrome.getWindowHandle();
						 
						 //Setting list of handles 
						 Set<String> allhandles1 = chrome.getWindowHandles();
						 
						 //For each loop for child windows 
						 for (String eachhandle1 : allhandles1) {							
							 
								 if(eachhandle1.equals(Parenthandle1)) 
								 {
								  		//Current Url 
									 System.out.println(chrome.getCurrentUrl());
									 //Title of the window
									 System.out.println(chrome.getTitle());
									 //Get the Parent Handle
									 System.out.println(chrome.getWindowHandle());					 

								 }
								 else
								 {
									 //All handles size
									 System.out.println("handles Sise is "+allhandles1.size());
									 //Switching to child window 
									 chrome.switchTo().window(eachhandle1);
									 									 
									 //Getting the Current URL
									 System.out.println(chrome.getCurrentUrl());
									 
									 //Title of the window									 
									 System.out.println(chrome.getTitle());
									 
									 //Get the Parent Handle
									 System.out.println(chrome.getWindowHandle());
									 						 
									 //Input To lead id 
									 chrome.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys(j);
									 //Click on Find Lead button 
									 chrome.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
									 //waitung to Load 
									 Thread.sleep(5000);
									 //Clicking on first listed Item 
									 chrome.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
									 //Switching to parent window 
									 chrome.switchTo().window(Parenthandle1);
									 //Click onMerge button 
									 chrome.findElementByLinkText("Merge").click();
									 //breaks the Loop 
									 break;
									
								 }
						
					          }
						 
						 }
					 
					 }
		 //Accepting the alert
		 chrome.switchTo().alert().accept();
		 //Click on Find Leads 
		 chrome.findElementByLinkText("Find Leads").click();
		 //Passing the value 
		 chrome.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys(i);
		 //Click on Find Leads 
		 chrome.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		 //Reading the error message 
		 String k= chrome.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		 //Pring the error message 
		 System.out.println(k);
		 		 }
			  	      
		 }
				 
			 
		 	


