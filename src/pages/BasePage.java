package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        action = new Actions(driver);

    }

    
    public BasePage selectState(){
    Select drpCountry = new Select(waitForElement(By.name("region_id")));
    drpCountry.selectByVisibleText("Georgia");
    return this;
    }

    public BasePage selectCountry(){
    Select drpCountry = new Select(waitForElement(By.name("country_id")));
    drpCountry.selectByVisibleText("Serbia");
    return this;

    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void hoverElement(WebElement element) {
        action.moveToElement(element);
    }

    public WebElement waitForElement(By elementBy) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public void waitForVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public String getTextFromElement(By elementBy) {
        waitForVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void inputText(By elementBy, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void assertTextEquals(String expectedText, String actualText) {
        Assert.assertEquals(expectedText, actualText);
    }

    public void assertElementVisible(By elementBy) {
        boolean isVisible = driver.findElement(elementBy).isDisplayed();
        Assert.assertTrue(isVisible);
    }

    public int countProductItems(By elementBy) {
        waitForVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }

    public void click(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).click();
    }
   

}