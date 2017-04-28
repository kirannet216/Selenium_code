package week1day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize browser		
		System.setProperty("webdriver.chrome.driver","/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		
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
		//Clicking on Create Contact
		chrome.findElementByLinkText("Create Contact").click();
		
		//Input FirstName 
		chrome.findElementById("firstNameField").sendKeys("kiran");
		//Input LastName
		chrome.findElementById("lastNameField").sendKeys("kumar");
		//Input  firstNameLocal
		chrome.findElementById("createContactForm_firstNameLocal").sendKeys("kk");
		//Input  firstNameLocal
		chrome.findElementById("createContactForm_lastNameLocal").sendKeys("Test_kiran");		
		//Input  Personal Title
		chrome.findElementById("createContactForm_personalTitle").sendKeys("Test");
		//Input  d.o.b		
		chrome.findElementById("createContactForm_birthDate").sendKeys("1985-02-16",Keys.TAB);
		//Input  General profile  title
		chrome.findElementById("createContactForm_generalProfTitle").sendKeys("General");
		//Input  Department Name 
		chrome.findElementById("createContactForm_departmentName").sendKeys("Automation");
		//Creating WebElement for Currency
		WebElement drop = chrome.findElementById("createContactForm_preferredCurrencyUomId");		
		//ClassName obj = new ClassName 
		Select Dropdown = new Select(drop);
		//Clicking the currency dropdown
		chrome.findElementById("createContactForm_preferredCurrencyUomId").click();
		//Selecting  the Currency
		Dropdown.selectByValue("DZD");
		//Input account
		chrome.findElementById("createContactForm_accountPartyId").sendKeys("18163");
		//Input Description 		
		chrome.findElementById("createContactForm_description").sendKeys("hi how are you "); 
		//Input imp Notice 		
		chrome.findElementById("createContactForm_importantNote").sendKeys("i am fine "); 
		//Input CountryCode
		chrome.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("1");
		//Input AreaCode
		chrome.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("11");
		//Input Phone Extension
		chrome.findElementById("createContactForm_primaryPhoneExtension").sendKeys("0765");
		//Input Phone number
		chrome.findElementById("createContactForm_primaryPhoneNumber").sendKeys("875455433");
		//Input askName
		chrome.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("rajesh");		
		//Input Email
		chrome.findElementById("createContactForm_primaryEmail").sendKeys("kirannet216@gmail.com");
		
		//Input Name 
		chrome.findElementById("generalToNameField").sendKeys("abc");
		//Input attnname 
		chrome.findElementById("createContactForm_generalAttnName").sendKeys("def");
		//Input address1 
		chrome.findElementById("createContactForm_generalAddress1").sendKeys("Madipakkam");
		//Input address1 
		chrome.findElementById("createContactForm_generalAddress2").sendKeys("Chennai");
		//Input Chennai 
		chrome.findElementById("createContactForm_generalCity").sendKeys("Chennai");
		
		//Initializing Country
		WebElement dd = chrome.findElementById("createContactForm_generalCountryGeoId");
		//ClassName obj = new ClassName
		Select Dropdown1 = new Select(dd); 
		chrome.findElementById("createContactForm_generalCountryGeoId").click();
		Dropdown1.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		//Initializing State
		WebElement dd1 = chrome.findElementById("createContactForm_generalStateProvinceGeoId");
		//ClassName obj = new ClassName
		Select Dropdown2 = new Select(dd1); 
		chrome.findElementById("createContactForm_generalStateProvinceGeoId").click();
		Thread.sleep(5000);
		Dropdown2.selectByValue("IN-TN");
		//Dropdown2.selectByVisibleText("TAMILNADU");
		
		//Input PostalCode
		chrome.findElementById("createContactForm_generalPostalCode").sendKeys("600091");
		//Input PostalCode Extension
		chrome.findElementById("createContactForm_generalPostalCodeExt").sendKeys("123");
		//Click on Submit Button 
		chrome.findElementByName("submitButton").click();
			
		//Clicking Logout Button
		//chrome.findElementByClassName("decorativeSubmit").click();
		
	}

}
