package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FactroyMethodExcepFile {

	public static String excel(String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\FactoryMethod.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		if(data.equalsIgnoreCase("email")) {
			sheet.getRow(0).getCell(0).toString();
		}
		else if(data.equalsIgnoreCase("password1")) {
			sheet.getRow(0).getCell(1).toString();
			System.out.println(data);
		}
		else if(data.equalsIgnoreCase("email2")) {
			sheet.getRow(1).getCell(0).toString();
		}
		else if(data.equalsIgnoreCase("password2")) {
			sheet.getRow(1).getCell(1).toString();
		}
		return data;
	}
}
