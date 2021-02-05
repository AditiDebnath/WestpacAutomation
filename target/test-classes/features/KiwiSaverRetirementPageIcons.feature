Feature: KiwiSaver Retirement Calculator fields information icon
  As a Product Owner
  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
  So that the user is able to get a clear understanding of what needs to be entered in the field

  Scenario: Verify Current Age KiwiSaver Retirement Calculator fields information icon
  Given Initialize the browser
  And Navigate to "https://www.westpac.co.nz/" website
  And Navigate to 'KiwiSaver Retirement Calculator' page
  When User clicks information icon besides 'Current age'
  Then Relevant message is displayed below the 'Current age' field
  And Close browser
