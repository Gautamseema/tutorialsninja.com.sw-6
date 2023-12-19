package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {

    }

    @And("I hover on the Desktops tab and click")
    public void iHoverOnTheDesktopsTabAndClick() {
        new HomePage().hoverOnDesktopsTabAndClick();
    }

    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().callSelectMenuMethodAndClick(menu);
    }

    @Then("I can see the text {string}")
    public void iCanSeeTheTextDesktops() {
        Assert.assertEquals(new TopMenuPage().getDesktopsText(), "Desktops", "Error");
    }

    @And("I hover on the Laptops & Notebooks tab and click")
    public void iHoverOnTheLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnlaptopsAndNotebooksAndClick();
        Assert.assertEquals(new LaptopsAndNotebooksPage().getTextFromLaptopsAndNotebooks(), "Laptops & Notebooks", "Error");
    }

    @And("I hover on the Components tab and click")
    public void iHoverOnTheComponentsTabAndClick() {
        new HomePage().hoverOnComponentsAndClick();
    }

    @Then("^I can see the text 'Components'$")
    public void iCanSeeTheTextComponents() {
        Assert.assertEquals(new ComponentsPage().getTextComponents(), "Components", "Error");
    }
}