Feature: Test Case2

Scenario: To verify address of hotel contains entered city name
Given User open the chrome browser
When User open URL "https://www.marriott.com/default.mi"
And Enters "Dubai" in Destination field
When User clicks FindHotels 
Then User should verify entered city name present in address of first hotel or not