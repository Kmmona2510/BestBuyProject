package utilis;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreportecommerce {

			public static ExtentReports getreport() {
			
			//Create a Physical Report
			String path ="C:\\Users\\MOORTHI\\eclipse-workspace\\E-Commerce\\reports\\Ecommerce.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("Ecommerce Report");
			
			//Add automation data to physical report
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(reporter);
			
			return extent;
		}


	}


