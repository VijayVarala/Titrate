Feature: Edit role

  Scenario: Successfully edited roles details
    Given user launch the browser
     When user click on role icon button
    And click on edit icon button
    And user clears the existing role name and enter name as "QC"
    And user clears the existing description and enter desc as "New user"
    When user click on save button
    Then roles details should be edited

    
    
    