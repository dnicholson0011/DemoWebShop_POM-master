package Registration;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

/**
 * Assertions: title
 */

public class RegistrationTests extends BaseTests {

    @Test
    public void testSuccessfulRegistration() {
        RegistrationPage registrationPage = homePage.clickRegistration();

        String title = "Demo Web Shop. Register";
        Assert.assertEquals(title,registrationPage.pageTitle());

        registrationPage.setMaleRadioButton();
        registrationPage.setFirstName("first");
        registrationPage.setLastName("last");
        registrationPage.setEmail("first.last@example.test");
        registrationPage.setPassword("123456");
        registrationPage.setConfirmPassword("123456");
        registrationPage.clickRegisterButton();
    }
}
