@AddToChart
Feature: Add To Chart Item
  As a user i want to Check out item from website sauce demo

  Scenario: Normal Login
    Given User open website saucedemo
    When user input "standard_user" as userName and input "secret_sauce" as password

  Scenario: Normal Add To Chart Item
    Given User open website saucedemo
    When user input "standard_user" as userName and input "secret_sauce" as password
    And user sort filter "Name (Z to A)"
    And User pick item Sauce Labs Backpack
    And User click the chart icon