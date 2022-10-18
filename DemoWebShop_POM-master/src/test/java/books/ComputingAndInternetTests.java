package books;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooksPage;
import pages.books.ComputingAndInternetPage;

/**
 * Assertions: title, banner
 */

public class ComputingAndInternetTests extends BaseTests {

    @Test
    public void testComputingAndInternet() {
        BooksPage booksPage = homePage.clickBooks();
        ComputingAndInternetPage computingAndInternetPage = books.clickComputingAndInternet();

        String title = "Demo Web Shop. Computing and Internet";
        Assert.assertEquals(title, computingAndInternetPage.pageTitle());

        computingAndInternetPage.setQuanity("1");
        computingAndInternetPage.clickAddToCartButton();

        Assert.assertEquals(true, computingAndInternetPage.banner());
    }

    @Test
    public void negativeTestComputingAndInternet() {
        BooksPage booksPage = homePage.clickBooks();
        ComputingAndInternetPage computingAndInternetPage = books.clickComputingAndInternet();

        String title = "Demo Web Shop. Computing and Internet";
        Assert.assertEquals(title, computingAndInternetPage.pageTitle());

        computingAndInternetPage.setQuanity("-1");
        computingAndInternetPage.clickAddToCartButton();

        Assert.assertEquals(true, computingAndInternetPage.banner());
    }
}