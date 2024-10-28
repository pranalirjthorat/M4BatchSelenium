package Basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.FileUtility.FactroyMethodExcepFile;

public class ReadExcel extends FactroyMethodExcepFile{
	@Test
public  void excel1(String data) throws EncryptedDocumentException, IOException {
	excel("password1");
		
}
}
