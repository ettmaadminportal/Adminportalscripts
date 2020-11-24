
Feature: Validate disable subscription for subscribers subscription

  Scenario: Validate disable subscription for subscribers subscription
    Given select subscriber tab from admin portal
    And Select subscriber view edit and navigate to subscriptions tab
    When Select package and select enable/disable subscription option
    Then Verify disable button check box is selected and comments added
