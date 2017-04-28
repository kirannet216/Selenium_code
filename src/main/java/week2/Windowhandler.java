package week2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //initialiazing webdriver
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		//ClassName obj = new ClassName
		ChromeDriver chrome = new ChromeDriver();
        // Loading Url
		chrome.get("https://www.irctc.co.in/");
		//Click on Contact US
		chrome.findElementByLinkText("Contact Us").click();
		
		//Set the WindowHandler 
		Set<String> windowhandle = chrome.getWindowHandles();
		//Printing the no of windows opened 
		System.out.println(windowhandle.size());
		//for ecah to identify and handle the windows
		for (String eachhandle : windowhandle) {
			
			//Switch to window 
			chrome.switchTo().window(eachhandle);
			//Printing window unique id 
			System.out.println(eachhandle);
			//Printing the Selenium curser is in which window 
			System.out.println(chrome.getCurrentUrl());
			//Printing the title of the window
			System.out.println(chrome.getTitle());
			System.out.println("-----------------------");
			/*chrome.switchTo().window(eachhandle);
			System.out.println(eachhandle);
			System.out.println(chrome.getCurrentUrl());
			System.out.println(chrome.getTitle());*/
			
			//chrome.close();
			//break;
			
		}
		//Close the driver
		chrome.quit();
		
		

	}

}
