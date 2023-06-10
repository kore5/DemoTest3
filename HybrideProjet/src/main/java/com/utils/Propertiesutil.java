package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Propertiesutil {
	public static String readproperty(String key) throws Exception{
		
		Properties prop =new Properties();
		String path =System.getProperty("user.dir") + "/src/main/resources/config.properties";
		FileInputStream fis =new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(key);
		
	}
//public static void main(String[] args) {
	//String path =System.getProperty("user.dir") + "/src\\main\\resources\\config.properties";

	//System.out.println(path);
}

