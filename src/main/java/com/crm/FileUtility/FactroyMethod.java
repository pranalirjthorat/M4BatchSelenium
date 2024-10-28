package com.crm.FileUtility;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FactroyMethod {
public static String propertyFile(String key) throws EncryptedDocumentException, IOException {
	
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("../com.crm.AdvanceSeleniumM4/Configrationfile/Login.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
				
}
		
}
