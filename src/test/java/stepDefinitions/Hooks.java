package stepDefinitions;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import runner.ConfigurationReader;
import runner.browserManager.DriverManager;
import runner.browserManager.DriverManagerFactory;
import runner.browserManager.DriverType;

import com.google.common.io.Files;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class Hooks {

   private static WebDriver driver;
   private static DriverManager driverManager;
   private static long timeout = Long.parseLong(ConfigurationReader.getPropertie("timeout"));

    @Before
    public static void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getPropertie("url"));
    }

    @After (order = 1)
    public void afterStepFailScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(ConfigurationReader.getPropertie("screenshotPath") + screenshotName + ".png");
                Files.copy(sourcePath, destinationPath);

                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
        }
    }
    @After (order = 0)
    public static void tearDown(Scenario scenario) throws IOException {
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
