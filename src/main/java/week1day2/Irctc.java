package week1day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Initializing webdriver
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		                                               

		//ClassName obj = New ClassName 
		ChromeDriver chrome = new ChromeDriver();
		//Launching URL
		chrome.get("https://www.irctc.co.in");
		//Maximise
		chrome.manage().window().maximize();
		//Implicitly wait 
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Clicking on SignUP
		chrome.findElementByLinkText("Sign up").click();
		//Enter UserName 
		chrome.findElementById("userRegistrationForm:userName").sendKeys("kathi001");
		//Click Check availability
		chrome.findElementByLinkText("Check Availability").click();
		//Enter Password
		chrome.findElementById("userRegistrationForm:password").sendKeys("Kiran@123");
		//Enter Confirm Password 
		chrome.findElementById("userRegistrationForm:confpasword").sendKeys("Kiran@123");
		//Clecking Security dropdown 
		chrome.findElementById("userRegistrationForm:securityQ").click();
		//Selecting security Question 
		
	     //Creating Webelement userRegistrationForm:securityQ
		WebElement dd =chrome.findElementById("userRegistrationForm:securityQ");
	     //ClassName obj = New ClassName
	     Select Dropdown = new Select(dd);
	     //Select Dropdown by Visible Text
	     Dropdown.selectByVisibleText("What is your pet name?");
	     //Entering Securiy answer
	     chrome.findElementById("userRegistrationForm:securityAnswer").sendKeys("Kiran");
	     
	     //Creating Webelement userRegistrationForm:prelan	     
	     WebElement Language =chrome.findElementById("userRegistrationForm:prelan");
         //ClassName obj = New ClassName
	     Select Dropdown1 = new Select(Language);
	     //Click Language dropdown	     
	     chrome.findElementById("userRegistrationForm:prelan").click();
	     //Select language
	     Dropdown1.selectByVisibleText("English");
	     
	     //Personal Detail 
	     //FirstName
	     chrome.findElementById("userRegistrationForm:firstName").sendKeys("Kiran");
	     //MiddleName
	     chrome.findElementById("userRegistrationForm:middleName").sendKeys("kumar");
	     //LastName
	     chrome.findElementById("userRegistrationForm:lastName").sendKeys("kumar");
	     //Clicking Radio Button Gender
	     chrome.findElementById("userRegistrationForm:gender:0").click();
	     //Clicking Radio Button Marital Status
	     chrome.findElementById("userRegistrationForm:maritalStatus:0").click();
	     
	     //Creating Webelement userRegistrationForm:dobDay
	     WebElement date =chrome.findElementById("userRegistrationForm:dobDay");
         //ClassName obj = New ClassName
	     Select Dropdown2 = new Select(date);
	     //Clicking Date dropdown
	     chrome.findElementById("userRegistrationForm:dobDay").click();
	     //Select Date by Value
	     Dropdown2.selectByVisibleText("16");

	     //Creating Webelement userRegistrationForm:dobMonth	     
	     WebElement Month =chrome.findElementById("userRegistrationForm:dobMonth");
         //ClassName obj = New ClassName
	     Select Dropdown3 = new Select(Month);
	     //Clicking Month dropdown
	     chrome.findElementById("userRegistrationForm:dobMonth").click();
	     //Select Month by Value
	     Dropdown3.selectByVisibleText("FEB");
	     
		 //Creating Webelement userRegistrationForm:dateOfBirth
	     WebElement Year =chrome.findElementById("userRegistrationForm:dateOfBirth");
         //ClassName obj = New ClassName
	     Select Dropdown4 = new Select(Year);
	     //Clicking Year dropdown
	     chrome.findElementById("userRegistrationForm:dateOfBirth").click();
	     //Select Year by Value
	     Dropdown4.selectByVisibleText("1985");
	     
		 //Creating Webelement userRegistrationForm:occupation	     
	     WebElement occupation  =chrome.findElementById("userRegistrationForm:occupation");
         //ClassName obj = New ClassName
	     Select Dropdown5 = new Select(occupation);
	     //Clicking Occupation dropdown
	     chrome.findElementById("userRegistrationForm:occupation").click();
	     //Select Occupation by Value
	     Dropdown5.selectByVisibleText("Private");
	     
	     //Entering Aadhar no 
	     chrome.findElementById("userRegistrationForm:uidno").sendKeys("123456781290");
	     //Enter Pan no 
	     chrome.findElementById("userRegistrationForm:idno").sendKeys("ABC123456");
	     //Enter Email 
	     chrome.findElementById("userRegistrationForm:email").sendKeys("kirannet216@gmail.com");
	     //Enter Mobile no 
	     chrome.findElementById("userRegistrationForm:mobile").sendKeys("8754554353");
	     
	   //Creating Webelement userRegistrationForm:nationalityId
	     WebElement nationality  =chrome.findElementById("userRegistrationForm:nationalityId");
         //ClassName obj = New ClassName
	     Select Dropdown6 = new Select(nationality);
	     //Clicking Occupation dropdown
	     chrome.findElementById("userRegistrationForm:nationalityId").click();
	     //Select Occupation by Value
	     Dropdown6.selectByVisibleText("India");
	     
	     
	     //Residential Address
	     //Input door no 
	     chrome.findElementById("userRegistrationForm:address").sendKeys("no.02");
	     //Input street 
	     chrome.findElementById("userRegistrationForm:street").sendKeys("RaghavaNagar");
	     //Input Area
	     chrome.findElementById("userRegistrationForm:area").sendKeys("Madipakkam");

	     //Creating Webelement userRegistrationForm:countries
	     WebElement country  =chrome.findElementById("userRegistrationForm:countries");
         //ClassName obj = New ClassName
	     Select Dropdown7 = new Select(country);
	     //Clicking Country dropdown
	     chrome.findElementById("userRegistrationForm:countries").click();
	     //Select country by Value
	     Dropdown7.selectByVisibleText("India");
	     
	     //Input pincode 
	     chrome.findElementById("userRegistrationForm:pincode").sendKeys("600091",Keys.TAB);
	     //wait time to load State
	     Thread.sleep(5000);
	     chrome.findElementById("userRegistrationForm:statesName").click();
	     
	     //Creating Webelement userRegistrationForm:cityName
	     WebElement city  =chrome.findElementById("userRegistrationForm:cityName");
	     //ClassName obj = New ClassName
	     Select Dropdown8 = new Select(city);
	     //Clicking City dropdown	     
	     chrome.findElementById("userRegistrationForm:cityName").click();	     
	     Dropdown8.selectByValue("Kanchipuram");
	     Thread.sleep(5000);
	     
	     //Creating Webelement userRegistrationForm:postofficeName
	     WebElement post  =chrome.findElementById("userRegistrationForm:postofficeName");
         //ClassName obj = New ClassName
	     Select Dropdown9 = new Select(post);
	     //Clicking Country dropdown
	     chrome.findElementById("userRegistrationForm:postofficeName").click();
	     //Select country by Value
	     Dropdown9.selectByVisibleText("Madipakkam S.O");
	     
	     //Input Phone number
	     chrome.findElementById("userRegistrationForm:landline").sendKeys("044123456");
	     //Clicking Copy residence to office address
	     chrome.findElementById("userRegistrationForm:resAndOff").click(); 
	     
		
	}

}
