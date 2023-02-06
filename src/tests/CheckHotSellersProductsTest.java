package tests;

import org.junit.Test;

import pages.HomePage;

public class CheckHotSellersProductsTest extends BaseTest {

    @Test
    public void checkProducts() {
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.verifyProductsNumber(6);
    }
}