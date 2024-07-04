Feature: Assign Camera

  Scenario: Successfully assign camera
    Given user launch the browser
    And users click on imprest icon button
    And users click on assigncam button
    And users click on checkbox
    When users click on assign button
    Then camera should be assigned
