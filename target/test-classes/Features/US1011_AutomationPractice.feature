Feature: US1011 Automation Practice Kullanici Olusturma Testi

  @wip
  Scenario: TC18 Kullanici Anasayfada Yeni Kullanici Olusturabilmeli


    Given Kullanici "automationExerciseURL" Anasayfasina Gider
    And User SignUp Linkine tiklar
    And New User Bölümüne Name ve Email adresi girer
    And SignUp Butonuna basar
    And User'a Ait Kisisel Bilgileri ve Iletisim Bilgilerini girer
    And User Create Account Butonuna basar
    Then Hesabin Basariyla Olustugunu dogrulayin