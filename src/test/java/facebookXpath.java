import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com"); //URL in the browser

        //Xpath //tagName[@attribute=‘value’]
       /* driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/

       //CSS tagName[attribute=’value’]
       driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my_email");
       driver.findElement(By.cssSelector("[value='Log In']")).click();
    }
}
