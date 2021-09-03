package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "menu-item-2008")
    public WebElement titleComicsLocator;
    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception{
        this.clickOnElement(titleComicsLocator);
    }
}
