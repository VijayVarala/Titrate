Feature: Edit product

  Scenario: Successfully edited product
    Given user launch the browser
    When user click on product icon
    And click on edit icon button
    And user clears the product name and enters ProductName as "Dolo"
    And user clears the strength and enters Strength as "50mg"
    And user clears the label code and enters Label Code as "1386DJ76F5"
    And user edited Pack UOM from dropdown
    And user edited Measure from dropdown
    And user edited Product Form from dropdown
    And user edited Brand from dropdown
    And user edited Generic from dropdown
    And clears the pack size and enters Pack Size as "5"
    When user click on save button
    Then product details should be edited