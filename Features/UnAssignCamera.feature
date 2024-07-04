Feature: UnAssign Camera

  Scenario: Successfully unassign camera
    Given user launch the browser
    And users click on imprest icon button
    And users click on assigncam button
    And users click on uncheckbox
    When users click on assign button
    Then camera should be un assigned
