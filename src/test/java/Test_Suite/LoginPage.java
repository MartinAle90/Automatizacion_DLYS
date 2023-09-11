package Test_Suite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;


public class LoginPage {

    Servicios ts = new Servicios();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    @Test
    public void testLogin() {
        WebDriver driver = TestSuit.driver;
        driver.get("https://d-box-test.materiasistemas.com.ar");
        {
            WebElement element = driver.findElement(By.id("demo-simple-select-standard"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".MuiBackdrop-root"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(3)")).click();
        driver.findElement(By.id("input-with-sx")).click();
        System.out.println("Ingrese nombre de usuario");
        String username = input.next();
        driver.findElement(By.id("input-with-sx")).sendKeys(username);
        driver.findElement(By.id("standard-adornment-password")).click();
        System.out.println("Ingrese password de usuario");
        String password = input.next();
        driver.findElement(By.id("standard-adornment-password")).sendKeys(password);
        driver.findElement(By.cssSelector(".MuiButton-root")).click();

        ts.funcionEsperar();
        ts.funcionEsperar();
    }
}
