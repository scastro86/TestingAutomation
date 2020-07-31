#Author: Susel Castro Castro
Feature: Test functionallity Login

  @smoke
  Scenario: Login from button ingresar with valid credentials
    Given browser is open
    And user is on Webstore homepage
    When user clicks on button ingresar
    And enters username and password
    And clicks on button ingresar
    Then user is logged on webstore homepage
