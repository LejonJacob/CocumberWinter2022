Feature: US1008 Herokuapp Wait Testleri

  @wip
  Scenario: TC16 Kullanici WaitIslemlerinin Calistigini Test Eder

      # https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
      # 1)“Add Element” butona basin
      # 2)“Delete” butonu gorunur oluncaya kadar bekleyin
      # 3)“Delete” butonunun gorunur oldugunu test edin
      # 4)Delete butonuna basarak butonu silin
      # 5)Delete butonunun gorunmedigini test edin

    Given Kullanici "herokuappUrl" Anasayfasina Gider
    Then Herokuapp Add Element butonuna basar
    Then Herokuapp Delete butonunun görünmesini bekler
    And Herokuapp Delete butonunun görunür oldugunu test edilir
    Then Herokuapp Delete butonuna basarak butonu siler
    And Herokuapp Delete butonunun görünmedigi test edilir
    And Sayfayi Kapatir

    # Yeni bir sayfada calismaya basladigimizda
    # 1- Feature dosyasi olusturalim
    # 2- Eksik adimlari olusturmak icin
    #    Runner class'inda dryRun=true yapip , Runner'i calistiralim
    #    Olusturulan eksik adimlari, Yeni bir Class olusturup icerisine yapistiralim
    # 3- Stepdefinition class'indaki eksik adimlarin Java kodlarini POM'e uygun olarak yazalim
    # 4- Locate'leri yapmak icin page sayfasi olusturalim
    #    Page class'ini acinca bir constructor olusturup, Pagefactory.initElements()
    #    method'unu kullanarak Driver'imizi page sayfasina tanitalim