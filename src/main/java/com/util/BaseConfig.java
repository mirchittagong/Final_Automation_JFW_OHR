package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {

	
	public String getConfig(String value) throws Exception{
		
		String filePath =  "./config.properties";
		//convert file into bit stream
		
		FileInputStream fis = new FileInputStream (filePath); 
		Properties pro = new Properties();
		pro.load(fis);
		
		String eachvalue = pro.get(value).toString();
		
		
		return eachvalue;
		
	}

public static void main(String[] args) throws Exception {
	
	BaseConfig obj = new BaseConfig();
	obj.getConfig("URL");
	
}

}
