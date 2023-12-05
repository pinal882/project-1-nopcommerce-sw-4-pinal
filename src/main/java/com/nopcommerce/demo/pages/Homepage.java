package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends Utility {
    By headerMenu = By.xpath("//div[@class = 'header-menu']/ul/li");

    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By welcomeToOurStoreText = By.xpath("//div[@class='topic-block-title']/h2");
    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    // get all Desktop product name without filter
    By productName = By.xpath("//div[@class='item-grid']//h2");
    //Get all product name
    By getAllTopManu = By.xpath("//ul[@class='top-menu notmobile']//li");
    By pageTitle = By.xpath("//div[@class='page-title']");

    By cellPhonesTab = By.xpath("//ul[@class='top-menu notmobile']/li/ul[@class='sublist first-level']/li/a[text()='Cell phones ']");
    //get product name without filter
    public List<WebElement> getProductNameWithoutFilter() {
        List<WebElement> getProductName = driver.findElements(productName);
        return getProductName;
    }

    public void clickOnComputer() {
        clickOnElement(computer);
    }

    public void mouseHoverOnElectronicsTab() {
        mouseHoverToElement(electronics);
    }

    public void clickOnCellPhones() {
        clickOnElement(cellPhonesTab);
    }
    public String getProductName() {
        return getTextFromElement(getAllTopManu);

    }
    public String getWelcomeToOurStoreText() {
        return getTextFromElement(welcomeToOurStoreText);
    }
    public String getTitleOfPage() {
        return getTextFromElement(pageTitle);
    }

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(headerMenu);
        try {
            //loop through list with for loop
            for (WebElement menuOption : menuList) {
                System.out.println(menuOption.getText());
                //if option matches with the parameter then click
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
            //catch exceptions
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(headerMenu);
        }
    }
}

