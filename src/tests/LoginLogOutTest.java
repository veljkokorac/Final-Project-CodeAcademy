package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginLogOutTest extends BaseTest {

    String validEmail = "veljan.korac@gmail.com";
    String validPassword = "On0mat0peja";
    String invalidEmail = "testInvalidEmail";
    String invalidPasswod ="testInvalidPassword";
    String invalidErrorMessage = "Please enter a valid email address (Ex: johndoe@domain.com).";
    String emptyErrorMessage = "This is a required field.";
    String emptyPasswordMessage = "This is a required field.";


  @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login(validEmail,validPassword);
        loginPage.verifyTextIsShowed();
         
    }

@Test
    public void loginWithInvalidCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login(invalidEmail, invalidPasswod);
        loginPage.verifyInvalidTextError(invalidErrorMessage);
    }

 @Test
    public void verifyEmtyUserLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login("",validPassword);
        loginPage.verifyEmptyUser(emptyErrorMessage);
    }

 @Test
    public void verifyEmptyPasswordLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login(validEmail,"");
        loginPage.verifyEmptyPassword(emptyPasswordMessage);
    }    

@Test
    public void verifySignOutButton() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        loginPage.clickSignInButton();
        loginPage.login(validEmail,validPassword);
        loginPage.dropDownButton();
        loginPage.clickSignOutButton();
        loginPage.verifySignOut();
    }
}