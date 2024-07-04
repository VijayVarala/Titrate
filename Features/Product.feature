Feature: Add Product

  Scenario: Successfully add a new product with all required details
    Given user launch the browser
    When user click on product icon
    And user click on add product
    And user enters ProductName as "Dolo"
    And user enters Strength as "50mg"
    And user enters Label Code as "1386DJ76F5"
    And user selects Pack UOM from dropdown
    And selects Measure from dropdown
    And selects Product Form from dropdown
    And selects Brand from dropdown
    And selects Generic from dropdown
    And enters Pack Size as "5"
    When user click on save button
    Then product should be added
 