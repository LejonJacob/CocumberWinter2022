
Feature: US1007 Yanlis Kullanici ve Password ile Negatif Login Yapma Testi

  Scenario: TC13 Yanlis Email, Dogru Password ile Giris Yapilamamali
    Given Kullanici "qualityDemyUrl" Anasayfasina Gider
    Then Ana Sayfada Cikan Cookies'leri Kabul eder
    Then Kullanici Quality Demy anasayfasinda login linkine tiklar
    Then Quality Demy Kullanici adi olarak "qualityDemyYanlisMail" girer
    And Quality Demy Password olarak "userGecerliPassword1" girer
    Then Quality Demy Login butonuna basar
    Then Quality Demy Sayfasina Giris yapilamadigini test eder
    And Sayfayi Kapatir