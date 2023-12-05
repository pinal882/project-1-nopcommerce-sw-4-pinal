package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    Homepage homepage = new Homepage();
    BooksPage booksPage = new BooksPage();



    @Test
    //verify the page navigation
    public void verifyPageNavigation () {
        homepage.selectMenu("Books");
        Assert.assertEquals(homepage.getTitleOfPage(), "Books", "Page Navigated Successfully");
    }
}
