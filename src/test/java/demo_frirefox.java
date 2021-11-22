import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo_frirefox {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "src/test/file/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        driver.get("http://yahoo.es");
        driver.navigate().back();
    }
}