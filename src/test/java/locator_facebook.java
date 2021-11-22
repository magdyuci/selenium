import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locator_facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com"); //URL in the browser

        //driver.findElement(By.className("inputtext")).sendKeys("Hello world");// only will be open the one element, the first top left (some element have the same inputtext class)

//        driver.findElement(By.id("email")).sendKeys("This is my first code");//found the element and fill the field with sendKeys
//        driver.findElement(By.name("pass")).sendKeys("123456");
//        driver.findElement(By.linkText("Forgotten account?")).click();//function click
        driver.findElement(By.cssSelector("#email")).sendKeys("email");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
        //driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

    }
}
