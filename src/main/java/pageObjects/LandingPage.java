package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {

	
	public WebDriver driver;
	
	//WebElement IDs on navigation bar in Westpac Home Page/ Landing Page 
	By kiwisvr=By.xpath("//a[@id='ubermenu-section-link-kiwisaver-ps']");
	By kiwisaverCalculators=By.xpath("//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']");
	

	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public WebElement getControlOnNavBar()
	{
		
		return driver.findElement(kiwisvr);
	}
	
	public WebElement getClickingOnKiwiCalc()
	{
		return driver.findElement(kiwisaverCalculators);
	}
}
