import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/file/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com"); //open the url passed as parameter

        System.out.println(driver.getTitle());//print the title of the open page
        System.out.println(driver.getCurrentUrl()); //print the current URL
        //System.out.println(driver.getPageSource()); // print all code of the page
        driver.get("http://yahoo.es");
        driver.navigate().back(); //navigate to the before page
        driver.close(); //it closes current browser
        driver.quit(); //it closes all browsers opened by selenium script

    }


}
