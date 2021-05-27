package libs.utils;


import com.google.gson.Gson;

public class HelpMethods {
	public static String generateRandomString(String prefix, String postfix) {
		return prefix + System.currentTimeMillis() + postfix;
	}
	
	public static String ConvertJavaObjectToJsonString(Object obj) {
		Gson gson = new Gson();
		return gson.toJson(obj);
	}
	
	
}
