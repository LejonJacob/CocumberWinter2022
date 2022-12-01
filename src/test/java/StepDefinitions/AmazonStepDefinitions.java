package StepDefinitions;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
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

    @Then("Arama Kutusuna Java Yazip Aratir")
    public void aramaKutusunaJavaYazipAratir() {

        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("Arama Sonuclarinin Java icerdigini Test Eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Java";

        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));

    }

    @Then("Arama Kutusuna Apple Yazip Aratir")
    public void aramaKutusunaAppleYazipAratir() {
        amazonPage.aramaKutusu.sendKeys("Apple" + Keys.ENTER);
    }

    @And("Arama Sonuclarinin Apple icerdigini Test Eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedkelime="Apple";

        Assert.assertTrue(actualAramaSonucu.contains(expectedkelime));

    }
}
