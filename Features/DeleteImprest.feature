Feature: Delete imprest

  Scenario: Successfully deleted imprest
    Given user launch the browser
    And users click on imprest icon button
    And click on delete icon button
    Then imprest should be deleted
