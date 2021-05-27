package libs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	private Properties property;
	
	public ReadProperties(String propFileName) {
		Properties property = null;
		try {
			FileInputStream fis;
			property = new Properties();
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/configuration/" + propFileName);
			property.load(fis);
		} catch (IOException e) {
			System.err.println("Error: properties file is absent");
		}
		this.property = property;
	}
	
	
	public String getPropValue(String propName) {
		return property.getProperty(propName);
	}
	
}
