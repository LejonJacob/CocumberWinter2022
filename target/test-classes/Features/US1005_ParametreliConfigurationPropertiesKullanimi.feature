
Feature: US1005 Parametreli Configuration Properties Kullanimi

    # 3, farkli senaryo olusturup
    # amazon, mycoursedemy ve wisequarter anasayfalarina gidip
    # url'in bu kelimeleri icerdigini test edin

    Scenario: TC09 Kullanici Anasayfasina Gidebilmeli
      Given Kullanici "amazonUrl" Anasayfasina Gider
      Then Url'nin "amazon" icerdigini test eder
      And Sayfayi Kapatir

    Scenario: TC10 Kullanici QualityDemy Anasayfasina Gidebilmeli
      Given Kullanici "qualityDemyUrl" Anasayfasina Gider
      Then Url'nin "qualitydemy" icerdigini test eder
      And Sayfayi Kapatir

    Scenario: TC10 Kullanici Wise Quarter Anasayfasina Gidebilmeli
      Given Kullanici "wiseQuarterUrl" Anasayfasina Gider
      Then Url'nin "wisequarter" icerdigini test eder
      And Sayfayi Kapatir