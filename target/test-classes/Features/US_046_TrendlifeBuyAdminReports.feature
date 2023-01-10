
Feature: US_046 As an administrator, I want the Top Selling Item page to be able to see the list of the most sold products on the site.

  Background: Admin first goes to Trendlifebuy Admin Dashboard homepage window.
    Given Go to "myUrl" page.
    Then Enter a valid "Email" address and "Password" in the relevant fields on the page that opens, then click the SIGN IN button.
    Then Then a message about successful login should appear in a green box in the upper right corner of the screen.
    Then The Admin Reports Title should be clickable under the CONTENT title on the left side of the screen on the Dashboard page.
    Then Click on the link button titled Top Selling Item from the options listed under the Admin Reports Title.



  Scenario: TC_04601 It should be verified that the Top Selling Item list can be accessed from the Top Selling Item link.
    Then Then, it is checked that the Admin Reports page is opened and the Top Selling Item window visible on the screen.
    Then Then it is checked that the products are listed in the Top Selling Item window.



  Scenario: TC_04602 It should be verified that it can be searched in the Top Selling Item list from the Quick Search TextBox

    Then In the window that opens type "bag" in the Quick Search box and search.
    Then Check whether there are products in the search result and whether the products are listed according to the search result.


  @ja
  Scenario: TC_04603 It must be verified that the best selling products in the Top Selling Item list are listed under the headings Seller, Product, Total Sale , Average Rating
    Then It should be verified that the top selling products are listed under the headings Seller, Product, Total Sale, Average Rating on the page that opens.