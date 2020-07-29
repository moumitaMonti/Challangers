Feature: User login
Scenario: user login on ebay


Given I am on ebay homepage
When I click on sign in button
And I entered my username and password
And I click on continue button
Then I login to the ebay page