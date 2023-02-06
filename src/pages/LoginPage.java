package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    By signInButton = By.partialLinkText("Sign In");
    By emailField = By.id("email");
    By passwordField = By.id("pass");
    By signInFormButton = By.name("send");
    String validEmail = "veljan.korac@gmail.com";
    String validPassword = "On0mat0peja";
    String welcomeMessage = "Welcome, Veljko Korac!";
    By welcomeTitle = By.xpath("//div[@class='panel header']//span[contains(@class, 'logged-in')]");
    By dropdownButton = By.xpath("//button[@class='action switch']");
    By signOutButton = By.partialLinkText("Sign Out");
    By invalidLogTextError = By.xpath("//div[@for='email']");
    By loginError = By.id("email-error");
    By passwordError = By.id("pass-error");
    
    public void clickSignInButton() {
        click(signInButton);
    }

    public LoginPage login(String username, String password){
        inputText(emailField, username);
        inputText(passwordField, password);
        click(signInFormButton);

        return this;
    }
    

    

    public LoginPage verifyTextIsShowed(){
        getTextFromElement(welcomeTitle);
        return this;

    }
    public LoginPage dropDownButton(){
        click(dropdownButton);
        return this;
    }
    public LoginPage clickSignOutButton(){
        click(signOutButton);
        return this;
    }
    public void verifySignOut(){
        assertElementVisible(signInButton);
        
    }
    public String readText(By elementBy){
        waitForVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public LoginPage verifyInvalidTextError(String expectedErrorMessage){
        String actualErrorMessage = readText(invalidLogTextError);
        assertTextEquals(expectedErrorMessage, actualErrorMessage);
        return this;

    }
    public LoginPage verifyEmptyUser(String expectedErrorForEmpty){
        String actualErrorForEmpty = readText(loginError);
        assertTextEquals(expectedErrorForEmpty,actualErrorForEmpty);
        return this;
    }
    public LoginPage verifyEmptyPassword(String expectedPasswordErrorMessage){
        String actualErrorPasswordMessage = readText(passwordError);
        assertTextEquals(expectedPasswordErrorMessage, actualErrorPasswordMessage);
        return this;
    }
}

