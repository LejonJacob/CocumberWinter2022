
Feature: US1002 Amazon Arama Testi

    # Kullanicinin arama yapmasi icin 3 scenario olusturun
    # Nutella, Java ve Apple icin arama yapip sonuclarin aranan kelime icerdigini test edin

    Scenario: TC02  Kullanici Amazonda Nutella aramasi yapar.
      Given Kullanici Amazon Anasayfasina Gider
      Then Arama Kutusuna Nutella Yazip Aratir
      And Arama Sonuclarinin Nutella icerdigini Test Eder
      And Sayfayi Kapatir


    Scenario: TC03 Kullanici Amazonda Java aramasi yapar
      Given Kullanici Amazon Anasayfasina Gider
      Then Arama Kutusuna Java Yazip Aratir
      And Arama Sonuclarinin Java icerdigini Test Eder
      And Sayfayi Kapatir


    Scenario: TC04 Kullanici Amazonda Apple aramasi yapar
      Given Kullanici Amazon Anasayfasina Gider
      Then Arama Kutusuna Apple Yazip Aratir
      And Arama Sonuclarinin Apple icerdigini Test Eder
      And Sayfayi Kapatir


