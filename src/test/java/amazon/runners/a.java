package amazon.runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class a {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.verboseLogging", "true");
        ChromeOptions opt= new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress","localhost:9222 ");

        WebDriver driver = new ChromeDriver(opt);

        driver.get("https://www.lifepharmacy.co.nz/cart/checkout-payment-details/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(4000);

        driver.switchTo().frame(driver.findElement(By.xpath("*//iframe[@title='reCAPTCHA']")));
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        System.out.println(driver.getTitle());

        System.out.println("Pass");
        Thread.sleep(20000);
    }
}
