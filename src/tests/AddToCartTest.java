package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.WhatsNewPage;

public class AddToCartTest extends BaseTest {


    String expectedPrice = "$59.00";
    String expectedTotalPrice = "$64.00";
    String validEmail = "veljan.korac@gmail.com";
    String validPassword = "On0mat0peja";

      @Test
    public void checkAddToCart() {
        HomePage homePage = new HomePage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        homePage.goToHomePage();
        whatsNewPage.clickWhatsNew();
        whatsNewPage.scrollTophoebeProduct();
        whatsNewPage.clickSizeButton();
        whatsNewPage.clickColorButton();
        whatsNewPage.clickAddToCart();
        whatsNewPage.verifyTextFieldIsVisible();
        
    }     
      @Test
    public void verifyCheckOutPrice() {
        HomePage homePage = new HomePage(driver);
        WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login(validEmail,validPassword);
        whatsNewPage.clickWhatsNew();
        whatsNewPage.scrollTophoebeProduct();
        whatsNewPage.clickSizeButton();
        whatsNewPage.clickColorButton();
        whatsNewPage.clickAddToCart();
        whatsNewPage.clickAddToCartTextLink();
        whatsNewPage.verifyItemPrice(expectedPrice);
        whatsNewPage.clickCartButton();
        whatsNewPage.clickRemoveButton();
        whatsNewPage.clickAcceptButton();
        //DODATNI TASK/VERIFIKACIJA CENE NA CHECKOUT PAGE-U.

    }


       @Test
    public void verifyTotalPriceIsShowedProperly() {
       HomePage homePage = new HomePage(driver);
       WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
       LoginPage loginPage = new LoginPage(driver);
           homePage.goToHomePage();
           loginPage.clickSignInButton();
           loginPage.login(validEmail,validPassword);
           whatsNewPage.clickWhatsNew();
           whatsNewPage.scrollTophoebeProduct();
           whatsNewPage.clickSizeButton();
           whatsNewPage.clickColorButton();
           whatsNewPage.clickAddToCart();
           whatsNewPage.clickAddToCartTextLink();
           whatsNewPage.clickProceedToCheckout();
           whatsNewPage.selectStateBytton();
           whatsNewPage.inputFields();
           whatsNewPage.selectCountryButton();
           whatsNewPage.waitTaxFieldVisible();
           whatsNewPage.waitForClickBeClickable();
           whatsNewPage.clickNextButton();
           whatsNewPage.waitTaxFieldVisible();
           whatsNewPage.clickOnTaxField();
           whatsNewPage.clickNextButton();
           whatsNewPage.verifyTotalPrice(expectedTotalPrice);
           homePage.goToHomePage();
           whatsNewPage.waitRedButton();
           whatsNewPage.clickCartButton();
           whatsNewPage.clickRemoveButton();
           whatsNewPage.clickAcceptButton();
           //VERIFIKACIJA:TOTALNA CENA + TAX
           //USLED PONAVLJANJA TESTOVA GOMILA SE KORPA TE JE DODATA METODA ZA BRISANJE PROIZVODA IZ ISTE.



          
     
    }
}