Feature: user registration
Scenario Outline: user registration on ebay

Given I am on ebay website
When I click on register option
And I enter my "<first name>" "<lastname>" "<email>" and "<password>"
And I clicked on create account
Then I see the welcome message

Examples: 
|first name|last name|email|password|
|moumita|roy|mroy@gmail.com|12345|