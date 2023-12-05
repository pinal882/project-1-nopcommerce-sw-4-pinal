package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By radioHDD400GB = By.xpath("//input[@id='product_attribute_3_7']");
    By radioOsVistaPremium = By.xpath("//label[text()='Vista Premium [+$60.00]']");
    By commandersoftware = By.xpath("//input[@id='product_attribute_5_12']");
    By totalCommanderRadio = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.xpath("//div[@class='product-price']/span");
    By addtocart = By.xpath("//button[@id='add-to-cart-button-1'] ");
    By actualProductAddedToShoppingCart = By.xpath("//div[@class='bar-notification success']/p");
    By closeButton = By.xpath("//div[@class='bar-notification success']/span");
    By shoppingcart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By gotocart = By.xpath("//button[contains(text(),'Go to cart')]");
    By quantity = By.id("product_enteredQuantity_20");

    public void selectProcessor() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");

    }

    public void selectRam() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
    }

    public void clickRadioHdd() {
        clickOnElement(radioHDD400GB);
    }

    public void clickOnOs() {
        clickOnElement(radioOsVistaPremium);
    }

    public void clickOnSoftwareCommander() {
        clickOnElement(commandersoftware);
    }

    public void clickTotalCommander() {
        clickOnElement(totalCommanderRadio);
    }

    public String getActualPrice() {
        return getTextFromElement(price);
    }

    public void clickOnAddToCart() {
        clickOnElement(addtocart);
    }

    public String verifyProductAddedToCart() {
        return getTextFromElement(actualProductAddedToShoppingCart);
    }

    public void clickCloseButton() {
        clickOnElement(closeButton);
    }

    public void mouseHoverOnShoppingCart() {
        clickOnElement(shoppingcart);
    }

    public void clickOnGoToCart() {
        clickOnElement(gotocart);
    }

    public void clearQuantity() {
        driver.findElement(quantity).clear();
    }

    public void sendQuantity(String inputQuantity) {
        sendTextToElement(quantity, inputQuantity);
    }

}
