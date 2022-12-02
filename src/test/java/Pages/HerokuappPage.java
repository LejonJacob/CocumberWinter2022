package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuappPage {

    public HerokuappPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()=\"Add Element\"]")
    public WebElement addButton;

    @FindBy(xpath = "//button[text()=\"Delete\"]")
    public WebElement deleteButton;

}
