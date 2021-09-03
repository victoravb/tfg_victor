package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    @FindBy(id = "doubleClickBtn")
    static WebElement doubleClickButton;
    @FindBy(id = "rightClickBtn")
    static WebElement rightClickButton;
    @FindBy(id = "191aB")
    static WebElement dinamycClickButton;
    @FindBy(id = "doubleClickMessage")
    static WebElement doubleClickMessage;
    @FindBy(id = "rightClickMessage")
    static WebElement rightClickMessage;
    @FindBy(id = "dynamicClickMessage")
    static WebElement dynamicClickMessage;

    @FindBy(id = "userName")
    static WebElement usernameField;
    @FindBy(id = "userEmail")
    static WebElement emailField;
    @FindBy(id = "currentAddress")
    static WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    static WebElement permanentAddressField;
    @FindBy(id = "submit")
    static WebElement submitButton;

    @FindBy(id = "name")
    static WebElement name;
    @FindBy(id = "email")
    static WebElement email;
    @FindBy(id = "currentAddress")
    static WebElement currentAddress;
    @FindBy(id = "permanentAddress")
    static WebElement permanentAddress;

    public ElementsPage(WebDriver driver){
        super(driver);
    }

    public static void doubleClickOnButton() throws Exception {
        BasePage.doubleClickOnElement(doubleClickButton);
    }

    public static void rightClickOnButton() throws Exception {
        BasePage.rightClickOnElement(rightClickButton);
    }

    public static void dynamicClickOnButton() throws Exception {
        BasePage.clickOnElement(dinamycClickButton);
    }

    public static boolean doubleClickMessageIsDisplayed() throws Exception {
        return BasePage.isDisplayed(doubleClickMessage);
    }

    public static boolean rightClickMessageIsDisplayed() throws Exception {
        return BasePage.isDisplayed(rightClickMessage);
    }

    public static boolean dynamicClickMessageIsDisplayed() throws Exception {
        return BasePage.isDisplayed(dynamicClickMessage);
    }

    public static void fullfillFullNameField(String fullName) throws Exception {
        BasePage.sendKeys(usernameField, fullName);
    }

    public static void fullfillEmailField(String email) throws Exception {
        BasePage.sendKeys(emailField, email);
    }

    public static void fullfillCurrentAddressField(String currentAddress) throws Exception {
        BasePage.sendKeys(currentAddressField, currentAddress);
    }

    public static void fullfillPermanentAddressField(String permanentAddress) throws Exception {
        BasePage.sendKeys(permanentAddressField, permanentAddress);
    }

    public static void clickOnSubmitButton() throws Exception {
        BasePage.clickOnElement(submitButton);
    }

    public static boolean checkSubmitDataSuccess() throws Exception {
        return BasePage.isDisplayed(name) && BasePage.isDisplayed(email) && BasePage.isDisplayed(currentAddress) && BasePage.isDisplayed(permanentAddress);
    }
}
