@Smoke @Regration @Unit
Feature: Login function test.
#Description: Credintial must be valid
#Background: Common Steps

@Posative @TC_01 

Scenario: testing login function with valid credential

#Test Steps: 
Given Open a brower
And Go to application URL
When Put valid user
And Put Valid password
And Click Login
Then If Logout Btn visible then test is pass 

