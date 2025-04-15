package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties prop;

    public ConfigReader() {
        try {
            FileInputStream fis = new FileInputStream("D:\\BridgeLabze\\java-workspace\\practice-problem\\VE3Automation\\src\\main\\java\\config\\ConfigReader.java");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBaseUrl() {
        return prop.getProperty("url");
    }
}
