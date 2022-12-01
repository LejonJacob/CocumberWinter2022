package StepDefinitions;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici Amazon Anasayfasina Gider")
    public void kullanici_amazon_anasayfasina_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("Arama Kutusuna Nutella Yazip Aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("Arama Sonuclarinin Nutella icerdigini Test Eder")
    public void aramaSonuclarininNutellaIcerdiginiTestEder() {

        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Nutella";

        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));

    }

    @Then("Sayfayi Kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }

}
