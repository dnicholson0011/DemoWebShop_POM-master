package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;

    private By maleRadioButton = By.id("gender-male");

    private By femaleRadioButton = By.id("gender-female");

    private By firstNameField = By.id("FirstName");

    private By lastNameField = By.id("LastName");

    private By emailField = By.id("Email");

    private By passwordField = By.id("Password");

    private By confirmPasswordField = By.id("ConfirmPassword");

    private By registerButton = By.id("register-button");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void setMaleRadioButton() {
        driver.findElement(maleRadioButton).click();
    }

    public void setFemaleRadioButton() {
        driver.findElement(femaleRadioButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}
