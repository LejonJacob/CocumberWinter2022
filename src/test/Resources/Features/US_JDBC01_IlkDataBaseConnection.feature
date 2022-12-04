Feature: JDBC Kullanarak Yeterli Bilgi ile Database Testi Yapilabilir

  @db
  Scenario: JDBC01 Kullanici Database'de Sorgu Yapabilmeli

    Given Kullanici JDBC ile Database'e Baglanir
    Then Users Tablosundaki isim Verilerini Alir
    And isim Verilerini Test Eder