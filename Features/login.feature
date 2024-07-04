Feature: Titrate Application

  Scenario: 
    Login should be success

    Given User navigate to the Titrate application
    And User enter the username as "manohar"
    And User enter the password as "Mitti@123"
    When User click on the login button
    Then Login should be success