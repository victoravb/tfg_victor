package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.*;

public class BaseSteps {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected ComicPage comicPage = PageFactory.initElements(driver, ComicPage.class);
    protected ElementsPage elementsPage = PageFactory.initElements(driver, ElementsPage.class);
    protected FormsPage formsPage = PageFactory.initElements(driver, FormsPage.class);


}
