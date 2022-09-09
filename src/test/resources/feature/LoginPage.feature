Feature: Login page feature


Scenario: Login with correct credentials
Given user is on login page
When user enter username "sharanu318@gmail.com"
And user enter password "#Sharanu48"
And click on login button
Then user get the title of the home page
And page title should be "Sell or Rent Home Online at Magicbricks"