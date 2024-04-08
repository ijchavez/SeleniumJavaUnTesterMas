import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo {
    public static void main(String[] args) {
        // instanciamos el driver como chrome driver
        WebDriver driver = new ChromeDriver();

        //Ir a una url
        driver.get("https://seleniumjavalocators.neocities.org/");

        //imprimimos por consola el titulo de la pagina
        System.out.println(driver.getTitle());

        //cerramos el driver.
        driver.close();

    }
}
