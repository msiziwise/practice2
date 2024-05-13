@Regression
Feature: Login

  Scenario Outline: Verify user is successfully logged in
    Given User is on the login page
    And User enter username <username>
    And User enter password <password>
    When User clicks the login button
    Then landing page is displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
#      |locked_out_user        |secret_sauce|
#      |problem_user           |secret_sauce|
#      |performance_glitch_user|secret_sauce|