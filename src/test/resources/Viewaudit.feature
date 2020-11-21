
Feature: Validate view audit functionality

  @tag1
  Scenario: Validate view audit functionality
    Given select subscriber tab from admin portal
    When 	Filter the subscriber and select view audit from actions
    Then 	Verify the audit log from audit trail

