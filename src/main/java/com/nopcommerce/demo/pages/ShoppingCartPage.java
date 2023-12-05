package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingcarttext = By.xpath("//h1[normalize-space()='Shopping cart']");
    By qty = By.xpath("//input[@class='qty-input']");
    By updateButton = By.xpath("//button[@class='button-2 update-cart-button']");
    By totalprice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By checkbox = By.xpath("//input[@id='termsofservice']");
    By checkout = By.xpath("//button[@id='checkout']");

    public String verifyTextShoppingCart() {
        return getTextFromElement(shoppingcarttext);
    }

    public String verifyQty() {
        return getTextFromElement(qty);
    }

    public void sendQuantity(String quantityNum) {
        sendTextToElement(qty, quantityNum);
    }

    public void clearQuantity() {
        driver.findElement(qty).clear();
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateButton);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(totalprice);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkbox);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkout);
    }

    public String getQuantity() {
        return driver.findElement(qty).getAttribute("value");
    }
}
