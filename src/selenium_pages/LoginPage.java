package selenium_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
    public String user_login = "user_login";
    public String user_pass = "user_pass";
    public String submitBtn = "wp-submit";

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName, String password) {
        driver.findElement(By.id(user_login)).sendKeys(userName);
        driver.findElement(By.id(user_pass)).sendKeys(password);
        driver.findElement(By.id(submitBtn)).click();
    }

}

