package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {

    public AutomationExercisePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement isimKutusu;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUpButonu;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement erkekTitleradioButon;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedElementi;

}
