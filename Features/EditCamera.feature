Feature: Edit camera

  Scenario: Successfully edited camera details
    Given user launch the browser
    And users Click on camera icon button
    And click on edit icon button
    And user clears the existing camera name and enter name as "East"
    When user click on save button
    Then Camera details should be edited
