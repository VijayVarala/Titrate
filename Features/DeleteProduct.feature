Feature: Delete product

  Scenario: Successfully deleted product
    Given user launch the browser
    When user click on product icon
    And click on delete icon button
    Then product should be deleted
