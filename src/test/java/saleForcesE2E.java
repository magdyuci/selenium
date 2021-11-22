import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleForcesE2E {
    public static void main(String[] arg) {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rediff.com"); //URL in the browser

        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//in regular expression isn't necessary complete the name of value
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();//in regular expression isn't necessary complete the name of value
    }
}
