package tests;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.SearchPage;
import utilities.DriverFactory;
import java.io.File;
import java.io.FileInputStream;

public class SearchDDTTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.initDriver();
    }

    @Test
    public void runSearchFromExcel() throws Exception {
        FileInputStream fis = new FileInputStream("D:\\BridgeLabze\\java-workspace\\practice-problem\\VE3Automation\\test-data\\searchData.xlsx");
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);

        for (Row row : sheet) {
            String keyword = row.getCell(0).getStringCellValue();
            driver.get("https://www.ve3.global/");
            SearchPage search = new SearchPage(driver);
            search.performSearch(keyword);
            assert search.isResultDisplayed();
        }

        wb.close();
        fis.close();
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
