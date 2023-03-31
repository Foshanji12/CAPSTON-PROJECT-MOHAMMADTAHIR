Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Arslan12@gmail.com' and password 'Tafoo100@'
    And User click on login button
    And User should be logged in into Account

  #1
  @UpdateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'ArslanJoo' and Phone '2091990192'
    And User click on Update button
    Then user profile information should be updated

  #2
  @UpdatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword   | confirmPassword |
      | Tafoo100@        | Arslan2929@@@ | Arslan2929@@@   |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  #3
  @AddaPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567860087225 | tahir      |              10 |           2023 |          234 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  #4
  @EditDebit
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234544911174012 | tafo       |              10 |           2023 |          145 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  #5
  @RemoveDebit
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  #6
  @AddAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber   | streetAddress | apt | city      | state | zipCode |
      | Afghanistan | tommy    | 4231323242300 | noplace       | dop | overplASE | Farah |   41444 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  #7
  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below informations
      | country     | fullName | phoneNumber   | streetAddress | apt | city | state | zipCode |
      | Afghanistan | Tahir    | 3231320232999 | tttttg        | fff | abc  | Farah |   55555 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  #8
  @RemoveAdress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
