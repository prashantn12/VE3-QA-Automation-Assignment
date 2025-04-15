package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToContactForm() {
        // XPath for "Let's Connect" link
        driver.findElement(By.xpath("//*[@id=\"menu-1-9361901\"]/li[9]/a/span")).click();
    }

    public void fillContactForm(String name, String email, String message) {
        driver.findElement(By.xpath("//*[@id=\"00NSq000003CM1R\"]")).sendKeys(name);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/section[1]/div/div[1]/div/div/div/form/p[4]/textarea")).sendKeys(message);
    }

    public void checkConsentBox() {
        driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
    }

    public void submitForm() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/section[1]/div/div[1]/div/div/div/form/p[6]/input")).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(By.xpath("//div[contains(@class,'wpcf7-response-output')]")).isDisplayed();
    }
}
