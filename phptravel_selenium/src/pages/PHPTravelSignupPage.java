package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class PHPTravelSignupPage {

	WebDriver driver;
	
	By txt_fName = By.xpath("//*[@id='headersignupform']/div[3]/input");
	By txt_lName= By.xpath("//*[@id='headersignupform']/div[4]/input");
	By txt_mobile= By.xpath("//*[@id='headersignupform']/div[5]/input");
	By txt_email= By.xpath("//*[@id='headersignupform']/div[6]/input");
	By txt_password= By.xpath("//*[@id='headersignupform']/div[7]/input");
	By txt_confirmPassword= By.xpath("//*[@id='headersignupform']/div[8]/input");
	By btn_signupbutton= By.xpath("//*[@id='headersignupform']/div[9]/button");
	
	
	public PHPTravelSignupPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setFirstName(String text)
	{
		driver.findElement(txt_fName).sendKeys(text);
	}
	
	public void setLastName(String text)
	{
		driver.findElement(txt_lName).sendKeys(text);
	}
	
	public void setMobile(String text)
	{
		driver.findElement(txt_mobile).sendKeys(text);
	}
	
	public void setEmail(String text)
	{
		driver.findElement(txt_email).sendKeys(text);
	}
	
	public void setPassword(String text)
	{
		driver.findElement(txt_password).sendKeys(text);
	}
	
	public void setConfirmPassword(String text)
	{
		driver.findElement(txt_confirmPassword).sendKeys(text);
	}
	
	public void clickSignUp()
	{
		WebElement element = driver.findElement(btn_signupbutton);
		  JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);
	}
	
	public void signupNewUser(String fname,String lname,String mobile,String email,String password,String confirmPassword)
	{
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setMobile(mobile);
		this.setEmail(email);
		this.setPassword(password);
		this.setConfirmPassword(confirmPassword);
		this.clickSignUp();
	}
	
	
	
}
