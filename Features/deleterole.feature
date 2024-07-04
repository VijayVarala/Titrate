Feature: Delete role

  Scenario: Successfully deleted roles
    Given user launch the browser
    When user click on role icon button
    And click on delete icon button
    Then roles should be deleted
