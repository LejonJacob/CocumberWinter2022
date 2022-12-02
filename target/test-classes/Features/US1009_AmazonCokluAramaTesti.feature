Feature: US1009 Kullanici liste olarak verilen urunleri Amazon'da aratir

  # Amazon ana sayfaya gidip Nutella, java, Apple, Samsung, LG icin arama yapip
  # arama sonuclarinin aranan kelimeleri icerdigini test edin


  Scenario Outline: TC17 Kullanici liste olarak arama testi yapabilmeli

    Given Kullanici "amazonUrl" Anasayfasina Gider
    Then Arama Kutusuna "<istenenKelime>" Yazip Aratir
    And Arama Sonuclarinin "<istenenKelime>" icerdigini Test Eder
    Then Sayfayi Kapatir

    Examples:
      |istenenKelime|
      |Nutella      |
      |Java         |
      |Apple        |
      |Samsung      |
      |OnePlus      |