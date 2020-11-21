
Feature: Search subscribers based on the search filters
  

  @tag1
  Scenario: Search subscribers based on the search filters
    Given select subscriber tab from admin portal
    And select search filter
    When Search by subscriber id
    And search by subscriber name
    Then search by subscriber start date and end date


