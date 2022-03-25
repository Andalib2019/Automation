Feature: User can able to login with valid username & passsword

Description: "User login to zoopla website and verify login"
@smoke
Scenario: User login with valid username and verify page title
Given User can open any browser
And User is able to enter "https://www.zoopla.co.uk/" url
When User clicks on the Login in button
And User enters email "aneearyan@yahoo.com" and password "12345678"
And User clicks on Sign in button
Then User is able to verify successful login and verify page title