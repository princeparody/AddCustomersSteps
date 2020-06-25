#Author: your.email@your.domain.com
Feature: Add Customers
  Creating new account

  Scenario: Hardcoded
    Given Launches telecom application
    And Navigate into add customer page
    When Closing the pop-up displayed
    And Entering all the fields
    And Clicking submit button
    Then Generated customer id is diaplayed
   

  
