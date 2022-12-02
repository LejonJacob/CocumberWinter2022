package StepDefinitions;

import Pages.HerokuappPage;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HerokuappStepDefinition {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Then("Herokuapp Add Element butonuna basar")
    public void herokuapp_add_element_butonuna_basar() {

        herokuappPage.addButton.click();
    }

    @Then("Herokuapp Delete butonunun görünmesini bekler")
    public void herokuapp_delete_butonunun_görünmesini_bekler() {

        // Delete butonu 15 saniyelik implicitlyWait suresi icerisinde gorundugunden
        // Buraya ekstra explicit wait olusturmaya gerek yok
        // Illa da bekleyelim isteniyorsa
        ReusableMethods.waitForVisibility(herokuappPage.deleteButton, 2);
    }

    @Then("Herokuapp Delete butonunun görunür oldugunu test edilir")
    public void herokuapp_delete_butonunun_görunür_oldugunu_test_edilir() {

        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }

    @Then("Herokuapp Delete butonuna basarak butonu siler")
    public void herokuapp_delete_butonuna_basarak_butonu_siler() {

        herokuappPage.deleteButton.click();
    }

    @Then("Herokuapp Delete butonunun görünmedigi test edilir")
    public void herokuapp_delete_butonunun_görünmedigi_test_edilir() {

        boolean flag=false;
        try {
            Assert.assertFalse(herokuappPage.deleteButton.isDisplayed());

        } catch (Exception e) {
            flag=true;
        }

        Assert.assertTrue(flag);
    }


}