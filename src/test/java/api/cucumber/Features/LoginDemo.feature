Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples:
      | username | password |
      | Shweta   | 12345    |
      | Varsha   | 12345    |
      | Ruhi     | 12345    |