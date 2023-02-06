package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WhatsNewPage extends BasePage {

    public WhatsNewPage(WebDriver driver) {
        super(driver);
    }

    By phoebeProduct = By.partialLinkText("Phoebe Zipper Sweatshirt");
    By whatsNewButton = By.partialLinkText("What's New");
    By addToCartButton =By.xpath("//button[@title='Add to Cart']");
    By sizeButton = By.id("option-label-size-143-item-167");
    By colorPickButton = By.id("option-label-color-93-item-57");
    By textVerify = By.xpath("//div[@class='messages']");
    By cartButton = By.xpath("//a[@class='action showcart']");
    By redItemCountButton = By.xpath("//span[@class='counter-number']");
    By proceedToCheckOutButton = By.id("top-cart-btn-checkout");
    By emailFieldCheckout = By.id("customer-email");
    String validEmail = "veljan.korac@gmail.com";
    By selectButton = By.id("PNFT5CS");
    By nameField = By.id("NAAYLTU");
    String validName = "Veljko";
    By streetAdressField = By.xpath("//input[@name='street[0]']");
    String adressName = "Dimitrija Tucovica";
    By cityField = By.xpath("//input[@name='city']");
    String cityFieldName = "TorontoTokio";
    By zipPostalCode = By.xpath("//input[@name='postcode']");
    String zipPostal = "11000";
    By phoneNumberField = By.xpath("//input[@name='telephone']");
    String phoneNumber = "6464656667";
    By countrySelectButton = By.id("D6P72OJ");
    By clickNextButton = By.xpath("//button[@class='button action continue primary']");
    By addToCartTextLink = By.partialLinkText("shopping cart");
    By priceVerify = By.xpath("//td[@data-th='Order Total']");
    String expectedPrice = "$59.00";
    By removeItem = By.xpath("//a[@class='action delete']");
    By acceptButton = By.xpath("//button[@class='action-primary action-accept']");
    By proceedToCheckout = By.xpath("//button[@data-role='proceed-to-checkout']");
    By taxFieldVisible = By.id("checkout-shipping-method-load");
    By imgNavigateButton = By.xpath("//a[@class='logo']");
    By priceVerifyTotal = By.xpath("//td[@data-th='Order Total']");
    


    public WhatsNewPage clickWhatsNew() {
        click(whatsNewButton);
        return this;
    }

    public WhatsNewPage scrollTophoebeProduct() {
        scrollToElement(waitForElement(phoebeProduct));
        return this;
    }
    public WhatsNewPage clickAddToCart(){
        click(addToCartButton);
        return this;
    }
    public WhatsNewPage clickSizeButton(){
     click(sizeButton);
     return this;
    }
    public WhatsNewPage clickColorButton(){
        click(colorPickButton);
        return this;
    }
    public WhatsNewPage verifyTextFieldIsVisible(){
    assertElementVisible(textVerify);
    return this;
    }

    public WhatsNewPage clickCartButton(){
        click(cartButton);
        return this;
    }

    public WhatsNewPage waitCartItemIsVisible(){
        waitForVisibility(redItemCountButton);
        return this;
    }
    public WhatsNewPage clickProceedToCheckOut(){
        click(proceedToCheckOutButton);
        return this;
    }
    public WhatsNewPage inputTextEmail(){
        inputText(emailFieldCheckout, validEmail);
        return this;
    }
    public WhatsNewPage waitEmailFieldIsVisible(){
        waitForVisibility(emailFieldCheckout);
        return this;

    }
    public WhatsNewPage selectStateBytton(){
        selectState();
        return this;
    }
    public WhatsNewPage inputNameField(){
        inputText(nameField, validName);
        return this;
    }
    public WhatsNewPage waitForClickBeClickable(){
        waitForVisibility(clickNextButton);
        return this;
    }
    
    
    
    public WhatsNewPage inputFields(){
        inputText(cityField, cityFieldName);
        inputText(zipPostalCode, zipPostal);
        inputText(phoneNumberField, phoneNumber);
        inputText(streetAdressField,adressName );
        return this;
    }
    public WhatsNewPage selectCountryButton (){
        selectCountry();
        return this;

    }
    public WhatsNewPage clickNextButton(){
        click(clickNextButton);
        return this;
    }
    public WhatsNewPage clickAddToCartTextLink(){
        click(addToCartTextLink);
        return this;
    }
    public WhatsNewPage verifyItemPrice(String expectedPrice){
        String actualPrice = readText(priceVerify);
        assertTextEquals(expectedPrice, actualPrice);
        return this;

    
   }
   public WhatsNewPage verifyTotalPrice(String expectedTotalPrice){
        String actualTotalPrice = readText(priceVerifyTotal);
        assertTextEquals(expectedTotalPrice, actualTotalPrice);
        return this;
   }



    public String readText(By elementBy){
        waitForVisibility(elementBy);
        return driver.findElement(elementBy).getText();

    
    }
    public WhatsNewPage clickRemoveButton(){
        click(removeItem);
        return this;
    }
    public WhatsNewPage waitForRemoveButton(){
        waitForVisibility(removeItem);
        return this;
    }
    public WhatsNewPage clickAcceptButton(){
        click(acceptButton);
        return this;
    }
    public WhatsNewPage clickProceedToCheckout(){
        click(proceedToCheckout);
        return this;
    }
    public WhatsNewPage waitTaxFieldVisible(){
        waitForElement(taxFieldVisible);
        return this;

}
    public WhatsNewPage clickOnTaxField(){
        click(taxFieldVisible);
        return this;
    }
    public WhatsNewPage clickImgNavigateButton(){
        click(imgNavigateButton);
        return this;
    }
    public WhatsNewPage waitClickableImage(){
        waitForVisibility(imgNavigateButton);
        return this;
    }
    public WhatsNewPage waitRedButton(){
        waitForVisibility(redItemCountButton);
        return this;
    }
}
    
 

