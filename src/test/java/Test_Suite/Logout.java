package Test_Suite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Logout {

    Servicios ts = new Servicios();

//    @FindBy(xpath = "//button[@aria-label='Account settings']")
//    public WebElement buttonAccountSettings;
//
//    @FindBy(xpath = "//a[@href='/logout']")
//    public WebElement linkLogout;
//
//    @FindBy(xpath = "//button[contains(@class, 'confirm')]")
//    public WebElement buttonSwalStyled;


    @Test
    public void testLogout() {

        WebDriver driver = TestSuit.driver;
        ts.funcionEsperar();
        driver.get("https://d-box-test.materiasistemas.com.ar/dashboard");
        ts.funcionEsperar();
        driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
        ts.funcionEsperar();
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        ts.funcionEsperar();
        driver.findElement(By.xpath("//button[contains(@class, 'confirm')]"));

    }
}
