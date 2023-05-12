package amazon.stepDefinitions;

import amazon.pages.AmazonPage;
import amazon.utilities.ConfigReader;
import amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class Amazon_SearchBox_Definition {

    AmazonPage amazonPage;
    @And("sayfayi_kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Given("kullanici_amazon_sayfasina_gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @And("arama_kutusunda_iphone_aratir")
    public void arama_kutusunda_iphone_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Given("cikan sonuclarda iphone olmadigini dogrular")
    public void cikan_sonuclarda_iphone_olmadigini_dogrular() {
    List<WebElement> iphoneList= Driver.getDriver().findElements(By.xpath("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']"));
        int sayac=0;
        try {
            for (WebElement element : iphoneList) {
if (!element.getText().contains("iphone")){
    sayac++;
}
                assertTrue(sayac>0);
            }
        }catch (Exception e) {  }

    }



}
