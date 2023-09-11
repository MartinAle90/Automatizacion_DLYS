package PruebasAuxiliares;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Base_WebDriver {

    WebDriver driver;


    @Test
    public void codigoBase() {
        //ubicación del driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Martin/Documents/AquaProjects/chromedriver-win32-/chromedriver.exe");

        //condiciones que nosotros queremos al momento en que se ejecuta nuestro navegador
        //si lo queremos incognito - agregar un plugin - que se ejecute en pantalla completa
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        // intanciamos el chrome driver para abrir el navegador
        driver = new ChromeDriver(options);

        //tiempo implicito el cual el navegador va a esperar que los elementos esten presentes
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // url a la que se quiere automatizar
        driver.get("https://d-box-test.materiasistemas.com.ar/login");




    }
}