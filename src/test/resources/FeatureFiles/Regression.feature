Feature: Regression Test Suite

  @Regression
  Scenario: Navigating to upcoming bikes details for Honda
       Given user is on the zig wheels website
       When the user filters upcoming bikes for Honda
       Then user should be navigated to Upcoming Honda Bike Tab


  @Regression
  Scenario: Getting the upcoming honda bikes information
       Given User navigates to the Upcoming honda bikes tab
       When User clicks on the read more option
       And user stores the information of all upcoming Honda bikes
       Then User should be redirected to the Home page


  @Regression
  Scenario Outline: Navigating to the Used Cars in that location
       Given User navigates to the zigwheels website
       When User clicks on the "<location name>" button in Used Cars tab
       Then User should be navigated to the Used Cars with that "<location name>"
    
       Examples: 
         | location name |
         | Delhi         |
         | Hyderabad     |
         | Mumbai        |
         | Bangalore     |
         | Jaipur        |
         | Chennai       |
         | Kolkata       |
         | Pune          |
         | Ahmedabad     |

@Regression
  Scenario: Verifying Search Functionality
    Given user is on the Zigwheels homepage
    When user search for Honda bikes
    Then user should see relevant search results for Honda bikes
    
 @Regression
  Scenario: Getting the car information by selecting popular model filter
    Given the user navigates to the used cars tab
    When user select the checkbox of popular models in filter section
    Then user gets the car information of respective clicked checkbox 
 