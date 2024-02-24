Feature: Regression Test Suite

  @regression
  Scenario: Display upcoming bikes details for Honda 
    Given user is on the zig wheels website
    When the user filters upcoming bikes for Honda with price less than four lakhs
    Then the system should display the bike name, price, and expected launch date for each result

  @regression
  Scenario: Verify filtering options for used cars in Chennai
    Given user is on the Zigwheels website
    When user explore filtering options for used cars in chennai
    Then validate all popular models

  @regression
  Scenario: Getting the car information by selecting popular model filter
    Given the user navigates to the used cars tab
    When user select the checkbox of popular models in filter section
    Then user gets the car information of respective clicked checkbox