Feature: Zig Wheels

  Scenario: Display upcoming bikes details for Honda with price less than four Lakhs
    Given user is on the zig wheels site
    When user hover on New bikes
    And click on upcoming bikes
    And filter upcoming bikes for Honda
    Then display the bike name, price, and expected launch date for each result with price less than four Lakhs

  Scenario: Displaying popular models for used  cars in chennai
    Given user is on the zigwheels website
    When user hovers over used cars
    And click on chennai
    Then display all the popular models in a list

  Scenario: Account Validation with invalid Username
    Given the user is on the  zig wheels page
    When user clicks on Signin/Register button
    And login with invalid email account details
    Then display the error message for invalid username
    And Navigating back to homepage

  