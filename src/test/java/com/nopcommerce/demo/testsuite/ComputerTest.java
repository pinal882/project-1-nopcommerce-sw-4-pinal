package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    Homepage homepage = new Homepage();
    DesktopPage desktopPage = new DesktopPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        //1.1 Click on Computer Menu.
        homepage.clickOnComputer();
        //1.2 Click on Desktop
        desktopPage.clickOnDesktop();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortByPosition();
        //1.4 Verify the Product will arrange in Descending order.
        String expectedText = "Name: Z to A";
        String actualText = desktopPage.verifyNameZtoA();
        Assert.assertEquals(actualText, expectedText, "not sorted by name Z to A");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //2.1 Click on Computer Menu.
        homepage.clickOnComputer();
        //2.2 Click on Desktop
        desktopPage.clickOnDesktop();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortByPosition();
        //2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCart();
        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = desktopPage.verifyBuildYourOwnComputerText();
        Assert.assertEquals(actualText, expectedText, "text does not match");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPage.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class.
        productPage.selectRam();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        productPage.clickRadioHdd();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        productPage.clickOnSoftwareCommander();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        productPage.clickTotalCommander();
        //2.11 Verify the price "$1,475.00"
        Assert.assertEquals(productPage.getActualPrice(), "$1,475.00", "Price is not $1,475.00");
        //2.12 Click on "ADD TO CARD" Button.
        productPage.clickOnAddToCart();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top  green Bar. After that close the bar clicking on the cross button.
        Assert.assertEquals(productPage.verifyProductAddedToCart(), "The product has been added to your shopping cart", "Product not added to cart");
        productPage.clickCloseButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCart();
        productPage.clickOnGoToCart();
        //2.15 Verify the message "Shopping cart"
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(), "Shopping cart", "Not on shopping cart");
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.clearQuantity();
        shoppingCartPage.sendQuantity("2");
        shoppingCartPage.clickOnUpdateShoppingCart();
        //2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(shoppingCartPage.verifyTotalPrice(), "$2,950.00", "Price not $2,950.00");
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(signInPage.verifyWelcomeText(), "Welcome, Please Sign In!", "Welcome text not displayed");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickCheckoutAsGuest();
        //2.22 Fill the all mandatory field
        checkoutPage.sendFirstName("abc");
        checkoutPage.sendLastName("sh");
        checkoutPage.sendEmail("abc@gmail.com");
        checkoutPage.selectCountryName("United Kingdom");
        checkoutPage.sendCityName("London");
        checkoutPage.sendAddressName("12 oakfield Road");
        checkoutPage.sendPostCode("NW11AD");
        checkoutPage.sendPhoneNumber("01234567890");
        //2.23 Click on “CONTINUE”
        checkoutPage.clickOnContinueTab();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkoutPage.chooseShipping();
        //2.25 Click on “CONTINUE”
        checkoutPage.clickContinueFromShipping();
        //2.26 Select Radio Button “Credit Card”
        checkoutPage.selectPaymentTypeRadioButton();
        //click continue
        checkoutPage.clickContinueAfterPaymentMethod();
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.selectCardType("Master card");
        //2.28 Fill all the details
        checkoutPage.sendCardholderName("abc");
        checkoutPage.sendCardNumber("5500 0000 0000 0511");
        checkoutPage.selectExpiryMonth("01");
        checkoutPage.selectExpiryYear("2026");
        checkoutPage.sendCVVCode("456");
        //2.29 Click on “CONTINUE”
        checkoutPage.clickContinueAfterBilling();
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(checkoutPage.getTextPaymentMethod(), "Credit Card", "Payment method not credit card");
        //2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(checkoutPage.getTextShippingMethod(), "Next Day Air", "Shipping method not Next Day Air");
        //2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(checkoutPage.getTextExpectedTotalAmount(), "$2,950.00", "total not $2,950.00");
        //2.34 Click on “CONFIRM”
        checkoutPage.clickConfirm();
        //2.35 Verify the Text “Thank You”
        Assert.assertEquals(checkoutPage.getTextThankYou(), "Thank you", "thank you not displayed");
        //2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(checkoutPage.getTextOrderSuccessfullyPlaced(), "Your order has been successfully processed!", "order success message not displayed");
        //2.37 Click on “CONTINUE”
        checkoutPage.clickContinueAfterOrderPlaced();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(homepage.getWelcomeToOurStoreText(), "Welcome to our store", "Welcome text not displayed");
    }
}

