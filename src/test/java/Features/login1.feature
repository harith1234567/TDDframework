

Feature: Validate Login Feature for FB Application


  
  Scenario: validate login with valid credentials
  
    Given user is on login page
    When user enters"validusername" username
    And user enters "correctpassword"password
    And users clicks on login button
    Then I validate the outcomes user should be logged in successfully
    

  Scenario: validate login with invalid credentials
  
    Given user is on login page
    When user enters "invalidusername" username
    And user enters "wrongpassword"invalid password
    And users clicks on login button
    Then I validate the outcomes user should not be logged in successfully
    
  