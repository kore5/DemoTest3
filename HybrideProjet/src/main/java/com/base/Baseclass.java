package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.Propertiesutil;

public class Baseclass {

	public static WebDriver driver = null;
	public static ExtentReports report = null;
	public static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;

	public static void initialization() throws Exception {
//String browser = Propertiesutil.readproperty("browser");
		String browser = Propertiesutil.readproperty("browser");
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(Propertiesutil.readproperty("url"));
		driver.manage().window().maximize();

	}

	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport.html");

		report.attachReporter(spark);
	}
}
