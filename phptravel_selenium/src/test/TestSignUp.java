package test;

import org.testng.annotations.Test;

import pages.PHPTravelAccount;
import pages.PHPTravelHomePage;
import pages.PHPTravelSignupPage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
	PHPTravelAccount objAccount;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void test_Signup() throws InterruptedException {

		objHome = new PHPTravelHomePage(driver);
		objSignUp = new PHPTravelSignupPage(driver);
		objAccount = new PHPTravelAccount(driver);

		objHome.clickSignup();
		objSignUp.signupNewUser("Tan", "Nguyen", "0937555555", "tan10@gmail.com", "01042011", "01042011");
		Thread.sleep(3000);
		Assert.assertTrue(objAccount.getIdLabel().toLowerCase().contains("hi, tan nguyen"));
		objAccount.clickHomepage();
		//driver.close();
	}
	
	@Test(priority = 1)
	public void  change_Currency()
	{
		objHome = new PHPTravelHomePage(driver);
		objHome.changeCurrency();
		Assert.assertTrue(objHome.getCurrency().toLowerCase().contains("eur"));
	}
	
	@Test(priority = 1,enabled = false)
	public void change_Language()
	{
		objHome = new PHPTravelHomePage(driver);
		objHome.changeLanguage();
		Assert.assertTrue(objHome.getLanguage().toLowerCase().contains("turkish"));
	}
	
	
}
