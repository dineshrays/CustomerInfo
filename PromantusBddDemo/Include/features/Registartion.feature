#-------------------------------------------------------------------------------------------------------------
# Author : Saravana Sabareesh V                                                               Reviewer    : Kamal
# Date   : 18-01-2019                                                              						Reviewed On : 18-01-2019
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :
#---------------------------------------------------------------------------------------------------------------------
@FunctionalTest @tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: To register a user
    Given User is in Register Page
    When User enters the First Name
    And User enters the NameID
    And User enters the Email
    And User enters the UserName
    And User enters the Password
    And User enters the Confirm Password
    Then User clicks on Register button
    And User clicks on click here to login
