package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By welcometext = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By registertab = By.xpath("//button[normalize-space()='Register']");
    public String verifyWelcomeText(){
        return getTextFromElement(welcometext);
    }
    public void clickCheckoutAsGuest()  {

        clickOnElement(checkoutAsGuest);
    }

    public void clickOnRegisterTab(){
        clickOnElement(registertab);
    }
}
