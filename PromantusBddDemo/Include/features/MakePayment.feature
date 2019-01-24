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

  # Scenario-1
  @SmokeTest
  Scenario Outline: To make a payment with valid Payment details
    Given User is in BDD Demo Login Page <Url>
    And User enters username in BDD Demo <UserName>
    And user enters password  in BDD Demo <Password>
    And user clicks on Login button
    And user is redirected to paybill page
    And user enters dayofpayment
    And user enters amount
    # And user enters SwiftCode
    When user clicks on make payment
    And user is redirected to otp page
    And user enters the otp
    And user clicks on submit otp
    Then user should see the payment successful page

    Examples: 
      | Url                                       | UserName  | Password |
      | http://promantusbdddemo.azurewebsites.net | Promantus | bdd      |
     #| http://promantusbdddemo1.azurewebsites.net | Promantus | bdd      |
