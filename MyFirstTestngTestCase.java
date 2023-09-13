package scripts;
//main method is not present in Test ng 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MyFirstTestngTestCase {

	WebDriver driver;
//Methods which are having @Test annotation is your test Case

	@Test
	public void loginToNicheThyself() throws InterruptedException {

		driver.get("https://nichethyself.com/tourism/home.html");

		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		
		
          System.out.println(user.getAttribute("value"));
		


		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345");
		Thread.sleep(5000);
		user.submit();

		String expectedTitleAfterLogin = "My account";
		String actualTitleAfterLogin;

		actualTitleAfterLogin = driver.getTitle();

//			if (expectedTitleAfterLogin.equals(actualTitleAfterLogin)) {
//				System.out.println("Test Case passed");
//			} 
//			else {
//				System.out.println("Test Case Failed!!!");                   
//			}

		assertEquals(actualTitleAfterLogin, expectedTitleAfterLogin); // it is method of testNG to verify the test case
		//3rd parameter is a message which will be displayed on Failure 
	}

	@Test
	public void googlesearch() {
		System.out.println("I am inside to google search Test case");
	}

	@Test
	public void testNG() {
		System.out.println("I am inside TestNG Test case");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am inside after Method");
		
	}

	@BeforeClass
	public void beforeClass() {

	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am inside Before Class");
		System.out.println("I am inside Before Method");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
