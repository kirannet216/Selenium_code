package week1day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing webdriver
		System.setProperty("webdriver.chrome.driver", "/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");
		                                               
            int i=0;
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
		
		WebElement dd= chrome.findElementById("userRegistrationForm:countries");
		Select Dropdown=new Select(dd);
		List<WebElement> allOptions=Dropdown.getOptions();
		
		allOptions.size();
		System.out.println(allOptions.size());
		for(WebElement country:allOptions)
		{
			//System.out.println(country.getText());
			if (country.getText().startsWith("E"))
			{
				i++;
				if (i==2)
				{
					 country.click();
						System.out.println();
						break;	
				}
				
			}
			
		}
		
		
	}

}
