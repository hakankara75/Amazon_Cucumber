package amazon.pages;

import amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(id = "a-autoid-0")
    public WebElement sortBy;
    @FindBy(id = "s-result-sort-select_1")
    public WebElement lowToHigh;
    @FindBy(id = "p_36/14674878011")
    public WebElement above600;
    @FindBy(xpath = "//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']")
    public WebElement aramaSonuclari;
    @FindBy(id = "nav-link-accountList")
    public WebElement signInMenu;
    @FindBy(id = "ap_email")
    public WebElement email;
    @FindBy(id = "ap_password")
    public WebElement password;
    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(id = "signInSubmit")
    public WebElement signInButton;




}
