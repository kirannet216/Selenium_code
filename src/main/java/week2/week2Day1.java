package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class week2Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing webdriver
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		//ClassName obj = new ClassName
		ChromeDriver chrome = new ChromeDriver();
		//Load URL
		chrome.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//Implicit wait
		chrome.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		//Maximise window
		chrome.manage().window().maximize();
		//Switch to IFrame
		chrome.switchTo().frame("iframeResult");
		//Click On try it Button 
		chrome.findElementByXPath("/html/body/button").click();
		
	    //Initializing alert   
		Alert alrt = chrome.switchTo().alert();
		//Input name 
		alrt.sendKeys("KiranKumar");
		//Accepting alert
	    alrt.accept();
	    //Verifying alert
	    boolean i = chrome.findElementByXPath("//*[@id='demo']").getText().contains("KiranKumar");
	    if (i = true )
	    {
	    	System.out.println("Matched");//Printing
	    }
	    else
	    {
	    	System.out.println("Not Matched");//Printing
	    }
	     
	     
		
		
		
		
		
		
		
		

	}

}
