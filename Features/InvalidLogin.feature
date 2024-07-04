Feature: Invalid Login

  Scenario: 
    Login should not be success

    #Given User navigate to the Titrate
    #And User enter the usersname as "Manohar"
    #And User enter password as "Mitti@1"
    #When User click on the login
    #Then Login should not be success
    Given User navigate to the Titrate application
    And user enter the username as "Manohar"
    And user enter the password as "Mitti@13"
    When user click on the login
    Then Login should not be success
