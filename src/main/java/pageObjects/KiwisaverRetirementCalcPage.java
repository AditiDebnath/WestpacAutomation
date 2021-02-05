package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class KiwisaverRetirementCalcPage {

	
	public WebDriver driver;
	
    //WebElement ID for iframe
	By kiwisaverRetCalc=By.xpath("//div[@id='calculator-embed']//iframe");
	
	
	//WebElement IDs for icons on KiwiSaver Retirement Calculator Page
    By currAgeIcon=By.xpath("//div[@help-id='CurrentAge']//i[@class='icon']");
    By empStatusIcon=By.xpath("//div[@help-id='EmploymentStatus']//i[@class='icon']");
    By currKiwiSvrBalIcon=By.xpath("//div[@help-id='KiwiSaverBalance']//i[@class='icon']");
    By volContriIcon=By.cssSelector("div[help-id='VoluntaryContributions'] i[class='icon']");
    By riskProfIcon=By.cssSelector("div[help-id='RiskProfile'] i[class='icon']");
    By savGoalAtRetIcon= By.cssSelector("div[help-id='SavingsGoal'] i[class='icon']");
    
    
    //WebElement IDs for info of the icons on KiwiSaver Retirement Calculator Page
    By currAgeInfo=By.xpath("//p[contains(text(),'This calculator has an age limit of 18 to 64 years')]");
    By empStatusInfo=By.xpath("//p[contains(text(),'If you are earning a salary or wage, select ‘Emplo')]");
    By currKiwiSvrBalInfo=By.xpath("//p[contains(text(),'If you do not have a KiwiSaver account, then leave')]");
    By volContriInfo=By.xpath("//p[contains(text(),\"If you are 'Self-Employed' or 'Not employed', you \")]");
    By riskProfInfo=By.xpath("//p[contains(text(),'The risk profile affects your potential investment')]");
    By savGoalAtRetInfo= By.xpath("//p[contains(text(),'Enter the amount you would like to have saved when')]");
    
    //WebElement IDs for the fields and radio buttons on KiwiSaver Retirement Calculator Page
    By currentAge=By.xpath("//div[contains(@model,'ctrl.data.CurrentAge')]//input[contains(@type,'text')]");
    By empStatusDrpDwn=By.xpath("//div[contains(@class,'no-selection hover')]//div[contains(@class,'well-value ng-binding')]");
    By employed=By.xpath("//span[normalize-space()='Employed']");
    By selfEmployed=By.xpath("//span[normalize-space()='Self-employed']");
    By notEmployed=By.xpath("//span[normalize-space()='Not employed']");
    By currKiwiSvrBal=By.xpath("//div[contains(@model,'ctrl.data.KiwiSaverBalance')]//input[contains(@placeholder,'Optional')]");
    By volContri=By.xpath("//div[contains(@class,'control-with-period control-with-prefix currency-control')]//input[contains(@placeholder,'Optional')]");
    By frequencyDrpDwn=By.xpath("//span[@class='ng-binding ng-scope' and contains(text(), 'Frequency')]");
    By freqFortnightly=By.xpath("//span[normalize-space()='Fortnightly']");
    By freqAnnually=By.xpath("//span[normalize-space()='Annually']");
    By salary=By.xpath("//div[contains(@model,'ctrl.data.AnnualIncome')]//input[contains(@type,'text')]");
    By kiwiSvrMemCon=By.xpath("//input[@name='04G']");
    By defRskProf=By.xpath("//input[@name='014']");
    By consrvRskProf=By.cssSelector("#radio-option-016");
    By balancedRskProf=By.cssSelector("#radio-option-019");
    By savGoalAtRet=By.xpath("//div[contains(@model,'ctrl.data.SavingsGoal')]//input[contains(@placeholder,'Optional')]");
    
    By kiwiSvrProjBalButton= By.xpath("//span[normalize-space()='View your KiwiSaver retirement projections']");
    By kiwiSaverBalText= By.xpath("//span[contains(@class,'result-title ng-binding')]");
    By kiwiSvrProjBalValue= By.xpath("//span[contains(@class,'result-value result-currency ng-binding')]");
    
    
	
	public KiwisaverRetirementCalcPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public WebElement getkiwisvrRetCal()
	{
	
		return driver.findElement(kiwisaverRetCalc);
		
	}
	
	public WebElement getcurrAgeIcon()
	{
	
		return driver.findElement(currAgeIcon);
		
	}
	
	public WebElement getempStatusIcon()
	{
	
		return driver.findElement(empStatusIcon);
		
	}
	
	public WebElement getcurrKiwiSvrBalIcon()
	{
	
		return driver.findElement(currKiwiSvrBalIcon);
		
	}
	
	public WebElement getvolContriIcon()
	{
	
		return driver.findElement(volContriIcon);
		
	}
	
	public WebElement getriskProfIcon()
	{
	
		return driver.findElement(riskProfIcon);
		
	}
	
	public WebElement getsavGoalAtRetIcon()
	{
	
		return driver.findElement(savGoalAtRetIcon);
		
	}
	
	//For info of icons for fields on KiwiSaver Retirement Calculator Page
	public WebElement getcurrAgeInfo()
	{
	
		return driver.findElement(currAgeInfo);
		
	}
	public WebElement getempStatusInfo()
	{
	
		return driver.findElement(empStatusInfo);
		
	}
	public WebElement getcurrKiwiSvrBalInfo()
	{
	
		return driver.findElement(currKiwiSvrBalInfo);
		
	}
	public WebElement getvolContriInfo()
	{
	
		return driver.findElement(volContriInfo);
		
	}
	public WebElement getriskProfInfo()
	{
	
		return driver.findElement(riskProfInfo);
		
	}
	public WebElement getsavGoalAtRetInfo()
	{
	
		return driver.findElement(savGoalAtRetInfo);
		
	}

	
	//For fields and buttons in KiwiSaver Retirement Calculator Page
	public WebElement getcurrentAge()
	{
	
		return driver.findElement(currentAge);
		
	}
	
	public WebElement getempStatusDrpDwn()
	{
	
		return driver.findElement(empStatusDrpDwn);
		
	}
	
	public WebElement getemployed()
	{
	
		return driver.findElement(employed);
		
	}
	public WebElement getselfEmployed()
	{
	
		return driver.findElement(selfEmployed);
		
	}
	public WebElement getnotEmployed()
	{
	
		return driver.findElement(notEmployed);
		
	}
	public WebElement getcurrKiwiSvrBal()
	{
	
		return driver.findElement(currKiwiSvrBal);
		
	}
	public WebElement getvolContri()
	{
	
		return driver.findElement(volContri);
		
	}
	public WebElement getfrequencyDrpDwn()
	{
	
		return driver.findElement(frequencyDrpDwn);
		
	}
	public WebElement getfreqFortnightly()
	{
	
		return driver.findElement(freqFortnightly);
		
	}
	public WebElement getfreqAnnually()
	{
	
		return driver.findElement(freqAnnually);
		
	}
	
	public WebElement getsalary()
	{
	
		return driver.findElement(salary);
		
	}
	public WebElement getkiwiSvrMemCon()
	{
	
		return driver.findElement(kiwiSvrMemCon);
		
	}
	public WebElement getdefRskProf()
	{
	
		return driver.findElement(defRskProf);
		
	}
	public WebElement getconsrvRskProf()
	{
	
		return driver.findElement(consrvRskProf);
		
	}
	public WebElement getbalancedRskProf()
	{
	
		return driver.findElement(balancedRskProf);
		
	}
	public WebElement getsavGoalAtRet()
	{
	
		return driver.findElement(savGoalAtRet);
		
	}
	public WebElement getkiwiSvrProjBalButton()
	{
	
		return driver.findElement(kiwiSvrProjBalButton);
		
	}
	public WebElement getkiwiSaverBalText()
	{
	
		return driver.findElement(kiwiSaverBalText);
		
	}
	public WebElement getkiwiSvrProjBalValue()
	{
	
		return driver.findElement(kiwiSvrProjBalValue);
		
	}
	

	
}
