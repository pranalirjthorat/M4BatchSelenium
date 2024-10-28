package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FactoryMethodForExcelFile {
public static String excelRead(String s, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\FactoryMethod.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(s);
	String data = sheet.getRow(row).getCell(cell).toString();
	return data;
}
	
}
