package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadFromProperties {
@Test
	public void login() throws IOException, InterruptedException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("../com.crm.AdvanceSeleniumM4/Configrationfile/DWSlogin.properties");
	prop.load(fis);
	String browser = prop.getProperty("browser");
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	System.out.println(browser);
	Thread.sleep(1000);
	System.out.println(url);
	Thread.sleep(1000);
	System.out.println(email);
	Thread.sleep(1000);
	System.out.println(password);
	Thread.sleep(1000);
	
	}

}
