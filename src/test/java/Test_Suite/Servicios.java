package Test_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Servicios {
    public void funcionEsperar() {
        WebDriver driver = TestSuit.driver;
        try {
            driver.findElements(By.id("APjFqb"));
        } catch (Exception exc) {
            System.out.println("*****");
        }
    }
    public int numRandom(){
        return (int) (Math.floor(Math.random() * (100 - 1 + 1)) + 1);
    }
}
