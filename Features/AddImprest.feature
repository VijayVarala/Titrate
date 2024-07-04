Feature: Add imprest

  Scenario: Successfully added imprest
    Given user launch the browser
    And users click on imprest icon button
    And click on add imprest button
    And user enters the name as "impresteast"
    And enters description as "imprestcare"
    And user enters the phoneNo1 as "9876543210"
    And user enters the extension1 as "9765"
    And user enters the phoneNo2 as "9876549823"
    And user enters the extension2 as "976534"
    And enters Serial number as "Q2HV-96VV-VN8NN"
    When user click on save button
    Then imprest should be added
