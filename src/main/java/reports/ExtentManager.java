package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

public class ExtentManager {
    public static ExtentReports createInstance() throws IOException {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/VE3Report.html");
        reporter.loadXMLConfig("resources/extent-config.xml");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
}
