package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleDataReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.out.println("Multiple data reading...");
		FileInputStream fis = new FileInputStream("D:\\AutomationExcel\\DataDrivan.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
		Thread.sleep(1000);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				String data = sheet.getRow(i).getCell(j).toString();				
				System.out.println(data);
				Thread.sleep(1500);
			}
		}
		
	}

}
