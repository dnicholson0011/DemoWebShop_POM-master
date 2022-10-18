package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Assertions: title
 */

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLogin();

        String title = "Demo Web Shop. Login";
        Assert.assertEquals(title,loginPage.pageTitle());

        loginPage.setUsername("first.last@example01.test");
        loginPage.setPassword("123456");
        loginPage.clickLoginButton();

        title = "Demo Web Shop";
        Assert.assertEquals(title,homePage.pageTitle());
    }
}
