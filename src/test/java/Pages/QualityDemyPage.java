package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualityDemyPage {

    public QualityDemyPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[text()=\"Log in\"]")
    public WebElement loginLink;

    @FindBy(xpath = "//a[@onclick=\"cookieAccept();\"]")
    public WebElement cookies;


    @FindBy(xpath = "//input[@id=\"login-email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id=\"login-password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    public WebElement loginButton;

    @FindBy(linkText = "My courses")
    public WebElement myCoursesLink;

}
