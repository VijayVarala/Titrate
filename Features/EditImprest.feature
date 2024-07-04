Feature: Edit imprest

  Scenario: Successfully edited imprest
    Given user launch the browser
    And users click on imprest icon button
    And click on edit icon button
    And user clears the name and enter the new name as "imprest-west"
    And user clears the description and enter the new description as "impresttt"
    And user clears the phoneNo1 and enter new number as "9876543211"
    And user clears the extension1 and enter new extension as "8765"
    And user clears the phoneNo2 and enter new number as "9876544323"
    And user clears the extension2 and enter extension "9876"
    And user clears Serial number and enters new serialno as "Q2HV-96VV-VN8NN"
    When user click on save button
    Then imprest details should be edited
