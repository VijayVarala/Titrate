Feature: Imprest Product

  Scenario: Successfully add an Imprest product
    Given user launch the browser
    And user clicks imprest product icon
    And user clicks add imprest product button
    And user selects Imprest Name from dropdown
    And user enters Minimum Stock as "5"
    And user enters Maximum Stock as "10"
    And user enters Available Stock as "9"
    When user click on save button
    Then imprest product should be added
  #Scenario: Successfully Edit the ImprestProduct Details added
    #Given the user is on the Edit ImprestProduct page
    #When the user edits the required field and change maximum stock as "20" and click on Add button
    #Then imprest product should get updated
#
  #Scenario: Successfully Delete the added ImprestProduct
    #Given the user is on the Imprest Products page
    #Then click the Delete icon of the Imprest Product that is to be deleted
