import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_saleforces {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://login.salesforce.com"); //URL in the browser

        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
        //driver.findElement(By.className("button r4 wide primary")).click(); //error because the classes not allows spaces
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText()); //show the text of the cssSelector
        driver.close();
    }
}
