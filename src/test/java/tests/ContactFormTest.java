package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.ContactPage;
import utilities.DriverFactory;
import utilities.LoggerHelper;
import utilities.ScreenshotHelper;
import org.apache.log4j.Logger;

public class ContactFormTest {
    WebDriver driver;
    Logger log;
    ContactPage contactPage;

    @BeforeClass
    public void setup() {
        log = LoggerHelper.getLogger(ContactFormTest.class);
        driver = DriverFactory.initDriver();
        contactPage = new ContactPage(driver);
        log.info("Driver initialized for contact form test.");
    }

    @Test(priority = 1)
    public void submitContactFormWithValidData() {
        driver.get("https://www.ve3.global/");
        contactPage.navigateToContactForm();
        contactPage.fillContactForm("Prashant", "prashantnangare0872gmail.com",  "Hello VE3 Team!");
        contactPage.submitForm();
        log.info("Submitted contact form with valid data.");
    }

    @Test(priority = 2)
    public void submitContactFormWithInvalidData() {
        driver.get("https://www.ve3.global/");
        contactPage.navigateToContactForm();
        contactPage.fillContactForm("Prashant", "",  "No email provided test");
        contactPage.submitForm();

        boolean errorShown = contactPage.isErrorDisplayed();
        log.warn("Form submitted with missing email, error shown: " + errorShown);

        assert errorShown : "Expected error message not shown for invalid form.";

        ScreenshotHelper.capture(driver, "invalid_contact_form");
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
        log.info("Driver closed after contact form tests.");
    }
}
