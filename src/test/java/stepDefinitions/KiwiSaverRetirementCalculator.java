package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pageObjects.KiwisaverRetirementCalcPage;
import pageObjects.CalculatorsPage;
import pageObjects.LandingPage;
import resources.base;

public class KiwiSaverRetirementCalculator extends base {

	 @Given("^Initialize the browser$")
	    public void initialize_the_browser() throws Throwable {
		driver =initializeDriver();	
    }
	 
	 @And("^Navigate to \"([^\"]*)\" website$")
	    public void navigate_to_something_website(String strArg1) throws Throwable {
			driver.get(strArg1);
	    	driver.manage().window().maximize();
	    }

	@And("^Navigate to 'KiwiSaver Retirement Calculator' page$")
    public void navigate_to_kiwisaver_retirement_calculator_page() throws Throwable {
		LandingPage l= new LandingPage(driver);
		WebElement navigatekiwisvr= l.getControlOnNavBar();
		navigatekiwisvr.click();
		
		WebElement clickOnKiwiCalc= l.getClickingOnKiwiCalc();
		clickOnKiwiCalc.click();
		
		
		CalculatorsPage c= new CalculatorsPage(driver);
		c.getClickHereToStarted().click();
		
		
		
		
    }
	 
	@When("^User clicks information icon besides 'Current age'$")
    public void user_clicks_information_icon_besides_current_age() throws Throwable {
		KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    driver.switchTo().frame(k.getkiwisvrRetCal());
		k.getcurrAgeIcon().isDisplayed();
		k.getcurrAgeIcon().click();
		
		
	}
    
	@Then("^Relevant message is displayed below the 'Current age' field$")
    public void relevant_message_is_displayed_below_the_current_age_field() throws Throwable {
		 
		KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    Assert.assertEquals(k.getcurrAgeInfo().getText(),"This calculator has an age limit of 18 to 64 years old.");
		System.out.println("Proper message is displayed after clicking on Current Age icon");
	}	
		
		
        
		
	@And("^Close browser$")
    public void close_browser() throws Throwable {
   	 driver.quit(); 
     }
	
	
	 @And("^user whose current age is '(.+)'$")
	    public void user_whose_current_age_is_(String age) throws Throwable {
		 KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
		    driver.switchTo().frame(k.getkiwisvrRetCal());
		    k.getcurrentAge().sendKeys(age);   
	    }

	    @And("^has employment status '(.+)'$")
	    public void has_employment_status_(String employmentStatus) throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getempStatusDrpDwn().click();
		    WebElement employmntStat= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+employmentStatus+"')]"));
		    employmntStat.click();
	    	
	    }

	    @And("^has a Salary of '(.+)' per annum$")
	    public void has_a_salary_of_per_annum(String salary) throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getsalary().sendKeys(salary);
	    }
	    
	    
	    @When("^contributes to KiwiSaver @'(.+)'$")
	    public void contributes_to_kiwisaver_(String kiwiSavMemContribution) throws Throwable {
	    	
	    	WebElement kiwiSvrMemContri= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+kiwiSavMemContribution+"')]"));
		    kiwiSvrMemContri.click();
	    }

	    @When("^chooses a '(.+)' risk profile$")
	    public void chooses_a_risk_profile(String riskProfile) throws Throwable {
	    	WebElement riskProf= driver.findElement(By.xpath("//span[@class='ng-scope' and contains(text(), '"+riskProfile+"')]"));
		    riskProf.click();
	    	
	    }
	    
	    @Then("^can calculate his KiwiSaver Retirement Projected Balance$")
	    public void can_calculate_his_kiwisaver_retirement_projected_balance() throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getkiwiSvrProjBalButton().click();
		    String kiwisvrtxt=k.getkiwiSaverBalText().getText();
		    Assert.assertEquals(kiwisvrtxt, "At age 65, your KiwiSaver balance is estimated to be:");
		    String estvalue=k.getkiwiSvrProjBalValue().getText();
			String s=estvalue.toString();
			System.out.println(kiwisvrtxt+s); 
			
	    }
	    
	    @And("^current KiwiSaver balance is '(.+)'$")
	    public void current_kiwisaver_balance_is_(String currentKiwiSvrBal) throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getcurrKiwiSvrBal().sendKeys(currentKiwiSvrBal);
	    	
	    }
	    
	    @When("^user contributes '(.+)' at '(.+)'$")
	    public void user_contributes_at_(String voluntaryContri, String frequency) throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getvolContri().sendKeys(voluntaryContri);
		    k.getfrequencyDrpDwn().click();
		    WebElement freq= driver.findElement(By.xpath("//span[@class='ng-binding ng-scope' and contains(text(), '"+frequency+"')]"));
		    freq.click();
	    }
	    
	    @And("^has saving goals requirement of '(.+)'$")
	    public void has_saving_goals_requirement_of_(String savingsGoalRetirement) throws Throwable {
	    	KiwisaverRetirementCalcPage k= new KiwisaverRetirementCalcPage(driver);
	    	k.getsavGoalAtRet().sendKeys(savingsGoalRetirement);
	    }
	    
	    
	}
