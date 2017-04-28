package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WEEK1DAY1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Initialize browser		
	System.setProperty("webdriver.chrome.driver","/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
	
	//ClassName obj = New ClassName 
	ChromeDriver chrome = new ChromeDriver();
	//Implicit wait
	chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Loading URL
	chrome.get("http://leaftaps.com/");
    //Passing Login name
	chrome.findElementById("username").sendKeys("DemoSalesManager"); 	 
	//Passing Login password
	chrome.findElementById("password").sendKeys("crmsfa");
	//Clicking Login Button
	chrome.findElementByClassName("decorativeSubmit").click();
	//Clicking Logout Button
	chrome.findElementByClassName("decorativeSubmit").click(); 
	

	
		
		
		
	}

}
