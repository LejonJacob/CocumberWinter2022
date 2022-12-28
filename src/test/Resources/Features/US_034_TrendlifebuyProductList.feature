
@hej
Feature: US_034 As an administrator, I want the Product List page to be able to access the product lists on the site.

  Background: Admin first goes to Trendlifebuy Admin Dashboard homepage.
    Given Go to "myUrl" page.
    Then Enter a valid "Email" address and "Password" in the relevant fields on the page that opens, then click the SIGN IN button.
    Then Then a message about successful login should appear in a green box in the upper right corner of the screen.
    Then The Products Title should be clickable under the PRODUCT MANAGE title on the left side of the screen on the Dashboard page.
    Then Click on the link button titled Product Lists from the options listed under the Products Title.

  Scenario: TC_3401 Verify that the Product List page is accessible from the Products menu.
    Then Then, it is checked that the Products page is opened and the Product List window visible on the screen.