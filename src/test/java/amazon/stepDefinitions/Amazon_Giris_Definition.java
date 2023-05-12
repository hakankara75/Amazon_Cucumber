package amazon.stepDefinitions;

import amazon.pages.AmazonPage;
import amazon.utilities.ConfigReader;
import io.cucumber.java.en.When;

public class Amazon_Giris_Definition {


    AmazonPage amazonPage=new AmazonPage();
    @When("sign in menusune tiklar")
    public void sign_in_menusune_tiklar() {
        amazonPage.signInMenu.click();
    }
    @When("email kutusuna email girer")
    public void email_kutusuna_email_girer() {
       amazonPage.email.sendKeys(ConfigReader.getProperty("email"));
    }
    @When("contionue butonuna tiklar")
    public void contionue_butonuna_tiklar() {
        amazonPage.continueButton.click();
    }
    @When("password kutusuna password girer")
    public void password_kutusuna_password_girer() {
        amazonPage.password.sendKeys(ConfigReader.getProperty("password"));
    }
    @When("signIn butonuna tiklar")
    public void sign_ın_butonuna_tiklar() {
       amazonPage.signInButton.click();
    }





}
