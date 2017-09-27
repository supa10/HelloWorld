Feature: Login Into OHRM website

Scenario: Orange HRMS login and logout 
Given I login to Orange HRMS
When I verify homePage
Then I close browser