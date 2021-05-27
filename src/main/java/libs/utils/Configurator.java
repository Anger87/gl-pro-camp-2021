package libs.utils;

import libs.data.TestData;

import java.util.HashMap;

public class Configurator {
	public static HashMap<String, String> envConfig;
	public static HashMap<String, String> fileConfig;
	public static HashMap<String, String> dataConfig;
	
	public static void setConfigurations(String fileURL, String fileUser, String filePassword) {
		envConfig = new HashMap<>();
		envConfig.put("URL", System.getenv("URL"));
		envConfig.put("user", System.getenv("user"));
		envConfig.put("password", System.getenv("password"));
		
		fileConfig = new HashMap<>();
		fileConfig.put("URL", fileURL);
		fileConfig.put("user", fileUser);
		fileConfig.put("password", filePassword);
		
		dataConfig = new HashMap<>();
		dataConfig.put("URL", TestData.URL);
		dataConfig.put("user", TestData.user);
		dataConfig.put("password", TestData.password);
	}
	
	
}
