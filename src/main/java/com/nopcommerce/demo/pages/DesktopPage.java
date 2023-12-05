package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");

    By dropDownPath = By.xpath("//option[normalize-space()='Name: Z to A']");
    String sortAToZ = "Name (A - Z)";
    String sortZToA = "Name (Z - A)";
    By buildyourowncomputertext = By.xpath("//div[@class='product-name']/h1");
    By addtocart = By.xpath("//div[@data-productid='1']//button[text()='Add to cart']");

//By addtocart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
By nameztoatext = By.xpath("//select[@id='products-orderby']");

    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
    public void clickOnAddToCart(){
        clickOnElement(addtocart);
    }
    public String verifyNameZtoA(){
        return getTextFromElement(nameztoatext);
    }
    public String verifyBuildYourOwnComputerText(){
        return getTextFromElement(buildyourowncomputertext);
    }
    public void clickOnSortByPosition() {
        clickOnElement(dropDownPath);
    }


}

