

Feature: US1006 Dogru Kullanici ve Password ile Pozitif Login Testi

  Scenario: TC12 Kullanici Quality Demy sitesine Login yapabilmeli

    Given Kullanici "qualityDemyUrl" Anasayfasina Gider
    Then Kullanici Quality Demy anasayfasinda login linkine tiklar
    Then Quality Demy Kullanici adi olarak "userGecerliEmail1" girer
    And Quality Demy Password olarak "userGecerliPassword1" girer
    Then Quality Demy Login butonuna basar
    Then Quality Demy sayfasina basarili giris yapabildigini test eder
    And Sayfayi Kapatir