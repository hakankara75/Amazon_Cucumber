@AmazonGiris
Feature: US001_Amazon_Sayfasinda_Urun_Aratma
  Scenario: TC01_Amazon_sayfasina_giris
    Given kullanici_amazon_anasayfasina_gider
    When sign in menusune tiklar
    And email kutusuna email girer
    And contionue butonuna tiklar
    And password kutusuna password girer
    And password kutusuna password girer
    And signIn butonuna tiklar
    And sayfayi_kapatir