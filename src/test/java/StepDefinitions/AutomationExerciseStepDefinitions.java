package StepDefinitions;

import Pages.AutomationExercisePage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercise = new AutomationExercisePage();

    @Given("User SignUp Linkine tiklar")
    public void user_sign_up_linkine_tiklar() {

        automationExercise.signUpLinki.click();
    }
    @Given("New User Bölümüne Name ve Email adresi girer")
    public void new_user_bölümüne_name_ve_email_adresi_girer() {

        automationExercise.isimKutusu.sendKeys("Leon");
        automationExercise.emailKutusu.sendKeys("sverigelejon1@gmail.com");
    }
    @Given("SignUp Butonuna basar")
    public void sign_up_butonuna_basar() {

        automationExercise.signUpButonu.click();
    }
    @Given("User'a Ait Kisisel Bilgileri ve Iletisim Bilgilerini girer")
    public void user_a_ait_kisisel_bilgileri_ve_ıletisim_bilgilerini_girer() {

        Actions actions= new Actions(Driver.getDriver());
        actions.click(automationExercise.erkekTitleradioButon)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("123456")
                .sendKeys(Keys.TAB).sendKeys("21").sendKeys(Keys.TAB)
                .sendKeys("May").sendKeys(Keys.TAB).sendKeys("1998")
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys("Jacob").sendKeys(Keys.TAB)
                .sendKeys("Lejon").sendKeys(Keys.TAB).sendKeys("SWEDEN")
                .sendKeys(Keys.TAB).sendKeys("Mölnycke/Göteborg").sendKeys(Keys.TAB)
                .sendKeys("-").sendKeys(Keys.TAB).sendKeys("Germany")
                .sendKeys(Keys.TAB).sendKeys("-").sendKeys(Keys.TAB)
                .sendKeys("Göteborg").sendKeys(Keys.TAB).sendKeys("12321")
                .sendKeys(Keys.TAB).sendKeys("+4623232323").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

    }
    @Given("User Create Account Butonuna basar")
    public void user_create_account_butonuna_basar() {

        automationExercise.createAccountButonu.click();
    }
    @Then("Hesabin Basariyla Olustugunu dogrulayin")
    public void hesabin_basariyla_olustugunu_dogrulayin() {

        Assert.assertTrue(automationExercise.createAccountButonu.isDisplayed());
    }

}
