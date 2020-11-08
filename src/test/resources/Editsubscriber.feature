@tag
Feature: Edit subscriber from admin portal

  @tag1
  Scenario: Edit subscriber from admin portal
    Given select subscriber tab from admin portal
    And Filter the subscriber and select view/edit subscriber
    When Do changes in subscribers details and click on next
    And User can select create subscription
    And User Enter snaps packages subscription and contracts
    And User can verify user screen launched and enter new user details if need to user
    Then click finish to complete edit subscriber
