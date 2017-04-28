package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class GenericWrappers implements Wrappers{

	RemoteWebDriver driver;
           int i=1;

	public void invokeApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			System.out.println("The browser:" + browser + " launched successfully");
			
		}
		catch (NoSuchElementException exception) {
			System.err.println();
			throw new RuntimeException("Unable to open the browser");
		}catch (WebDriverException exception){			
			
		}finally{
			takeSnap();
		}

	}
	public void compare(String data, String data1){
		try {
			if (data == data1) {
				System.out.println("The given " + data + " and " + data1 + "matched successfully");
			} else {
				System.out.println("The given " + data + " and " + data1 + "not matched ");
			} 
		}catch (NoSuchElementException exception) {
				System.err.println();
				throw new RuntimeException("Unable to open the browser");
			}catch (WebDriverException exception){			
				
			}finally{
				takeSnap();
			}		
	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + idValue);

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ idValue);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ idValue);
		}finally{
			takeSnap();
		}		
	}


	public void enterByName(String nameValue, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + nameValue);

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ nameValue);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ nameValue);
		}finally{
			takeSnap();
		}
		
		
	}


	public void enterByXpath(String xpathValue, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The data: " + data + " entered successfully in field :" + xpathValue);

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpathValue);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpathValue);
		}finally{
			takeSnap();
		}	

	}


	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			driver.getTitle().contains(title);
			System.out.println("The data: " + title + " get successfully in field");

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ title);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ title);
		}finally{
			takeSnap();
		}
	}


	public void verifyTextById(String id, String text) {
		try {
			// TODO Auto-generated method stub
			String verifyTextById = driver.findElementById(id).getText();
			if (verifyTextById.equals(text)) {
				System.out.println(
						"The " + text + " locator text value is " + verifyTextById + " is matched with " + text);

			} else {
				System.out.println(
						"The " + text + " locator text value is " + verifyTextById + " is not matched with " + text);

			} 
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ id);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ id);
		}finally{
			takeSnap();
		}
			
		
	}


	public void verifyTextByXpath(String xpath, String text) {
		try {
			// TODO Auto-generated method stub
			String verifyXpathText = driver.findElementByXPath(xpath).getText();
			if (verifyXpathText.equals(text)) {
				System.out.println(
						"The " + xpath + " locator text value is " + verifyXpathText + " is matched with " + text);

			} else {
				System.out.println(
						"The " + xpath + " locator text value is " + verifyXpathText + " is not matched with " + text);

			} 
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpath);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpath);
		}finally{
			takeSnap();
		}
		
	}


	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			// TODO Auto-generated method stub
			String verifyTextContains = driver.findElementByXPath(xpath).getText();
			if (verifyTextContains.contains(text)) {
				System.out.println("The " + xpath + " locator value is " + verifyTextContains + " is contains " + text);

			} else {
				System.out.println(
						"The " + xpath + " locator value is " + verifyTextContains + " is not contains " + text);

			} 
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpath);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpath);
		}finally{
			takeSnap();
		}
        
		
		
		
	}


	public void clickById(String id) {
		try {
			// TODO Auto-generated method stub		
			driver.findElementById(id).click();
			System.out.println("The element with id: " + id + " is clicked.");

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ id);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ id);
		}finally{
			takeSnap();
		}		
	}


	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with class Name: " + classVal + " is clicked.");

		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ classVal);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ classVal);
		}finally{
			takeSnap();
		}
	}


	public void clickByName(String name) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByName(name).click();
			System.out.println("The element with  Name: " + name + " is clicked.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ name);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ name);
		}finally{
			takeSnap();
		}

	}
	
	public void clickByTagname(String tagname) {
		try {
			// TODO Auto-generated method stub		
			driver.findElementByTagName(tagname).click();
			System.out.println("The element with id: " + tagname + " is clicked.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ tagname);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ tagname);
		}finally{
			takeSnap();
		}
		
	}
	public int findelementsByTagNamesize(String name) {
		try {
			// TODO Auto-generated method stub
			int i = driver.findElements(By.tagName(name)).size();
			System.out.println("The element with  TagName size is :" + i);
			
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ name);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ name);
		}finally{
			takeSnap();
		}
		return i;
	}
	
	

	public void clickByLink(String name) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByLinkText(name).click();
			System.out.println("The element with LnikText: " + name + " is clicked.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ name);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ name);
		}finally{
			//takeSnap();
		}

	}


	public void clickByLinkNoSnap(String name) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByLinkText(name).click();
			System.out.println("The element with LnikText: " + name + " is clicked..with out snap");
		}catch (NoSuchElementException exception) {
			System.err.println("Unable to take Snap "+ name);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Unable to take snap"+ name);
		}finally{
			//takeSnap();
		}

	}
	


	public void clickByXpath(String xpathVal) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath: " + xpathVal + " is clicked.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpathVal);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpathVal);
		}finally{
			takeSnap();
		}		
		

	}


	public void clickByXpathNoSnap(String xpathVal) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath: " + xpathVal + " is clicked.with out snap");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpathVal);
			throw new RuntimeException("");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpathVal);
		}finally{
			takeSnap();
		}
	}


	public String getTextById(String idVal) {
		try {
			// TODO Auto-generated method stub
			//String s = driver.findElementsById(idVal).
			String getTextById = driver.findElementById(idVal).getText();
			System.out.println(getTextById);
			System.out.println("The element text is " + getTextById);	
		
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ idVal);
			throw new RuntimeException("Unable to get the element");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ idVal);
		}finally{
			takeSnap();
		}
		return idVal;
		
		
		
	}


	public String getTextByXpath(String xpathVal) {			
		// TODO Auto-generated method stub
		try {
			String getTextByXpath= driver.findElementByXPath(xpathVal).getText();				
			System.out.println(getTextByXpath);
			System.out.println("The element text is "+getTextByXpath);		
			//return null;
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ xpathVal);
			throw new RuntimeException("Unable to get the element");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ xpathVal);
		}finally{
			takeSnap();
		}
		return xpathVal;
	}


	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
       
		//Initialize webelement dropdown
		try {
			WebElement dropdown = driver.findElementById(id);
			//Creating Class
			Select Dd = new Select(dropdown);
			//Clicking the dropdown
			driver.findElementById(id).click();
			//Selecting the visible text 
			Dd.selectByVisibleText(value);
		
			System.out.println("The element using Visible text, Visible  "+value+" is Selected from dropdown.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ id);
			throw new RuntimeException("Unable to get the element");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ id);
		}finally{
			takeSnap();
		}

	}


	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		//Initialize webelement dropdown
		try {
			WebElement dropdown = driver.findElementById(id);
			//Creating Class
			Select Dd = new Select(dropdown);
			//Clicking the dropdown
			driver.findElementById(id).click();
			//Selecting the visible text 
			Dd.selectByIndex(value);
			
			System.out.println("The element using Index  "+value+" is Selected from dropdown.");
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found"+ id);
			throw new RuntimeException("Unable to get the element");
		}catch (WebDriverException exception){
			System.err.println("Element is not found"+ id);
		}finally{
			takeSnap();
		}

	}


	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		//Get handle of parent window

		 try {
			Set<String> allwindow = driver.getWindowHandles();
			 //For each for all handles
			 for (String eachwindow : allwindow) {			
				 
				  driver.switchTo().window(eachwindow);
				  System.out.println("The Current URL is "+driver.getCurrentUrl());
				  break;
				}
			 System.out.println("The element is switched to Parent window");
		    }catch (NoSuchElementException exception) {
				System.err.println("Element is not found");
				throw new RuntimeException("Unable to get the element");
		    }catch (NoSuchWindowException exception) {
				System.err.println("Window is not found");
				throw new RuntimeException("Unable to get the element");
			}catch (WebDriverException exception){
				System.err.println("Element is not found");
			}finally{
			//	takeSnap();
			}
		 
		}
		 
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
	
			
			//Get all the window handles
			 try {
				Set<String> allwindow = driver.getWindowHandles();
				//For each for all handles
				 for (String eachwindow : allwindow) {		
					 	
					 driver.switchTo().window(eachwindow);
					
					//Getting the Current URL
					System.out.println(driver.getCurrentUrl());
					System.out.println("The element is switched to Child window");
					//takeSnap();
					
					 }
			    }catch (NoSuchElementException exception) {
					System.err.println("Element is not found");
					throw new RuntimeException("Unable to get the element");
			    }catch (NoSuchWindowException exception) {
					System.err.println("Window is not found");
					throw new RuntimeException("Unable to get the element");
				}catch (WebDriverException exception){
					System.err.println("Element is not found");
				}finally{
				//	takeSnap();
				}
			 
		}
	public int getSizeofMultipleWindow() throws InterruptedException {
		
		try {
			Set<String> allwindow = driver.getWindowHandles();
			    //For each for all handles	
			System.out.println("The Size of all windows"+ allwindow.size());		
			
		}catch (NoSuchElementException exception) {
			System.err.println("Element is not found");
			throw new RuntimeException("Unable to get the element");
		}catch (WebDriverException exception){
			System.err.println("Element is not found");
		}finally{
			takeSnap();
		}
		return i;		

			 
	}
	public void closeExceptParent() throws InterruptedException {
		
		Set<String> allwindow = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parentwindow"+parentWindow);
        for (String eachwindow : allwindow) {
	 		      if(parentWindow.equals(eachwindow))
			      {
			    	  driver.switchTo().window(eachwindow);
		              //Size of all windows 
			    	  System.out.println("The Size of all windows"+ allwindow.size());
			    	  //Getting the Current URL
					  System.out.println("The Opened Parent  URL is "+ driver.getCurrentUrl());				  
			      }
			      else
			      {
			    	  driver.switchTo().window(eachwindow);
				      System.out.println("The Closed Child window are "+driver.getCurrentUrl());
				      driver.close();

			      }
			 }
      
	}
	public void getTitle() throws InterruptedException {
		
		driver.getTitle();
	      System.out.println("The title of the window is  "+driver.getTitle());
	}
	
     public void switchToFrame(int id)  {
		  
    	 try {
			driver.switchTo().frame(id);		
			 System.out.println("The Frame switched to   "+ id);
    	 }catch (NoSuchWindowException exception) {
				System.err.println("Window is not found"+ id);
				throw new RuntimeException("Unable to get the element");
    	 }catch (NoSuchElementException exception) {
				System.err.println("Window is not found"+ id);
				throw new RuntimeException("Unable to get the element");
    	 }catch (WebDriverException exception) {
				System.err.println("Window is not found"+ id);
				throw new RuntimeException("Unable to get the element");
    	 }
	      
	}
     public void switchToFrame(String value)  {
 		  try {
			driver.switchTo().frame(value); 		
			  System.out.println("The Frame switched to   "+ value);
 		 }catch (NoSuchWindowException exception) {
				System.err.println("Window is not found"+ value);
				throw new RuntimeException("Unable to get the element");
	 	 }catch (NoSuchElementException exception) {
					System.err.println("Window is not found"+ value);
					throw new RuntimeException("Unable to get the element");
	 	 }catch (WebDriverException exception) {
					System.err.println("Window is not found"+ value);
					throw new RuntimeException("Unable to get the element");
	 	 }
 	}
     public void switchToDefault()  {
  		  try {
			driver.switchTo().defaultContent();  		
			  System.out.println("The Frame switched to parent window");
  		}catch (NoSuchWindowException exception) {
			System.err.println("Window is not found");
			throw new RuntimeException("Unable to get the element");
		 }catch (NoSuchElementException exception) {
				System.err.println("Window is not found");
				throw new RuntimeException("Unable to get the element");
		 }catch (WebDriverException exception) {
				System.err.println("Window is not found");
				throw new RuntimeException("Unable to get the element");
		 }
  	    }
	
