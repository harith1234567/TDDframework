Feature: validate Login  Feature with multiple credentials

  Scenario Outline: Login feature for multiple creds
    Given user is on login page
    When user enters<username> and <password>
    And users clicks on login button
    Then I validate the outcomes user should be logged in successfully

    Examples: 
      | username |  | password    |
      | hari     |  | hari123     |
      | namdhini |  | nandhini123 |
      | haritha  |  | haritha123  |
