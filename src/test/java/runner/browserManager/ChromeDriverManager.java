package runner.browserManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import runner.ConfigurationReader;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", ConfigurationReader.getPropertie("chromeDriverPath"));
        ChromeOptions options = new ChromeOptions();
        if(Boolean.parseBoolean(ConfigurationReader.getPropertie("headless"))) {
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-extensions");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--headless");
            options.addArguments("--window-size=1580,1280");
        }
        options.setAcceptInsecureCerts(Boolean.parseBoolean(ConfigurationReader.getPropertie("acceptInsecureCerts")));
        driver = new ChromeDriver(options);
    }
}
