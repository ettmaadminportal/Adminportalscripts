Feature: Create new subscriber in admin portal

  @tag1
  Scenario: create new subscriber
    Given select subscriber and click on the create new subscriber
    When Enter the subscriber details and click next
    And select create subscription
    And Enter snaps packages subscription and contracts
    # 	When select packages and click next
    #	  And verify subscription tab and enter subscription details then click next button
    When verify subscriber user screen launched and enter subscriber details then click the add user button
    #  When verify Finalize tab and browse file by clicking browse for file
    #  Then select customer paid button and click the finalize button
    Then verify all updated and click on next button to finish
