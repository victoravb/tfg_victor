package runner.browserManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import runner.ConfigurationReader;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver", ConfigurationReader.getPropertie("firefoxDriverPath"));
        FirefoxOptions options = new FirefoxOptions();
        if(Boolean.parseBoolean(ConfigurationReader.getPropertie("headless"))) {
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-extensions");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            options.addArguments("--window-size=1580,1280");
        }
        options.setAcceptInsecureCerts(Boolean.parseBoolean(ConfigurationReader.getPropertie("acceptInsecureCerts")));
        driver = new FirefoxDriver(options);
    }
}
