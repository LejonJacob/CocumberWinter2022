
Feature: US1004 Parametre Kullanma
  @wip2
    Scenario: TC08 Kullanici, Parametre ile verilen kelimeyi Amazonda aratabilmelidir

      Given Kullanici Amazon Anasayfasina Gider
      Then Arama Kutusuna "Nutella" Yazip Aratir
      And Arama Sonuclarinin "Nutella" icerdigini Test Eder
      And Sayfayi Kapatir