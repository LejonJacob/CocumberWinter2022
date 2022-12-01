
Feature: US1003 Background Kullanarak Amazon Arama Testi

  Background: Önce Amazon Anasayfaya Gider
    Given Kullanici Amazon Anasayfasina Gider

  Scenario: TC02  Kullanici Amazonda Nutella aramasi yapar.
    Then Arama Kutusuna Nutella Yazip Aratir
    And Arama Sonuclarinin Nutella icerdigini Test Eder
    And Sayfayi Kapatir


  Scenario: TC03 Kullanici Amazonda Java aramasi yapar
    Then Arama Kutusuna Java Yazip Aratir
    And Arama Sonuclarinin Java icerdigini Test Eder
    And Sayfayi Kapatir


  Scenario: TC04 Kullanici Amazonda Apple aramasi yapar
    Then Arama Kutusuna Apple Yazip Aratir
    And Arama Sonuclarinin Apple icerdigini Test Eder
    And Sayfayi Kapatir