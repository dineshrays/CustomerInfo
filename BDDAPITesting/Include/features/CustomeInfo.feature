#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verify the Customer Info and add the new Customer Details

  Scenario Outline: Verify the CustomerDetails based on Id
    Given Enter customer Id as "2"
    When  Click on the request button
    Then  I get response code "200"
    And Verify the customer information as below    
    |name   |issuer   |zipcode   | cardno|
    |<name> |<issuer> |<zipcode> | <cardno>|
    
    Examples:
      | name   | issuer | zipcode |cardno|
      | Dinesh | Amex   |   95014 |[4578-9856-1455-7845]|
      
   
   
   Scenario Outline: Add new CustomerDetails
   Given Adding the new customer info
   When Click on the create button
   Then Verify whether the new data is inserted
   |name   |issuer   |zipcode   |
    |<name> |<issuer> |<zipcode> |
    
    Examples:
      | name   | issuer | zipcode |
      | Sabareesh10 | BOA   |   95031 |


Scenario Outline: Add new CardDetails
   Given Adding the new card info for the customer
   When Click on the add card button
   Then Verify whether the new card data is inserted
   |name   |issuer   |zipcode   |cardno|
    |<name> |<issuer> |<zipcode> |<cardno>|
    
    Examples:
      | name   | issuer | zipcode |cardno|
      | Sabareesh10 | BOA   |   95031 |  [1234-9856-2486-7890]|
   
  
  
      
 
   
   
