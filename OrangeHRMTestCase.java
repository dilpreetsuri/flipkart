package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrangeHRMTestCase {
	WebDriver driver;
	WebDriverWait wait; 
  @Test
  public void OrangeHRMTest() throws InterruptedException {

//	  Thread.sleep(4000);
	  wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
  
	String expectedTitleAfterLogin = "OrangeHRM";
	String actualTitleAfterLogin;

	actualTitleAfterLogin = driver.getTitle();  
	  
	assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin); 
	assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin, "login failed!");
    
	
	// 3rd parameter is a message which will be displayed on failure
	    
  }  
  
  @BeforeMethod
  public void beforeMethod() {
	System.out.println("I am in Before method");
//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();

	
	 wait = new WebDriverWait(driver, Duration.ofSeconds(7));
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  
  
  
  
  
  
  
  
  
  
  
}
