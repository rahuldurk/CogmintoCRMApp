Feature: Test CogmintoCRM Appliction

  Scenario: validate loginpage functionality
    Given user is on loginPage
    When user enter username and password
    Then user click on loginButton
