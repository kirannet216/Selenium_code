package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//Launching Browser	
	System.setProperty("webdriver.chrome.driver","/TestLeaf/selenium/Selenium/drivers/chromedriver.exe" );
	//ClassName obj = New ClassName
	ChromeDriver chrome = new ChromeDriver();
	//Loading URL
	chrome.get("https://www.facebook.com/");
	
	chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Maximise the window
	chrome.manage().window().maximize();
	//Enter Email 
	chrome.findElementByXPath(".//*[@id='email']").sendKeys("kirannet216@gmail.com");
	//Enter Password 
	chrome.findElementByXPath(".//*[@id='pass']").sendKeys("kiranchowdary");
	//Click Login Button 
	chrome.findElementById("loginbutton").click();
	//Waiting
	Thread.sleep(10000);
	//Navigating Log out notification 
	chrome.findElementById("userNavigationLabel").click();
	//Waiting
	Thread.sleep(10000);
	//Clicking LogOut 
	//chrome.findElementByXPath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span").click();
	chrome.findElementByXPath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a").click();
	                    
	
	}

}

