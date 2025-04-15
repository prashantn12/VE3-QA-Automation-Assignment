# VE3 QA Automation Assignment 🚀

This project is a complete automation framework designed for the VE3 QA Internship assignment. It covers UI automation for VE3's official website using Java, Selenium WebDriver, and TestNG, along with data-driven testing, logging, and detailed reporting.

---

## 🧱 Overview

The goal of this project is to demonstrate automation skills through real-world scenarios:
- Homepage load verification
- Search functionality with valid & invalid inputs
- Contact form submission (valid & invalid data)
- Data-driven testing using Excel
- Screenshots and logs for failures
- HTML reporting (ExtentReports)
- Defect logging & documentation

---

## 💻 Tech Stack Used

| Tool | Purpose |
|------|---------|
| **Java 11+** | Programming Language |
| **Selenium WebDriver 4.10** | Web automation |
| **TestNG** | Test execution framework |
| **Apache POI** | Excel-based Data-Driven Testing |
| **Log4j** | Logging |
| **ExtentReports** | HTML Test Reports |
| **Allure (Optional)** | Additional report generation |

---

## ⚙️ Prerequisites and How to Run

### ✅ Prerequisites
- Java 11 or higher
- Maven installed and configured
- Chrome browser + matching ChromeDriver (placed in `/drivers/`)
- IntelliJ or Eclipse IDE

### ▶️ Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/VE3-QA-Automation-Assignment.git
   cd VE3-QA-Automation-Assignment
2. Run the tests:
   mvn clean test
3. Open the report:
   Navigate to /reports/VE3Report.html to view results
   Screenshots will be saved in /screenshots/


📝 Notes
  ✅ Project follows Page Object Model (POM) for modular and clean design

  ⚠️ The site uses Cloudflare protection, so repeated automation may trigger security blocks. Use your real Chrome profile to avoid this.

  🧪 reCAPTCHA or bot protection might prevent some form submissions — tests are written to handle valid/invalid flows separately

  📌 Test data is managed through an Excel sheet located in test-data/searchData.xlsx

📂 Project Structure
    VE3Automation/
├── src/                  → Java source code (pages, utilities, tests)
├── test-data/            → Excel test data (search terms)
├── reports/              → ExtentReports HTML output
├── screenshots/          → Screenshots for failures
├── resources/            → log4j.properties, extent-config.xml
├── VE3_Test_Case_Document.xlsx
├── VE3_Defect_Report.xlsx
├── pom.xml
└── README.md



