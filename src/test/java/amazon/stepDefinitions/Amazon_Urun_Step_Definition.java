package amazon.stepDefinitions;

import amazon.pages.AmazonPage;
import amazon.utilities.ConfigReader;
import amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Amazon_Urun_Step_Definition {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici_amazon_anasayfasina_gider")
    public void kullanici_amazon_anasayfasina_gider() {
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("arama_kutusunda_{string}_aratir")
    public void arama_kutusunda__aratir(String string) {
        amazonPage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }

    @And("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();
    }

}
