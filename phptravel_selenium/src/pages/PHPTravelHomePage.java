package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTravelHomePage {
	WebDriver driver;
	By btn_signnup = By.xpath("//*[@id='li_myaccount']/ul/li[2]/a");
	By label_listcurrency = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[2]/a/strong");
	By label_listlanguage = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/ul/li/a");
	By label_currency = By.xpath("/html/body/div[3]/div/div/div[2]/ul/ul/li[2]/ul/li[4]/a");// EUR
	By label_language = By.xpath("//*[@id='tr']");//TURKISH
	
	//Constructor
	public PHPTravelHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getCurrency()
	{
		return driver.findElement(label_listcurrency).getText();
	}
	
	public String getLanguage()
	{
		return driver.findElement(label_listlanguage).getText();
	}
	//Click on Signup button
	
	public void clickSignup()
	{
		WebElement element = driver.findElement(btn_signnup);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void changeCurrency()
	{
		WebElement element = driver.findElement(label_listcurrency);
		WebElement element1 = driver.findElement(label_currency);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].click();", element1);
		
	}
	
	public void changeLanguage()
	{
		WebElement element = driver.findElement(label_listlanguage);
		WebElement element1 = driver.findElement(label_language);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].click();", element1);
	}
	
	
	
}
