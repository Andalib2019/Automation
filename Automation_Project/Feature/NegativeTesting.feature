Feature: User can able to login with valid username & passsword

Description: "User login to zoopla website and verify login"
@regression
Scenario Outline: User login with valid username and verify page title
Given User can open any browser
And User is able to enter "https://www.zoopla.co.uk/" url
When User clicks on the Login in button
And User enters email "<username>" and password "<password>"
And User clicks on Sign in button
Then User is able to verify successful login and verify page title

Examples:
|username             |password|
|aneearyan@yahoo.com |12345678    |
|aneearyan           |1234    |
|aneearyan@yahoo.com |12345   |
|anee_laila@yahoo.com |12346   |
|aneearyan@yahoo.com |12347   |

