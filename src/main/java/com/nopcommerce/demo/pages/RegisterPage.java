package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[normalize-space()='Register']");
    By firstname = By.xpath("//input[@id='FirstName']");
    By lastname = By.xpath("//input[@id='LastName']");
    By dateOfBirthDay = By.id("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmpassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerbutton = By.id("register-button");
    By registrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
            By continuetab = By.xpath("//a[normalize-space()='Continue']");
    By shoppingcartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    public String verifyRegisterText(){
        return getTextFromElement(registerText);
    }
    public String enterFirstName(String inputFirstName){
        return getTextFromElement(firstname);
    }
    public String enterLastName(String inputLastName){
        return getTextFromElement(lastname);
    }
    public void enterDateOfBirthDay(String inputDay) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, inputDay);
    }
    public void enterMonthOfBirth(String inputMonth) {
        selectByVisibleTextFromDropDown(monthOfBirth, inputMonth);
    }

    public void enterYearofBirth(String inputYear) {
        selectByVisibleTextFromDropDown(yearOfBirth, inputYear);
    }

    public String enterEmail(String inputEmail){
        return getTextFromElement(email);
    }
    public String enterPassword(String inputPassword){
        return getTextFromElement(password);
    }
    public String confirmPassword(String inputConfirmPassword){
        return getTextFromElement(confirmpassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerbutton);
    }
    public String verifyRegistrationCompleted(){
        return getTextFromElement(registrationCompleted);
    }
    public void clickOnContinueTab(){
        clickOnElement(continuetab);
    }
    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingcartText);

    }
}
