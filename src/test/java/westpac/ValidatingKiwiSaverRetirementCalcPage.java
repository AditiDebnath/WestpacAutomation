package westpac;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.KiwisaverRetirementCalcPage;
import pageObjects.CalculatorsPage;
import pageObjects.LandingPage;
import resources.base;

public class ValidatingKiwiSaverRetirementCalcPage extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		//Initializing driver 
		driver =initializeDriver();
		
		
	}
	
	
	@Test
	
	public void ValidationCurrConversionPage()
	{
		//Loading Westpac Home Page or Landing Page
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		//Code for using the Navigation Bar on the home/landing page of Westpac
		LandingPage l= new LandingPage(driver);
		WebElement navigatekiwisvr= l.getControlOnNavBar();
		navigatekiwisvr.click();
		
		//Clicking on KiwiSaver calculators
		WebElement clickOnKiwiCalc= l.getClickingOnKiwiCalc();
		clickOnKiwiCalc.click();
		log.info("Successfully clicked on KiwiSaver Calculators");
		
		//Navigating to KiwiSaver Retirement Calculator Page
		CalculatorsPage c= new CalculatorsPage(driver);
		c.getClickHereToStarted().click();
		log.info("Click here to get started");
		
		//Checking icons and info for all the fields on KiwiSaver Retirement Calculator Page
		KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    driver.switchTo().frame(k.getkiwisvrRetCal());
	    
		
	    k.getcurrAgeIcon().isDisplayed();
		log.info("Information icon is present for Current Age field");
		k.getcurrAgeIcon().click();
		Assert.assertEquals(k.getcurrAgeInfo().getText(),"This calculator has an age limit of 18 to 64 years old.");
		log.info("Info is displayed on clicking on Current age icon");
		
		k.getempStatusIcon().isDisplayed();
		log.info("Information icon is present for Employment status field");
		k.getempStatusIcon().click();
		Assert.assertEquals(k.getempStatusInfo().getText(),"If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.");
		log.info("Info is displayed on clicking on Employment status icon");
		
		k.getcurrKiwiSvrBalIcon().isDisplayed();
		log.info("Information icon is present for Current KiwiSaver balance field");
		k.getcurrKiwiSvrBalIcon().click();
		Assert.assertEquals(k.getcurrKiwiSvrBalInfo().getText(),"If you do not have a KiwiSaver account, then leave this field blank.");
		log.info("Info is displayed on clicking on Current KiwiSaver balance icon");
		
		k.getvolContriIcon().isDisplayed();
		log.info("Information icon is present for Voluntary contributions field");
		k.getvolContriIcon().click();
		Assert.assertEquals(k.getvolContriInfo().getText(),"If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.");
		log.info("Info is displayed on clicking on Voluntary contributions icon");
		
		k.getriskProfIcon().isDisplayed();
		log.info("Information icon is present for Risk profile field");
		k.getriskProfIcon().click();
		Assert.assertEquals(k.getriskProfInfo().getText(),"The risk profile affects your potential investment returns:");
		log.info("Info is displayed on clicking on Risk profile icon");
		
		k.getsavGoalAtRetIcon().isDisplayed();
		log.info("Information icon is present for Savings goal at retirement field");
		k.getsavGoalAtRetIcon().click();
		Assert.assertEquals(k.getsavGoalAtRetInfo().getText(),"Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner");
		log.info("Info is displayed on clicking on Savings goal at retirement icon");
		System.out.println("Proper message is displayed after clicking on Current Age icon");
	
}
	
	@AfterTest
	public void teardown()
	{
		//Closing browser
		driver.close();
		driver=null;
	}

	
		
}

