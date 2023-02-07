package selenium_test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    //static khi hđ nó thuộc vè lớp chứ ko phải thuoc ve doi tuong tao ra tu lop
    //tao hang so, gan 1 lân duy nhát
    public static final String Url_login = "http://localhost/wordpress/wp-login.php";
    public static final String Url_dashBoard = "http://localhost/wordpress/wp-admin/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Url_login);
    }

    @AfterMethod  //run sau 1 method test
    public void tearDown() {
        driver.quit();
    }
}
