package StepDefinitions;

import Pages.QualityDemyPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class QualityDemyStepDefinitions {

    QualityDemyPage qualityDemyPage = new QualityDemyPage();

    @Then("Kullanici Quality Demy anasayfasinda login linkine tiklar")
    public void kullanici_quality_demy_anasayfasinda_login_linkine_tiklar() {
        qualityDemyPage.loginLink.click();

    }
    @Then("Ana Sayfada Cikan Cookies'leri Kabul eder")
    public void anaSayfadaCikanCookiesLeriKabulEder() {
        ReusableMethods.waitForVisibility(qualityDemyPage.cookies, 2);
        qualityDemyPage.cookies.click();
        ReusableMethods.waitForVisibility(qualityDemyPage.loginLink, 1);

    }
    @Then("Quality Demy Kullanici adi olarak {string} girer")
    public void quality_demy_kullanici_adi_olarak_girer(String Email) {
        qualityDemyPage.emailBox.sendKeys(ConfigReader.getProperty(Email));
    }
    @Then("Quality Demy Password olarak {string} girer")
    public void quality_demy_password_olarak_girer(String Password) {
        qualityDemyPage.passwordBox.sendKeys(ConfigReader.getProperty(Password));

    }
    @Then("Quality Demy Login butonuna basar")
    public void quality_demy_login_butonuna_basar() {
        qualityDemyPage.loginButton.click();

    }
    @Then("Quality Demy sayfasina basarili giris yapabildigini test eder")
    public void quality_demy_sayfasina_basarili_giris_yapabildigini_test_eder() {
        Assert.assertTrue(qualityDemyPage.myCoursesLink.isDisplayed());

    }

    @Then("Quality Demy Sayfasina Giris yapilamadigini test eder")
    public void qualityDemySayfasinaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(qualityDemyPage.loginLink.isDisplayed());
    }
}
