package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.MacBookPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @And("I click on My Account link")
    public void iClickOnMyAccountLink() {

    }

    @And("I hover on Laptops & Notebooks Tab and click")
    public void iHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
    }

    @And("I click on “Show All Laptops & Notebooks”")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().callSelectMenuMethodAndClick("Show AllLaptops & Notebooks");
    }

    @And("I select Sort By {string}")
    public void iSelectSortBy(String arg0) {
        new LaptopsAndNotebooksPage().clickOnSortByDropDown();
        new LaptopsAndNotebooksPage().selectPriceHighToLowFromDropdown();
    }

    @Then("I can see the Product price will arrange in High to Low order.")
    public void iCanSeeTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().verifyProductsArrangedByPriceHighToLow();
    }

    @And("I select Product {string}")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectProductMacBook();
    }
    @Then("^I can see the text 'MacBook'$")
    public void iCanSeeTheTextMacBook() {
        Assert.assertEquals(new MacBookPage().getTextMacBook(), "MacBook", "Error");
    }


    @And("I click on ‘Add To Cart’ button")
    public void iClickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCartButton();
    }

    @Then("I can see the message {string}")
    public void iCanSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new MacBookPage().getTextSuccess(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Error");
    }

    @And("I click on link {string} displayed into success message")
    public void iClickOnLinkShoppingCartDisplayedIntoSuccessMessage() {
        new MacBookPage().clickLinkShoppingCart();
    }

    @Then("I can able to see the text {string}")
    public void iCanAbleToSeeTheText(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextShoppingCart(), "Shopping Cart  (0.00kg)", "Error");
    }

    @Then("I can able to see the Product name {string}")
    public void iCanAbleToSeeTheProductName(String arg0) {
        Assert.assertEquals(new ShoppingCartPage().getTextMacBook(), "MacBook", "Error");
    }

    @And("I change Quantity to {int}")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCartPage().changeQuantity();
    }

    @And("I click on {string} Tab")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateTab();
    }
    @Then("^I can see the message 'Success: You have modified your shopping cart!'$")
    public void iCanSeeTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().getTextMessage(), "Success: You have modified your shopping cart!\n" +
                "×", "Error");
    }

    @Then("I can see the Total £{double}")
    public void iCanSeeTheTotal£(int arg0, int arg1) {
        Assert.assertEquals(new ShoppingCartPage().getTextTotal1(), "$1,204.00", "Error");
    }

    @And("I click on {string} button")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }
    @Then("^I can see the text 'Checkout'$")
    public void iCanSeeTheTextCheckout() {
        Assert.assertEquals(new ShoppingCartPage().getTextCheckOut(), "Checkout", "Error");
    }

    @Then("I can see the Text {string}")
    public void iCanSeeTheTextNewCustomer() {
        Assert.assertEquals(new ShoppingCartPage().getTextNewCustomer(), "New Customer", "Error");
    }

    @And("I click on {string} radio button")
    public void iClickOnGuestCheckoutRadioButton() {
        new ShoppingCartPage().clickOnGuestCheckOutRadio();
    }

    @And("I click on {string} tab")
    public void iClickOnContinueTab() {
        new ShoppingCartPage().clickOnContinueButton();
    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        new ShoppingCartPage().fillInMandatoryFields();
    }

    @And("I click on {string} Button")
    public void iClickOnContinueButton() {
       new ShoppingCartPage().clickOnContinueButton1();
    }

    @And("I add Comments About your order into text area")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new ShoppingCartPage().addCommentsAboutOrder();
    }

    @And("I check the Terms & Conditions check box")
    public void iCheckTheTermsConditionsCheckBox() {
        new ShoppingCartPage().clickOnTermsAndConditionCheckbox();
    }
    @And("^I click on 'Continue' button$")
    public void iClickOnContinueButton1() {
        new ShoppingCartPage().clickOnContinueButton2();
    }

    @Then("^I can see the message 'Warning: Payment method required!'$")
    public void iCanSeeTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new ShoppingCartPage().getTextWarningMessage(), "Warning: Payment method required!\n" +
                "×", "Error");
    }
}
