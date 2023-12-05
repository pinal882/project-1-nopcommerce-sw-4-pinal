package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Electronics extends TestBase {
    Homepage homepage = new Homepage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        //1.1 Mouse Hover on “Electronics” Tab
        homepage.mouseHoverOnElectronicsTab();
        //1.2 Mouse Hover on “Cell phones” and click
        cellPhonePage.mouseHoverAndClickOnCellPhone();
        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText,expectedText,"cell phones text not matching");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        homepage.mouseHoverOnElectronicsTab();
        //2.2 Mouse Hover on “Cell phones” and click
        cellPhonePage.mouseHoverAndClickOnCellPhone();
        //2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonePage.getCellPhoneText();
        Assert.assertEquals(actualText,expectedText,"cell phones text not matching");
        //2.4 Click on List View Tab
cellPhonePage.clickOnListViewTab();
Thread.sleep(5000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedText1 = "Nokia Lumia 1020";
String actualText1 = cellPhonePage.getNokiaLumiaText();
Assert.assertEquals(actualText1,expectedText1,"text not matching");
        //2.7 Verify the price “$349.00”
        String expectedText2 = "$349.00";
        String actualText2 = cellPhonePage.verifyPrice();
        Assert.assertEquals(actualText2,expectedText2, "Price not matching");
        //2.8 Change quantity to 2
       // cellPhonePage.changeQty();
        productPage.clearQuantity();
        productPage.sendQuantity("2");
        //2.9 Click on “ADD TO CART” tab
        cellPhonePage.clickOnAddToCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText3 = "The product has been added to your shopping cart";
String actualText3 = cellPhonePage.verifyText();
Assert.assertEquals(actualText3,expectedText3,"message not matching");
        //After that close the bar clicking on the cross button.
        cellPhonePage.closeCrossButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonePage.mouseHoverOnShoppingCart();
        cellPhonePage.clickOnGoToCart();
        //2.12 Verify the message "Shopping cart"
        String expectedText4 = "Shopping cart";
        String actualText4 = shoppingCartPage.verifyTextShoppingCart();
        Assert.assertEquals(actualText4,expectedText4,"message not matching");
        //2.13 Verify the quantity is 2
        Assert.assertEquals(shoppingCartPage.getQuantity(), "2", "Quantity not 2");
        //2.14 Verify the Total $698.00
        String expectedText6 = "$698.00";
        String actualTetx6 = shoppingCartPage.verifyTotalPrice();
        Assert.assertEquals(actualTetx6,expectedText6,"price does not match");
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText7 = "Welcome, Please Sign In!";
        String actualText7 = signInPage.verifyWelcomeText();
        Assert.assertEquals(actualText7,expectedText7,"welcome text does not match");
        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterTab();
        //2.19 Verify the text “Register”
        String expectedText8 = "Register";
        String actualText8 = registerPage.verifyRegisterText();
        Assert.assertEquals(actualText8,expectedText8,"Register text does not match");
        //2.20 Fill the mandatory fields
        Thread.sleep(1000);
        registerPage.enterFirstName("abc");
        Thread.sleep(2000);
        registerPage.enterLastName("ch");
        Thread.sleep(1000);
        registerPage.enterEmail("abc3@gmail.com");
        Thread.sleep(1000);
        registerPage.enterPassword("abc123");
        Thread.sleep(1000);
        registerPage.confirmPassword("abc123");
        Thread.sleep(1000);
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        //2.22 Verify the message “Your registration completed”
        String expectedText9 = "Your registration completed";
        String actualText9 = registerPage.verifyRegistrationCompleted();
        Assert.assertEquals(actualText9,expectedText9,"registration successfull");
        //2.23 Click on “CONTINUE” tab
registerPage.clickOnContinueTab();
        //2.24 Verify the text “Shopping card”
        String expectedText10 = "Shopping cart";
        String actualText10 = registerPage.verifyShoppingCartText();
        Assert.assertEquals(actualText10,expectedText10,"text does not match");
        //2.25 click on checkbox “I agree with the terms of service”
shoppingCartPage.clickOnCheckBox();
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        //2.27 Fill the Mandatory fields
        //2.28 Click on “CONTINUE”
        checkoutPage.clickOnCheckout();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
checkoutPage.clickOnRadioButton();
        //2.30 Click on “CONTINUE”
        checkoutPage.clickOnContinueTab();
        //2.31 Select Radio Button “Credit Card”
checkoutPage.clickOnRadiobuttonCreditCard();
checkoutPage.clickOnContinueTab();
        //2.32 Select “Visa” From Select credit card dropdown
//checkoutPage.selectVisaCardFromDropDown();
//2.33 Fill all the details
        //2.34 Click on “CONTINUE”
        //2.35 Verify “Payment Method” is “Credit Card”
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        //2.37 Verify Total is “$698.00”
        //2.38 Click on “CONFIRM”
        //2.39 Verify the Text “Thank You”
        //2.40 Verify the message “Your order has been successfully processed!”
        //2.41 Click on “CONTINUE”
        //2.42 Verify the text “Welcome to our store”
        //2.43 Click on “Logout” link
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
    }


}
