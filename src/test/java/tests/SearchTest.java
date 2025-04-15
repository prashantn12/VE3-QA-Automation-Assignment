package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.SearchPage;
import utilities.DriverFactory;
import utilities.LoggerHelper;
import org.apache.log4j.Logger;

public class SearchTest {
    WebDriver driver;
    Logger log;

    @BeforeClass
    public void setup() {
        log = LoggerHelper.getLogger(SearchTest.class);
        driver = DriverFactory.initDriver();
        log.info("Driver initialized for search test.");
    }

    @Test
    public void verifySearchWithValidInput() {
        driver.get("https://www.ve3.global/");
        log.info("Opened VE3 homepage for search test.");

        SearchPage searchPage = new SearchPage(driver);
        searchPage.performSearch("cloud");
        log.info("Performed search with keyword: cloud");

        boolean resultShown = searchPage.isResultDisplayed();
        log.info("Search result shown: " + resultShown);

        assert resultShown : "Search result was not displayed.";
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
        log.info("Driver closed after search test.");
    }
}
