package pages.books;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BooksPage;

import java.time.Duration;

public class ComputingAndInternetPage {

    private WebDriver driver;

    private By quanityField = By.id("addtocart_13_EnteredQuantity");

    private By addToCartButton = By.id("add-to-cart-button-13");

    private By banner = By.xpath("//p[@class='content']");

    public ComputingAndInternetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String pageTitle() {
        return driver.getTitle();
    }

    public void setQuanity(String quanity) {
        driver.findElement(quanityField).clear();
        driver.findElement(quanityField).sendKeys(quanity);
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public boolean banner() {
        WebDriverWait wait = new WebDriverWait(driver, 1L);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(banner));
        return element.isDisplayed();
    }
}
