package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class BaseSteps {

    protected WebDriver driver = Hooks.getDriver();
    protected ElementsPage elementsPage = PageFactory.initElements(driver, ElementsPage.class);

}
