package StepDefinitions;

import Pages.TrendlifebuyPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;


public class TrendlifebuyStepDefinition {

    TrendlifebuyPage trendlifebuyPage = new TrendlifebuyPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();


    @Given("Go to {string} page.")
    public void go_to_page(String myUrl) {

        // Launch browser.
        // Go to Url https://trendlifebuy.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

    }

    @Given("Enter a valid {string} address and {string} in the relevant fields on the page that opens, then click the SIGN IN button.")
    public void enter_a_valid_address_and_in_the_relevant_fields_on_the_page_that_opens_then_click_the_sign_in_button(String Email, String Password) {
        // Login is done by entering a valid Administrator Email and Password, then click the Sign in.

        trendlifebuyPage.myLoginMethod();

    }

    @Then("Then a message about successful login should appear in a green box in the upper right corner of the screen.")
    public void after_pressing_the_sign_in_button_a_message_about_successful_login_should_appear_in_a_green_box_in_the_upper_right_corner_of_the_screen() {

        assertTrue("The Welcome Message does not appear on the screen", trendlifebuyPage.welcomeMessage.isDisplayed());

    }

    @Then("The Products Title should be clickable under the PRODUCT MANAGE title on the left side of the screen on the Dashboard page.")
    public void the_products_title_should_be_clickable_under_the_product_manage_title_on_the_left_side_of_the_screen_on_the_dashboard_page() {

        trendlifebuyPage.productsTitle.click();
    }

    @Then("Click on the link button titled Product Lists from the options listed under the Products Title.")
    public void then_it_is_verified_that_the_link_button_titled_product_lists_is_accessible_from_the_options_listed_under_the_products_title() {

        actions.scrollToElement(trendlifebuyPage.productListLinkBut).perform();
        actions.click(trendlifebuyPage.productListLinkBut).perform();
        ReusableMethods.waitForPageToLoad(2);

    }

    @Then("Then, it is checked that the Products page is opened and the Product List window visible on the screen.")
    public void then_it_is_checked_that_the_products_page_is_opened_and_the_product_list_window_visible_on_the_screen() {

        String actualUrl= "https://trendlifebuy.com/admin-dashboard";
        String expectedUrl= Driver.getDriver().getCurrentUrl();
        assertNotEquals(expectedUrl,actualUrl);

        ReusableMethods.waitForVisibility(trendlifebuyPage.productListWindow,2);
        assertTrue("The Product List window does not visible on the screen", trendlifebuyPage.productListWindow.isDisplayed());

    }


}
