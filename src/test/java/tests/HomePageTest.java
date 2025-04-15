package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.HomePage;
import reports.ExtentManager;
import reports.ExtentTestManager;
import utilities.DriverFactory;
import utilities.LoggerHelper;
import org.apache.log4j.Logger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.IOException;

public class HomePageTest {
    WebDriver driver;
    Logger log;
    ExtentReports extent;

    @BeforeClass
    public void setup() throws IOException {
        extent = ExtentManager.createInstance();
        driver = DriverFactory.initDriver();
        log = LoggerHelper.getLogger(HomePageTest.class);
    }

    @Test
    public void verifyHomePageLoads() {
        ExtentTest test = extent.createTest("Verify Homepage Title");
        ExtentTestManager.setTest(test);

        driver.get("https://www.ve3.global/");
        String title = new HomePage(driver).getPageTitle();
        test.info("Page Title: " + title);
        assert title.contains("VE3");
    }

    @AfterClass
    public void tearDown() {
        extent.flush();
        DriverFactory.quitDriver();
    }
}
