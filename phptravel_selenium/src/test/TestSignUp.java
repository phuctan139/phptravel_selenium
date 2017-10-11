package test;

import org.testng.annotations.Test;

import pages.PHPTravelHomePage;
import pages.PHPTravelSignupPage;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestSignUp {

	WebDriver driver;
	PHPTravelHomePage objHome;
	PHPTravelSignupPage objSignUp;
	
  @BeforeClass
  public void setup() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.phptravels.net/");
	  driver.manage().window().maximize();
	 
  }
  
  @Test(priority=0)
  public void test_Signup()
  {
	
	  objHome = new PHPTravelHomePage(driver);
	  objSignUp = new PHPTravelSignupPage(driver);
	  
	  objHome.clickSignup();
	  objSignUp.signupNewUser("Tan", "Nguyen", "0937555555", "tan@gmail.com", "01042011", "01042011");
	  
  }
  
  @AfterClass
  public void close()
  {
	  driver.close();
  }

}
