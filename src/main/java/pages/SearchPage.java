package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performSearch(String query) {
        driver.findElement(By.xpath("//*[@id=\"b\"]/div[2]/div[3]/div/div/div/div/a/i")).click();
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"elementor-popup-modal-74214\"]/div/div[2]/div/section/div/div/div/div/div/form/div/input"));
        searchBox.sendKeys(query);
        searchBox.sendKeys(Keys.ENTER);
    }

    public boolean isResultDisplayed() {
        return !driver.findElements(By.xpath("//*[@id=\"b\"]/div[2]/div[3]/div/div/div/div/a/i")).isEmpty();
    }
}
