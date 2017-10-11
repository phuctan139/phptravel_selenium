package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTravelHomePage {
	WebDriver driver;
	By btn_signnup = By.xpath("//*[@id='li_myaccount']/ul/li[2]/a");
	
	
	//Constructor
	public PHPTravelHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Click on Signup button
	
	public void clickSignup()
	{
		WebElement element = driver.findElement(btn_signnup);
		//WebElement element = driver.findElement(By.xpath("//*[@id='li_myaccount']/ul/li[2]/a"));	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	
}
