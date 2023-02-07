package selenium_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddNewPostsPage {
    public String Url_addNew = "http://localhost/wordpress/wp-admin/post-new.php";
    public String iframe = "content_ifr";
    public String titleID = "title";
    public String bodyID = "tinymce";
    public String title = "This is the title";
    public String body = "This is the body";
    public String PublishBtn = "publish";

    WebDriver driver;

    public AddNewPostsPage(WebDriver driver) {  //tham số driver
        this.driver = driver;
    }

    public void addANewPost(String title, String body) {
        driver.findElement(By.id(titleID)).sendKeys(title);
        driver.switchTo().frame(iframe);
        driver.findElement(By.id(bodyID)).sendKeys(body);
        driver.switchTo().defaultContent();
        driver.findElement(By.id(PublishBtn)).click();
    }

    public void goToDetailPage() {
        driver.findElement(By.cssSelector("#message a")).click();
    }

}

