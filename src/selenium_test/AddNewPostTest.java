package selenium_test;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewPostsTest extends BaseTest {
//	String Url_dashBoard = "http://localhost/wordpress/wp-admin/";
//	String user_login = "user_login";
//	String user_pass = "user_pass";
//	String submitBtn = "wp-submit";

    //	public void login(String userName, String password) {
//		driver.findElement(By.id(user_login)).sendKeys(userName);
//		driver.findElement(By.id(user_pass)).sendKeys(password);
//		driver.findElement(By.id(submitBtn)).click();
//	}
    LoginPage loginPg;
    AddNewPostsPage addNewPg;

    @Test
    public void addNewPost() {
        loginPg = new LoginPage(driver); //  tu class loginTest, muốn goi function class LoginPage, can khoi tao 1 object của class
        addNewPg = new AddNewPostsPage(driver);

        loginPg.login("nganguyen", "nganguyen@98");
        driver.get(addNewPg.Url_addNew);
        addNewPg.addANewPost(addNewPg.title, addNewPg.body);
        addNewPg.goToDetailPage();

        String titlePost = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(titlePost, addNewPg.title);


//		login("nganguyen", "nganguyen@98");
//		driver.get("http://localhost/wordpress/wp-admin/post-new.php");
//		driver.findElement(By.name("post_title")).sendKeys("title");
//
//		driver.switchTo().frame("content_ifr");
//		driver.findElement(By.id("tinymce")).sendKeys(" body");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("publish")).click();
//
//		//ktra noi dung bai viet vua tao C1: bai viet hien thi ngoai front end
//		//= cach tim vị trí link View Post
//		driver.findElement(By.cssSelector("#message a")).click();
//		String title = driver.findElement(By.tagName("h1")).getText();
//		Assert.assertEquals(title, "This is the title");
    }


}

