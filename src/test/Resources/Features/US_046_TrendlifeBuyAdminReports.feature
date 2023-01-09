Feature: US_046 As an administrator, I want the Top Selling Item page to be able to see the list of the most sold products on the site.

  Background: Admin first goes to Trendlifebuy Admin Dashboard homepage.
    Given Go to "myUrl" page.
    Then Enter a valid "Email" address and "Password" in the relevant fields on the page that opens, then click the SIGN IN button.
    Then Then a message about successful login should appear in a green box in the upper right corner of the screen.
    Then The Admin Reports Title should be clickable under the CONTENT title on the left side of the screen on the Dashboard page.
    Then Click on the link button titled Top Selling Item from the options listed under the Admin Reports Title.


  @ja
  Scenario: TC_04601 It should be verified that the Top Selling Item list can be accessed from the Top Selling Item link.
    Then Then, it is checked that the Admin Reports page is opened and the Top Selling Item window visible on the screen.
    Then Then it is checked that the products are listed in the Best Selling Products window.