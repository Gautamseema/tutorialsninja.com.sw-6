package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {

    @Then("I select sort by Name Z to A")
    public void iSelectSortByNameZToA() {
        new DesktopsPage().selectPositionByZtoA();
    }

    @And("I can see the products displayed in Descending order")
    public void iCanSeeTheProductsDisplayedInDescendingOrder() {
        String actualText = new DesktopsPage().getAllProductNameText();
        Assert.assertEquals(actualText, "Product will arrange Descending order");
    }
    @When("I mouse hover and click on desktop tab")
    public void iMouseHoverAndClickOnDesktopTab() {
            new DesktopsPage().mouseHoverOnDesktopLinkAndClick();
        }
    @And("I select currency {string}")
    public void iSelectCurrency1(String currency) {
        new DesktopsPage().MouseHoverOnCurrencyDropdownAndClick();
    }


    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops1() {
        new DesktopsPage().clickOnShowAllDesktops();

    }

    @And("I click on sort by position")
    public void iClickOnSortByPosition() {
        new DesktopsPage().selectPositionByAtoZ();
    }
    @And("I select product “<product>”")
    public void iSelectProductProduct() {
        new DesktopsPage().clickOnShowAllDesktops();
    }

    @And("I select product sort by {string}")
    public void iSelectProductSortBy(String arg0) {
    }

    @Then("I should see product arrange in alphabetical order successfully")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
    }

    @And("I select currency {string}")
    public void iSelectCurrency(String arg0) {
        new DesktopsPage().MouseHoverOnCurrencyDropdownAndClick();
    }
    @And("I click on show all desktops")
    public void iClickOnShowAllDesktops() {
        new DesktopsPage().clickOnShowAllDesktops();
    }

    @And("I select product {string}")
    public void iSelectProduct(String arg0) {
        new DesktopsPage().clickOnShowAllDesktops();
    }

    @Then("Verify the Text {string} is displayed")
    public void verifyTheTextIsDisplayed(String arg0) {
    }

    @And("I add quantity {int} for product using Select class.")
    public void iAddQuantityForProductUsingSelectClass(int arg0) {
        new DesktopsPage().enterQuantity();
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new DesktopsPage().clickOnAddToCart();
    }

    @And("Verify the Message {string}")
    public void verifyTheMessage(String arg0) {
        String actualText1 = new DesktopsPage().getSuccessText();
        Assert.assertEquals(actualText1, "Success: You have added “<product>” to your shopping cart!");

    }

    @And("I click on shopping cart button")
    public void iClickOnShoppingCartButton() {
        new DesktopsPage().clickOnShoppingCart1();
    }

    @Then("I should see shopping cart text")
    public void iShouldSeeShoppingCartText() {
        String actualText2 = new DesktopsPage().clickOnShoppingCart();
        Assert.assertEquals(actualText2, "Shopping Cart");
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String arg0) {
        String actualText3 = new DesktopsPage().verifyProductName();
        Assert.assertEquals(actualText3, "Product name");
    }


    @And("Verify the Model {string}")
    public void verifyTheModel(String arg0) {
        String actualText4 = new DesktopsPage().verifyModel();
        Assert.assertEquals(actualText4, "model");
    }

    @And("Verify the Total {string}")
    public void verifyTheTotal(String arg0) {
        String actualText5 = new DesktopsPage().verifyTotal();
        Assert.assertEquals(actualText5, "total");
    }
}
