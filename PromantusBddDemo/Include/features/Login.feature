#-------------------------------------------------------------------------------------------------------------
# Author : Saravana Sabareesh V                                                               Reviewer    : Kamal
# Date   : 18-01-2019                                                              						Reviewed On : 18-01-2019
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Description
# CR #1 :
#---------------------------------------------------------------------------------------------------------------------
@FunctionalTest
Feature: Title of your feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: To login a valid user credentials
    Given User is in BDD Demo Login Page <Url>
    When User enters username in BDD Demo <UserName>
    And user enters password  in BDD Demo <Password>
    And user clicks on Login button
    ## Then Validate the username and password
    ## And user should be logged in
    Then user should be able to login successfully

    Examples: 
      | Url                                                      | UserName  | Password |
      | http://promantusbdddemo.azurewebsites.net/Account/Login | Promantus | bdd      |
      
      
  @RegressionTest
  Scenario Outline: To login a invalid user credentials
    Given User is in BDD Demo Login Page <Url>
    When User enters username in BDD Demo <UserName>
    And user enters password  in BDD Demo <Password>
    And user clicks on Login button
    ## Then Validate the username and password
    ## And user should be logged in
    Then user should not be able to login successfully <Error>

    Examples: 
      | Url                                                      | UserName  | Password | Error                         |
      | http://promantusbdddemo.azurewebsites.net/Account/Login |           | bdd      | Username is required.         |
      | http://promantusbdddemo.azurewebsites.net/Account/Login | Promantus |          | Password is required.         |
      | http://promantusbdddemo.azurewebsites.net/Account/Login | Promant   | bdd      | Username or Pawword is wrong. |
