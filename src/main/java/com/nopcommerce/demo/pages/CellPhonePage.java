package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By cellphone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellphonetext = By.xpath("//h1[normalize-space()='Cell phones']");
    By listview = By.xpath("//a[normalize-space()='List']");
    By nokialumia = By.xpath("//a[normalize-space()='Nokia Lumia 1020']");
    By nokialumiatext = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By price = By.xpath("//span[@id='price-value-20']");
    By changeqty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addtocart = By.xpath("//button[@id='add-to-cart-button-20']");
    By text = By.xpath("//p[@class='content']");
    By crossbutton = By.xpath("//span[@title='Close']");
    By shoppingcart = By.xpath("//span[@class='cart-label']");
    By gotocart = By.xpath("//button[normalize-space()='Go to cart']");
    public void mouseHoverAndClickOnCellPhone(){
        mouseHoverToElementAndClick(cellphone);
    }
    public String  getCellPhoneText(){
        return getTextFromElement(cellphonetext);
    }
    public void clickOnListViewTab(){
        clickOnElement(listview);
    }
    public void clickOnNokiaLumia(){
        clickOnElement(nokialumia);
    }
    public String getNokiaLumiaText(){
        return getTextFromElement(nokialumiatext);

    }
    public String verifyPrice(){
        return getTextFromElement(price);
    }
    public void changeQty(){
        clickOnElement(changeqty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addtocart);
    }
    public String verifyText(){
        return getTextFromElement(text);
    }
    public void closeCrossButton(){
        clickOnElement(crossbutton);
    }
    public void mouseHoverOnShoppingCart(){
       mouseHoverToElement(shoppingcart);
    }
public void clickOnGoToCart(){
        clickOnElement(gotocart);
}
}