public void closeExcept() throws InterruptedException {
		
		Set<String> allwindow = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parentwindow"+parentWindow);
        for (String eachwindow : allwindow) {
	 		      if(parentWindow.equals(eachwindow))
			      {
			    	  driver.switchTo().window(eachwindow);
		              //Size of all windows 
			    	  System.out.println("The Size of all windows"+ allwindow.size());
			    	  //Getting the Current URL
					  System.out.println("The Opened Parent  URL is "+ driver.getCurrentUrl());				  
			      }
			      else
			      {
			    	  driver.switchTo().window(eachwindow);
				      System.out.println("The Closed Child window are "+driver.getCurrentUrl());
				      driver.close();

			      }
			 }
      
	}
	

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//takeSnap();
		System.out.println("The alert is accepted");
		
	}


	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		//takeSnap();
		System.out.println("The alert is dismissed");

	}


	public String getAlertText() {
		// TODO Auto-generated method stub
		String Getalert = driver.switchTo().alert().getText();
		takeSnap();
		System.out.println("The alert text is "+Getalert);
		return null;
		
		
	}


	public void takeSnap() {
		// TODO Auto-generated method stub
		File src =driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/snap"+i+".jpeg");
		System.out.println("The snapshot is recorded");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}i++;

	}


	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");
		takeSnap();
	}


	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();		
		takeSnap();
		System.out.println("All browsers are closed");

	}
	

}
