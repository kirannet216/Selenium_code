package ide;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDEEXPORTCASE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","/TestLeaf/selenium/Selenium/drivers/chromedriver.exe");	  
    driver = new ChromeDriver();
    
    /*System.setProperty("webdriver.gecko.driver"+ "","/TestLeaf/selenium/Selenium/drivers/geckodriver_32bit.exe");	  
    driver = new FirefoxDriver();*/
        
    
    baseUrl = "http://testleaf.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIDEEXPORTCASE() throws Exception {
    driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("kirannet216@gmail.com");
    driver.findElement(By.xpath("//input[@value='Append ']")).clear();
    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("kiran");
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("");
    String MyEmail = driver.findElement(By.id("email")).getAttribute("value");
    System.out.println(MyEmail);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
