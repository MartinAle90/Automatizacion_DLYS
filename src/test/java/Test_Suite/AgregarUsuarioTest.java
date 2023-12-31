package Test_Suite;// Generated by Selenium IDE

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgregarUsuarioTest {

    Servicios ts = new Servicios();

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[1]/div[4]/div/div/div/div/div/div/div/button/svg")
    public WebElement svgArrowDropDownIcon;

    @FindBy(xpath = "//*[@id='mui-284-option-0']")
    public WebElement liMuiOption;

    @FindBy(xpath = "//*[@id='mui-284']")
    public WebElement inputMui;

    @FindBy(xpath = "//button[contains(@class, 'css-5zrdtn')]")
    public WebElement buttonGuardar;


    @Test
    public void agregarUsuario() {
        WebDriver driver = TestSuit.driver;

//        ts.funcionEsperar();
//        ts.funcionEsperar();

        driver.get("https://d-box-test.materiasistemas.com.ar/usuarios/admin");

        ts.funcionEsperar();
        ts.funcionEsperar();

        driver.findElement(By.xpath("//button[contains(@class, 'css-lon3mv')]")).click();

        ts.funcionEsperar();

        driver.findElement(By.id("#/properties/name")).click();
        int num = +ts.numRandom();
        driver.findElement(By.id("#/properties/name-input")).sendKeys("testNombre" + num);
        driver.findElement(By.id("#/properties/surname-input")).sendKeys("testApellido" + num);
        driver.findElement(By.id("#/properties/username-input")).sendKeys("testSeleniumUsuario" + num);
        driver.findElement(By.id("#/properties/password-input")).sendKeys("testSelenium" + num);
        driver.findElement(By.id("#/properties/email-input")).sendKeys("testCorreo" + num + "@test.com");

        ts.funcionEsperar();

//        driver.findElement(By.xpath("//*[@id='mui-284']")).click();
//        driver.findElement(By.xpath("//*[@id='mui-284']")).sendKeys("100 - INDOSUR S.A.");
        driver.findElement(By.xpath("//button[contains(@class, 'css-5zrdtn')]")).click();
        ts.funcionEsperar();
    }
}
