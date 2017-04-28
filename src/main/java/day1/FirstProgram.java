package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		chrome.findElementByLinkText("Create Lead").click();
		/*chrome.findElementById("ext-gen596").click();
		chrome.findElementById("Create Lead").click();*/
		
		/*chrome.findElementByXPath("//*[@id='ext-gen596']").click();
		chrome.findElementByXPath("//*[@id='ext-gen632']").click();*/
		
		String kk = chrome.findElementByLinkText("Find Leads").getText();
		System.out.println(kk);
		
		
		
		

	}

}
