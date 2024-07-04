Feature: Add user

  Scenario: Successfully added new user
    Given user launch the browser
    And users click on user icon button
    And click on add user button
    And user enters the firstname name as "Mike"
    And user enters the last name as "Hussey"
    And user enters the username as "miky"
    And user enters the phoneNo as "9876543210"
    And user enters the email as "mike@gmai.com"
    When user click on save button
    Then User should be added
