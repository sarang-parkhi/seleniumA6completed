package JavaUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	public static String loginData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".//src/test/resources/propertiesfile.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
