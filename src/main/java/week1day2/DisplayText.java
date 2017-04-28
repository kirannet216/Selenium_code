package week1day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DisplayText {
	
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
        chrome.get("http://leafground.com/pages/Edit.html");
        String i = chrome.findElementByName("username").getAttribute("value");
                
        
        System.out.println(i);
    
	}
}
