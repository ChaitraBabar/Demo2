package com.cl.utility;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTest {
	
	@Test
    public void loginPage() throws IOException
    {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/automation_learn"+getcurrentDateTime()+".html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger = extent.createTest("Sign In");
        logger.log(Status.INFO, "Login to Amazon");
        logger.log(Status.PASS, "Title verified");
        logger.pass("Pass",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Chaitra.babar/Desktop/AmazonLogo.jpg").build());
        extent.flush();
        
        ExtentTest logger2 = extent.createTest("Sign out");
        logger2.log(Status.FAIL, "Title verified");
        logger2.fail("Failed beacuse of some issues",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Chaitra.babar/Desktop/AmazonLogo.jpg").build());
      // logger2.addScreenCaptureFromPath("/Users/Chaitra.babar/Desktop/AmazonLogo.jpg");
        extent.flush();


    }
	
	public static String getcurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curentDate=new Date();
		return customFormat.format(curentDate);
	}
}
