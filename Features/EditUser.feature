Feature: Edit user

  Scenario: Successfully edited user details
    Given user launch the browser
    And users click on user icon button
    And click on edit icon button
    And user clears the firstname name and enter the new name as "virat"
    And user clears the lastname and enter the new name as "kohli"
    And user clears the username name and enter the new name as "King"
    And user clears the phoneNo and enter the new number as "9876543210"
    And user clears the email and enter the new email as "virat@gmail.com"
    When user click on save button
    Then User details should be edited
