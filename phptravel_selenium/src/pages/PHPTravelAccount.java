package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PHPTravelAccount {
	WebDriver driver;
	
	By label_id = By.xpath("//*[@id='body-section']/div/div[1]/div/div[1]/h3");
	By link_travel = By.xpath("/html/body/div[3]/div/div/div[1]/a/img");
	public PHPTravelAccount(WebDriver driver)
	{
		this.driver= driver;
	}
	public String getIdLabel()
	{
		WebElement e = driver.findElement(label_id);
		return e.getText();
	}
	
	public void clickHomepage()
	{
		WebElement element = driver.findElement(link_travel);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
