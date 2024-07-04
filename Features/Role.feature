Feature: Add Roles

  Scenario: Scenario: Successfully added new camera
    Given user launch the browser
    When user click on role icon button
    And click on add role button
    And user enters Role as "admin"
    And user enters Description as "New Role"
    When user click on save button
    Then new role should be added successfully

