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

Feature: Login

  @tag1
  Scenario: Successful Login with valid credential
    Given open the browser
    When user is on google search page
    When user enters a text in the search box
    And Click on Google search button
    And Select one url
    Then enter usaername and password
    Then Select the search bar and search mobiles
    Then Click on search
    Then select mobile 
    Then click on buy now
    Then click on Delivery here
    Then click on continue
    Then click on Accept&continue
    Then click on cash on delivery button
    
    
  