Feature: KiwiSaver projected balance with KiwiSaver Retirement Calculator
  As a Product Owner
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
  So that the users are able to plan their investments better

 Scenario Outline: Employed user project balance
 Given Initialize the browser
 And Navigate to "https://www.westpac.co.nz/" website
 And Navigate to 'KiwiSaver Retirement Calculator' page
 And user whose current age is '<age>'
 And has employment status '<employmentStatus>'
 And has a Salary of '<salary>' per annum
 When contributes to KiwiSaver @'<kiwiSavMemContribution>'
 When chooses a '<riskProfile>' risk profile
 Then can calculate his KiwiSaver Retirement Projected Balance
 And Close browser

 Examples:
 | age | employmentStatus   | salary | kiwiSavMemContribution | riskProfile   |
 | 30  | Employed           | 82000  | 4%                     | Defensive     |

 Scenario Outline: <employmentStatus> User KiwiSaver Retirement Projected Balance
 Given Initialize the browser
 And Navigate to "https://www.westpac.co.nz/" website
 And Navigate to 'KiwiSaver Retirement Calculator' page
 And user whose current age is '<age>'
 And has employment status '<employmentStatus>'
 And current KiwiSaver balance is '<currentKiwiSvrBal>'
 When user contributes '<voluntaryContri>' at '<frequency>'
 When chooses a '<riskProfile>' risk profile
 And has saving goals requirement of '<savingsGoalRetirement>'
 Then can calculate his KiwiSaver Retirement Projected Balance
 And Close browser

Examples:
| age | employmentStatus | currentKiwiSvrBal | voluntaryContri | frequency   | riskProfile   | savingsGoalRetirement  |
| 45  | Self-employed    | 100000            | 90              | Fortnightly | Conservative  | 290000                 |
| 55  | Not employed     | 140000            | 10              | Annually    | Balanced      | 200000                 |