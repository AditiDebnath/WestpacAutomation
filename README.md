# Westpac Automation Test Suite

This WebUI Test Automation Framework is created using the below technologies:

Java, Selenium Web Driver(selenium-java-3.141.59), TestNG test framework support , Maven project management , Extent Report, Log4j, Cucumber and Jenkins as CI/CD Integration (Jenkins ver.2.222.3)

It is based on page object model pattern. Where each page represents a page on the [http://www.westpac.co.nz/](http://www.westpac.co.nz/) related to User Story 1 and 2.

The framework has been created using two approaches:

1. POM with Maven, testng and then Jenkins Job created for that as CI/CD release pipeline execution
2. BDD/ Cucumber framework integrated with Maven and testng and then, pertaining Jenkins job has been created for CI/CD pipeline execution

## **Prerequisites / Tools**

- Java: JDK 1.8.0\_241 - Development and Runtime environment
- Maven - should be installed and configured in local machine
- Eclipse IDE or any other IDE
- Google Chrome v88.0.4324.104
- Microsoft Edge v89.x
- Mozilla Firefox v85.0
- OS: Windows 10
- Internet Explorer
- Cucumber
- TestNG should be configured in Eclipse IDE
- Git
- Selenium WebDriver with Java
- Jenkins configured in local machine and installed with TestNG plugin.

**Set Up**

1. Clone the code using Git commands on the target directory.
2. Import the project as existing Maven project in Eclipse or any Java IDE.
3. The tests/test suite can be executed using any IDE like Eclipse or from Jenkins

**Folder Structure and Pattern Details**

1. **WestpacAutomation\src\test\java\features** : This folder contains the feature files named &quot;KiwiSaverRetirementPageIcons.feature&quot; and &quot;KiwiSaverRetirementProjectedBalance.feature&quot; that have the test scenarios for Test User Story 1 and Test User Story 2 in Gherkin language format.
2. **WestpacAutomation\src\test\java\stepDefinitions** : This folder contains the step definition file named &quot;KiwiSaverRetirementCalculator&quot;that has all the test steps from the Gherkin matched to underlying page object functionality.
3. **WestpacAutomation\src\test\java\cucumberOptions** : This folder has TestRunner file runner file which can be used to Run as TestNG Test from Eclipse IDE as well as Run as TestNG Suite from Eclipse IDE after right clicking on testngCucumber.xml file.
4. **WestpacAutomation\src\test\java\westpac** : This folder has listeners.java file which calls the getScreenshot method from base file in WestpacAutomation\src\main\java\resources folder on failure of any test case execution.

The folder also has the java files named &quot;ValidatingKiwiSaverRetirementCalcPage&quot; (Test case for Test User Story 1) and &quot;ValidatingKiwiSaverProjectedBal&quot; (Test case for Test User Story 2)

1. **WestpacAutomation\src\main\java\pageObjects** : It contains &quot;LandingPage&quot;,&quot;CalculatorsPage&quot; and &quot;KiwisaverRetirementCalcPage&quot; java files that contains locators for different elements on the three different pages and methods used to test different functionality on the page.
2. **WestpacAutomation\src\main\java\resources** : This folder contains drivers folder which has all the executable drivers for different browsers namely Chrome, Firefox, IE and Microsoft edge.

It also has &quot;base&quot; java file which helps in Browser driver selection as mentioned in &quot;data.properties&quot; file as browser. URL is also mentioned here in &quot;data.properties&quot; file

It also consists of &quot;ExtentReporterNG&quot; java file which contains classes related with extent reporting.

**Test Suite Execution**

Test Suite can be executed by any of the below ways:

1. testng.xml - This will run all the test sequentially and browser will close on every test complete. If using Eclipse IDE, right click on testng.xml and click on Run as TestNG Suite
2. testngCucumber.xml - This will run the Cucumber/BDD framework executing the test cases covering both the Test User Story1 or Test User Story2(here named as KiwiSaverRetirementPageIcons.feature and KiwiSaverRetirementProjectedBalance.feature files). Test execution is sequential. Browser will close after each test execution. If using Eclipse IDE, right click on testngCucumber.xml and click on Run as TestNG Suite
3. The Test Suite can also be executed using windows command prompt and then navigating to the project directory. Then use the command &quot; **mvn test**  &quot; (which uses pom.xml). Here, pom.xml is defaulted to testngCucumber.xml. It can be changed to testng.xml as per preference of framework to be used. If using Eclipse IDE, you can also right click on pom.xml and click on Run as Maven test.
4. Create a Jenkins job, configure it providing the path for the code repository on the local machine and add build step as &quot;Invoke top-level Maven targets&quot; with Goals as &quot;test&quot; (which runs &quot;mvn test&quot;) and publish TestNG Results by default as testng-results.xml file.

**Test Reports**

1. ExtentReportsTestNG html report can be seen from WestpacAutomation\test-output folder , it even shows the pie-chart view of test execution results
2. index html report can be seen from WestpacAutomation\test-output folder
3. testng-results xml report can be seen from WestpacAutomation\test-output folder
4. Test Result can also be visualized from Jenkins job as TestNG Results
5. Test result is also seen from Console on Eclipse IDE if tests are executed after clicking on pom.xml or testng.xml or testngCucumber.xml or from command prompt of local Windows machine or console output of Jenkins job.
6. Log4j reports are seen in WestpacAutomation\logs folder like prints.txt and prints-2021-02-05.txt etc with the date of test execution.

**Screenshots**

If any test execution fails then screenshots will be seen in WestpacAutomation\screenshots folder

**Test Execution Videos**

Test execution using testng.xml and testngCucumber.xml and mvn test in command prompt: [https://aditi\_debnath.tinytake.com/tt/NTA3NjE2NF8xNTk0NDY4MA](https://aditi_debnath.tinytake.com/tt/NTA3NjE2NF8xNTk0NDY4MA)

Test execution using Jenkins job: [https://aditi\_debnath.tinytake.com/tt/NTA3NjE4Nl8xNTk0NDcxOA](https://aditi_debnath.tinytake.com/tt/NTA3NjE4Nl8xNTk0NDcxOA)

Test Results: [https://aditi\_debnath.tinytake.com/tt/NTA3NjIwM18xNTk0NDc4MA](https://aditi_debnath.tinytake.com/tt/NTA3NjIwM18xNTk0NDc4MA)
