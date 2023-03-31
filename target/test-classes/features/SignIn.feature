Feature: Retail SignIn feature

  @smokTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Tahirjo1@gmail.com' and password 'Taherjoo12@'
    And User click on login button
    Then User should be logged in into Account

  @SelveTest
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                | password      | confirmPassword |
      | Tahirjoo | 'Tahirjo1@gmail.com' | 'Taherjoo12@' | 'Taherjoo12@'   |
    And User click on SignUp button
    Then User should be logged into account page
