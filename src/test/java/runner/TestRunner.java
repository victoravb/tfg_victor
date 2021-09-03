package runner;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("stepDefinitions"),
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/report.html"},
        snippets = SnippetType.CAMELCASE
)

public class TestRunner {
    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(ConfigurationReader.getReportConfigPath()));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.7.1");
        Reporter.setSystemInfo("Maven", "4.0.0");
        Reporter.setSystemInfo("Java Version", "1.7");
    }
}
