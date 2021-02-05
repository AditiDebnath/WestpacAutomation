package westpac;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.KiwisaverRetirementCalcPage;
import pageObjects.CalculatorsPage;
import pageObjects.LandingPage;
import resources.base;

public class ValidatingKiwiSaverProjectedBal extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		//Initializing driver 
		driver =initializeDriver();
		
		
	}
	
	 
	@Test(dataProvider="getDataEmpl")
	
	public void KiwiSaverProjBalPage(String age, String employmentStatus, String salary, String kiwiSavMemContribution, String riskProfile)
	{
		//Loading Westpac Home Page or Landing Page
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LandingPage l= new LandingPage(driver);
		
		//Using the Navigation Bar on the home/landing page of Westpac
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
		
		//Validating KiwiSaver Retirement Projected Balance 
		KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    driver.switchTo().frame(k.getkiwisvrRetCal());
	    
	    k.getcurrentAge().sendKeys(age);
	    k.getempStatusDrpDwn().click();
	    WebElement employmntStat= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+employmentStatus+"')]"));
	    employmntStat.click();
	    k.getsalary().sendKeys(salary);
	    WebElement kiwiSvrMemContri= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+kiwiSavMemContribution+"')]"));
	    kiwiSvrMemContri.click();
	    WebElement riskProf= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+riskProfile+"')]"));
	    riskProf.click();
	    k.getkiwiSvrProjBalButton().click();
	    String kiwisvrtxt=k.getkiwiSaverBalText().getText();
	    Assert.assertEquals(kiwisvrtxt, "At age 65, your KiwiSaver balance is estimated to be:");
	    String estvalue=k.getkiwiSvrProjBalValue().getText();
		String s=estvalue.toString();
		System.out.println(kiwisvrtxt+s); 
		log.info("KiwiSaver Projected Balance at Retirement is displayed");
	    
	    
	  
}
	
	@Test(dataProvider="getData")
	public void ValidateKiwiSaverProjBalPage(String age, String employmentStatus, String currentKiwiSvrBal,String voluntaryContri, String frequency, String riskProfile, String savingsGoalRetirement )
	{
		//Loading Westpac Home Page or Landing Page
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		LandingPage l= new LandingPage(driver);
		
		//Using the Navigation Bar on the home/landing page of Westpac
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
		
		//Validating KiwiSaver Retirement Projected Balance 
		KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    driver.switchTo().frame(k.getkiwisvrRetCal());
	    
	    k.getcurrentAge().sendKeys(age);
	    k.getempStatusDrpDwn().click();
	    WebElement employmntStat= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+employmentStatus+"')]"));
	    employmntStat.click();
	    k.getcurrKiwiSvrBal().sendKeys(currentKiwiSvrBal);
	    k.getvolContri().sendKeys(voluntaryContri);
	    k.getfrequencyDrpDwn().click();
	    WebElement freq= driver.findElement(By.xpath("//span[@class='ng-binding ng-scope' and contains(text(), '"+frequency+"')]"));
	    freq.click();
	    WebElement riskProf= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+riskProfile+"')]"));
	    riskProf.click();
	    k.getsavGoalAtRet().sendKeys(savingsGoalRetirement);
	    k.getkiwiSvrProjBalButton().click();
	    String kiwisvrtxt=k.getkiwiSaverBalText().getText();
	    Assert.assertEquals(kiwisvrtxt, "At age 65, your KiwiSaver balance is estimated to be:");
	    String estvalue=k.getkiwiSvrProjBalValue().getText();
		String s=estvalue.toString();
		System.out.println(kiwisvrtxt+s); 
		log.info("KiwiSaver Projected Balance at Retirement is displayed");
		
		
	}
	@AfterTest
	public void teardown()
	{
		//Closing Browser
		driver.close();
		driver=null;
	}

	//Specifics of user
	@DataProvider
	public Object[][] getDataEmpl()
	{
		Object[][] dataEmpl=new Object[1][5];
		dataEmpl[0][0]="30";
		dataEmpl[0][1]="Employed";
		dataEmpl[0][2]="82000";
		dataEmpl[0][3]="4%";
		dataEmpl[0][4]="Defensive";
		
		return dataEmpl;
		
		}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][7];
		data[0][0]="45";
		data[0][1]="Self-employed";
		data[0][2]="100000";
		data[0][3]="90";
		data[0][4]="Fortnightly";
		data[0][5]="Conservative";
		data[0][6]="290000";
		
		data[1][0]="55";
		data[1][1]="Not employed";
		data[1][2]="140000";
		data[1][3]="10";
		data[1][4]="Annually";
		data[1][5]="Balanced";
		data[1][6]="200000";
		
	    return data;
		
		}
		
	}

