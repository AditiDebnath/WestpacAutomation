package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CalculatorsPage{

	
	public WebDriver driver;
	
	//WebElement IDs for KiwiSaver Calculators Page
	By clickHereToGetStarted=By.xpath("//a[normalize-space()='Click here to get started.']");
	By kiwiSvrRetCalcHeading= By.xpath("//h1[normalize-space()='KiwiSaver Retirement Calculator']");
	
	public CalculatorsPage(WebDriver driver) {

		this.driver=driver;
	}

    

	public WebElement getClickHereToStarted()
	{
	
		return driver.findElement(clickHereToGetStarted);
		
	}
	
	public WebElement getkiwiSvrRetCalcHeading()
	{
	
		return driver.findElement(kiwiSvrRetCalcHeading);
	}
	
}
