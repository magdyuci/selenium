import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

    //This entire class was imported from an another selenium project
    @Test
    public static void firstTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("facebook.com");
        driver.findElement(By.name("user")).sendKeys("");
        driver.findElement(By.name("submit")).submit();
        Assert.assertEquals(2,2);
        driver.close();
    }
}
