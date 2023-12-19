package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountSteps {
    @Then("^I can see the text 'Register Account'$")
    public void iCanSeeTheTextRegisterAccount() {
        Assert.assertEquals(new MyAccountsPage().getTextRegister(), "Register Account", "Error");
    }

    //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    @And("^I call the method selectMyAccountOptions method with parameter \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodWithParameter(String login) {
        new MyAccountsPage().callSelectMyAccountLoginMethod();
    }

    @And("call the method selectMyAccountOptions method with parameter {string}")
    public void callTheMethodSelectMyAccountOptionsMethodWithParameter1(String arg0) {
        new MyAccountsPage().callSelectMyAccountOptionMethod();
    }

    @And("I call the method selectMyAccountOptions method with parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionsMethodWithParameter2(String arg0) {
        new MyAccountsPage().callSelectMyAccountOptionMethod();
    }

    @And("I can call the method selectMyAccountOptions method with parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0) {
        new MyAccountsPage().callSelectMyAccountOptionMethod();
    }

    @And("I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button")
    public void iEnterFirstNameAndIEnterLastNameAndIEnterEmailAndIEnterTelephoneAndIEnterPasswordAndIEnterPasswordConfirmAndISelectSubscribeYesRadioButtonAndIClickOnPrivacyPolicyCheckBoxAndIClickOnContinueButton() {
        new MyAccountsPage().fillInInformation();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new MyAccountsPage().clickOnContinueButton();
    }

    @And("I click on my Accounts Link.")
    public void iClickOnMyAccountsLink() {
        new MyAccountsPage().clickOnMyAccountLink();
    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Logout”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
      new  MyAccountsPage().callSelectMyAccountLogoutMethod();
    }
    @Then("^I can see the text 'Account Logout'$")
    public void iCanSeeTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountLogOut(), "Account Logout", "Error");
    }
    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        new MyAccountsPage().clickOnContinueButton2();
    }

    @And("I can call the method selectMyAccountOptions method with the parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithTheParameter(String arg0) {
        new MyAccountsPage().callSelectMyAccountLoginMethod();
    }

    @And("I enter Email address and and I enter Password and I click on Login button")
    public void iEnterEmailAddressAndAndIEnterPasswordAndIClickOnLoginButton() {
        new MyAccountsPage().fillInEmailPassword();
    }

    @Then("I can see the text “My Account”")
    public void iCanSeeTheTextMyAccount() {
        Assert.assertEquals(new MyAccountsPage().getTextMyAccount(), "My Account", "Error");
    }

    @And("I click on the My Account Link.")
    public void iClickOnTheMyAccountLink() {
        new MyAccountsPage().clickOnMyAccountLink1();
    }

    @Then("I can see text “Account Logout”")
    public void iCanSeeTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountLogOut(), "Account Logout", "Error");
    }
}
