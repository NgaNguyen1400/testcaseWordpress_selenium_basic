package selenium_test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
//	String Url_login = "http://localhost/wordpress/wp-login.php";
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


    @Test
    public void loginByAdminWithUsername() {
        loginPg = new LoginPage(driver); //  tu class loginTest, muốn goi function class LoginPage, can khoi tao 1 object của class
        loginPg.login("nganguyen", "nganguyen@98");
        //Xac minh test case pass or failed
        Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);

    }

//	@Test
//	public  void loginByAdminWithEmail() {
//		login("nga260300@gmail.com","nganguyen@98");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//
//	@Test
//	public  void loginWithBlankUserField() {
//		login("","nganguyen@98");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//	@Test
//	public  void loginWithBlankPassWordField() {
//		login("nganguyen","");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//
//	@Test
//	public  void loginWithBlankField() {
//		login("","");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//
//	@Test
//	public  void loginWithWrongUserloginField() {
//		login("nga","nganguyen@98");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//
//	@Test
//	public  void loginWithWrongPassWordField() {
//		login("nga260300@gmail.com","111");
//		Assert.assertEquals(driver.getCurrentUrl(), Url_dashBoard);
//    }
//
//


}




