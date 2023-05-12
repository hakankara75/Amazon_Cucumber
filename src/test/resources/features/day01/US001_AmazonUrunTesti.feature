@AmazonUrun
Feature: US001_Amazon_Sayfasinda_Urun_Aratma

  Background: kullanici_amazon_sayfasina_gider
    Given kullanici_amazon_anasayfasina_gider

  Scenario: TC01_Amazon_sayfasinda_tencere_Aratma
    When arama_kutusunda_"tencere"_aratir
    And sayfayi_kapatir

  Scenario: TC02_Amazon_sayfasinda_şapka_Aratma
    When arama_kutusunda_"şapka"_aratir
    And sayfayi_kapatir

  Scenario: TC03_Amazon_sayfasinda_halı_Aratma
    When arama_kutusunda_"halı"_aratir
    And sayfayi_kapatir