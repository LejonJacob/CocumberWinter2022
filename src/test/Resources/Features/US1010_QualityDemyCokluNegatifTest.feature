Feature: US1010 Liste Olarak Verilen Wrong User ile Negatif Login Testi


  Scenario Outline:
    Given Kullanici "qualityDemyUrl" Anasayfasina Gider
    Then Quality Demy Anasayfasinda Cikan Cookies'leri Kabul eder
    Then Kullanici Quality Demy anasayfasinda login linkine tiklar
    And Quality Demy Kullanici adi olarak "<istenenEmail>" girer
    And Quality Demy Password olarak "<istenenPassword>" girer
    Then Quality Demy Login butonuna basar
    Then Quality Demy Sayfasina Giris yapilamadigini test eder
    And Sayfayi Kapatir
    
    
    
    Examples:
    |istenenEmail|istenenPassword|
    |qualityDemyYanlisMail|qualityDemyYanlisPassword|
    |qualityDemyYanlisMail1|qualityDemyYanlisPassword1|
    |qualityDemyYanlisMail2|qualityDemyYanlisPassword2|
    |qualityDemyYanlisMail3|qualityDemyYanlisPassword3|
    |qualityDemyYanlisMail4|qualityDemyYanlisPassword4|