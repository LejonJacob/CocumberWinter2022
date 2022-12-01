Feature: US1001 Amazon Arama Testi


  Scenario: TC01 Kullanici Amazonda Arama Yapabilmeli

    Given Kullanici Amazon Anasayfasina Gider
    When Arama Kutusuna Nutella Yazip Aratir
    Then Arama Sonuclarinin Nutella icerdigini Test Eder
    And Sayfayi Kapatir