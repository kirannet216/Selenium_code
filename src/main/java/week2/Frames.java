package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.ListUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		//ClassName obj = New ClassName 
		ChromeDriver chrome = new ChromeDriver();
		
		//Implicit wait
		chrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximise window
		chrome.manage().window().maximize();
		
		//Loading URL
		chrome.get("http://layout.jquery-dev.com/demos/iframes_many.html");

		int size = chrome.findElements(By.tagName("iframe")).size();
		System.out.println(size);
				
		 
		 for (int i =0;i< size ;i++)
		 {
			 chrome.switchTo().frame(i);
			 int count =0;
			 count = chrome.findElements(By.tagName("iframe")).size();
				
				chrome.switchTo().defaultContent();
				System.out.println("inner frame" +i +"total is "+ count );

		 }

	}

}
