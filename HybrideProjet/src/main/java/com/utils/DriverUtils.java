package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Baseclass;

public class DriverUtils extends Baseclass{
	

	public static String getScreenshoot(String name) {
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =  ts.getScreenshotAs(OutputType.FILE);
		
		String path =System.getProperty("user.dir")+"/src/main/resources/screenshot/"+name+".jpg";
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
