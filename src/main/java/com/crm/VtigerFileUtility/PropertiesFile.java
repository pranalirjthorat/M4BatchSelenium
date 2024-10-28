package com.crm.VtigerFileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static String property(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
