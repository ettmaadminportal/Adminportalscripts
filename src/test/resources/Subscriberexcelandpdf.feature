
Feature: Download Excel and pdf from subscriber tab

  @tag1
  Scenario: Download Excel and pdf from subscriber tab
    Given select subscriber button from admin list
    When  click on excel and pdf icon to download
    Then  select open to view the excel or pdf