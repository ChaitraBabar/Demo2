package com.cl.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	

		//Capture ScreenShot 
	public static String capturScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+ "/Screenshots/Amazon_"+getcurrentDateTime()+".png";
		try
		{
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot Captured");
			
		} catch(Exception e)
		{
			System.out.println("Unable To Capture Screenshot "+ e.getMessage());
		}
		return screenshotPath;
	}
	
	public static String getcurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curentDate=new Date();
		return customFormat.format(curentDate);
	}
}
