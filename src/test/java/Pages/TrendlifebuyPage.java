package Pages;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendlifebuyPage {

    public TrendlifebuyPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='text']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@class='label_name f_w_400 ']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='toast-title']")
    public WebElement welcomeMessage;

    @FindBy(css = "#sidebar_menu > li:nth-of-type(6) > .has-arrow")
    public WebElement productsTitle;

    @FindBy(xpath = "//a[contains(text(),'Product List')]")
    public WebElement productListLinkBut;

    @FindBy(xpath = "//h3[text()='Product List']")
    public WebElement productListWindow;

    public void myLoginMethod() {

        emailBox.sendKeys(ConfigReader.getProperty("Email"));
        passwordBox.sendKeys(ConfigReader.getProperty("Password"));
        rememberMeBox.click();

        JavascriptExecutor javaScript = (JavascriptExecutor) Driver.getDriver();
        javaScript.executeScript("arguments[0].scrollIntoView();", signInButton);
        signInButton.click();

    }

    public void addLessonMethodLejon(){





    }


}


