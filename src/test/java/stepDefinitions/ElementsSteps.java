package stepDefinitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.BasePage;
import pages.ElementsPage;

public class ElementsSteps extends BaseSteps {

    @Given("^User access to \"([^\"]*)\" website$")
    public void userAccessToWebsite(String url) throws Throwable {
        BasePage.navigateTo(url);
        Assert.assertEquals("No se ha podido acceder a la url: " + url, url, BasePage.getCurrentUrl());
    }

    @Given("^User double click on the Double Click Me button$")
    public void userDoubleClickOnTheDoubleClickMeButton() throws Throwable {
        ElementsPage.doubleClickOnButton();
    }

    @Given("^User right click on the Right Click Me button$")
    public void userRightClickOnTheRightClickMeButton() throws Throwable {
        ElementsPage.rightClickOnButton();
    }

    @Given("^User click on the Click Me button$")
    public void userClickOnTheClickMeButton() throws Throwable {
        ElementsPage.dynamicClickOnButton();
    }

    @Then("^the message You have done a double click is displayed$")
    public void theMessageYouHaveDoneADoubleClickIsDisplayed() throws Throwable {
        Assert.assertTrue(ElementsPage.doubleClickMessageIsDisplayed());
    }

    @Then("^the message You have done a right click is displayed$")
    public void theMessageYouHaveDoneARightClickIsDisplayed() throws Throwable {
        Assert.assertTrue(ElementsPage.rightClickMessageIsDisplayed());
    }

    @Then("^the message You have done a dynamic click is displayed$")
    public void theMessageYouHaveDoneADynamicClickIsDisplayed() throws Throwable {
        Assert.assertTrue(ElementsPage.dynamicClickMessageIsDisplayed());
    }

    @Given("^User fulfill the Full Name field with \"([^\"]*)\"$")
    public void userFulfillTheFullNameFieldWith(String fullname) throws Throwable {
        ElementsPage.fullfillFullNameField(fullname);
    }

    @Given("^User fultill the Email field with \"([^\"]*)\"$")
    public void userFultillTheEmailFieldWith(String email) throws Throwable {
        ElementsPage.fullfillEmailField(email);
    }

    @Given("^User fulfill the Current Address field \"([^\"]*)\"$")
    public void userFulfillTheCurrentAddressField(String currentAddress) throws Throwable {
        ElementsPage.fullfillCurrentAddressField(currentAddress);
    }

    @Given("^User fulfill the Permanent Address Field \"([^\"]*)\"$")
    public void userFulfillThePermanentAddressField(String permanentAddress) throws Throwable {
        ElementsPage.fullfillPermanentAddressField(permanentAddress);
    }

    @Then("^User click on the Submit button$")
    public void userClickOnTheSubmitButton() throws Throwable {
        ElementsPage.clickOnSubmitButton();
        Assert.assertTrue(ElementsPage.checkSubmitDataSuccess());
    }
}
