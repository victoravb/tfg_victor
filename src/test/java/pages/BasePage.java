package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    private static WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public static void clickOnElement(By element) throws Exception {
        try{
            driver.findElement(element).click();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static void clickOnElement(WebElement element) throws Exception {
        try{
            element.click();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static void doubleClickOnElement(By element) throws Exception {
        try{
            Actions actions = new Actions(driver);
            actions.doubleClick(driver.findElement(element)).perform();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static void doubleClickOnElement(WebElement element) throws Exception {
        try{
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static void rightClickOnElement(By element) throws Exception {
        try{
            Actions actions = new Actions(driver);
            actions.contextClick(driver.findElement(element)).perform();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static void rightClickOnElement(WebElement element) throws Exception {
        try{
            Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
        } catch (Exception e){
            throw new Exception("Element was not clickable: " + element);
        }
    }

    public static boolean isDisplayed(By element) throws Exception {
        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static boolean isDisplayed(WebElement element) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        } catch (Exception e){
            throw new Exception("No text returned for element: " + element);
        }
    }

    public static String getText(WebElement element) throws Exception {
        try{
            return element.getText();
        } catch (Exception e){
            throw new Exception("No text returned for element: " + element);
        }
    }

    public static void sendKeys(By element, String text) throws Exception {
        try{
            driver.findElement(element).sendKeys(text);
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static void sendKeys(WebElement element, String text) throws Exception {
        try {
            element.sendKeys(text);
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static void mouseOverElement(By element) throws Exception {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(element));
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static void mouseOverElement(WebElement element) throws Exception {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(element);
        } catch (Exception e){
            throw new Exception("Element was not displayed: " + element);
        }
    }

    public static void selectOptionByTextInDropdown(By element, String text) throws Exception{
        try {
            Select dropdown = new Select(driver.findElement(element));
            dropdown.selectByVisibleText(text);
        } catch (Exception e){
            throw new Exception("Dropdown was not displayed: " + element);
        }
    }

    public static void selectOptionByTextInDropdown(WebElement element, String text) throws Exception{
        try {
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(text);
        } catch (Exception e){
            throw new Exception("Dropdown was not displayed: " + element);
        }
    }

    public static void selectOptionByValueInDropdown(By element, String value) throws Exception{
        try {
            Select dropdown = new Select(driver.findElement(element));
            dropdown.selectByVisibleText(value);
        } catch (Exception e){
            throw new Exception("Dropdown was not displayed: " + element);
        }
    }

    public static void selectOptionByValueInDropdown(WebElement element, String value) throws Exception{
        try {
            Select dropdown = new Select(element);
            dropdown.selectByValue(value);
        } catch (Exception e){
            throw new Exception("Dropdown was not displayed: " + element);
        }
    }

    public static boolean isSelected(By element) throws Exception {
        return driver.findElement(element).isSelected();
    }

    public static boolean isSelected(WebElement element) throws Exception {
        return element.isSelected();
    }

    public static void markAsSelected(By element) throws Exception {
        driver.findElement(element).click();
    }

    public static void markCheckboxAsSelected(WebElement element) throws Exception {
        element.click();
    }

    public static void back() throws Exception {
        driver.navigate().back();
    }

    public static void forward() throws Exception {
        driver.navigate().forward();
    }

    public static void refreshPage() throws Exception {
        driver.navigate().refresh();
    }

    public static void navigateTo(String url) throws Exception {
        driver.get(url);
    }

    public static String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public static String getTitle() throws Exception {
        try{
            return driver.getTitle();
        } catch (Exception e){
            throw new Exception("Title was unobtainable");
        }
    }








}
