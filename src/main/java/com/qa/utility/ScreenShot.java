package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	
	
	public static void scrnshot(WebDriver driver , String filename) throws IOException {
		
		
		TakesScreenshot srcnshot = (TakesScreenshot)driver;
		
		File objsrcFile = srcnshot.getScreenshotAs(OutputType.FILE);
		
		File objTargetfile = new File("/Users/rahulbashanapelli/Desktop/ScreenshotsSelenium/"+filename+".png");
		
		Files.copy(objsrcFile, objTargetfile);
		
	}

}
