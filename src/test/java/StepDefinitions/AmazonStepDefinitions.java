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

    @Then("Arama Kutusuna {string} Yazip Aratir")
    public void aramaKutusunaYazipAratir(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);

    }

    @And("Arama Sonuclarinin {string} icerdigini Test Eder")
    public void aramaSonuclarininIcerdiginiTestEder(String istenenKelime) {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(istenenKelime));

    }

    @Given("Kullanici {string} Anasayfasina Gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));

    }
}
