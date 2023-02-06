package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    By productsItems = By.xpath("//li[@class = 'product-item']");
    String HomePageUrl = "https://magento.softwaretestingboard.com/";
    String welcomeText = "Welcome, Veljko Korac!";
    By WhatsNewButton = By.id("ui-id-3");
    By addToCart = By.xpath("//button[@title='Add to Cart']");
    By dropdownButton = By.xpath("//button[@class='action switch']");
    

    public HomePage goToHomePage() {
        driver.get(HomePageUrl);
        return this;
    }

    public HomePage verifyProductsNumber(int expectedNumberOfProducts) {
        int actualNumberOfProducts = countProductItems(productsItems);
        Assert.assertEquals(actualNumberOfProducts, expectedNumberOfProducts);
        return this;
    }
    public HomePage navigateToWhatsNewPage(){
        click(WhatsNewButton);
        return this;
    }
    public HomePage addToCart(){
        click(addToCart);
        return this;
    }
    
}
