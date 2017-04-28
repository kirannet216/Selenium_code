package week1day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing Webdriver		
		System.setProperty("webdriver.chrome.driver","/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		                                       
		//ClassName obj = new ClassName 
		ChromeDriver chrome = new ChromeDriver();
		//Implictly wait
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Maximise window
		chrome.manage().window().maximize();
		//Loading URL
        chrome.get("http://leafground.com");
        chrome.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[7]/a/img").click();        
        //initializing Webelement
        WebElement checkbox= chrome.findElementByXPath("//*[@id='contentblock']/section/div[3]/input[1]");
        
        //selecting Checkbox
        checkbox.click();
        //Verify check box is selected or not
        if (checkbox.isSelected())
        {
        	System.out.println("Check box is checked");
        }
        else
        {
        	System.out.println("Check box is not checked");
        }
        
        		
		
	}

}
