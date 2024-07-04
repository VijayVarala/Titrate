Feature: Add camera

  Scenario: Successfully added new camera
    Given user launch the browser
    And users Click on camera icon button
    And click on add camera button
    And user enters the camera name as "South"
    And enters serial number as "123566"
    And user selects the model from dropdown
    And user enters the url as "camera.com"
    When user click on save button
    Then Camera should be added
