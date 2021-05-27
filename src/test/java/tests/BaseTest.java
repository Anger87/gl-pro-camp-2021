package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import libs.utils.ReadProperties;

import java.lang.reflect.Method;
import java.util.Properties;

public class BaseTest {
	
	public static String URL;
	public Logger logger = LogManager.getLogger(BaseTest.class);
	Properties property = new ReadProperties().initProperty();
	
	@BeforeTest
	@Parameters({"systemPropertiesFile"})
	public void setup(String systemPropertiesFile) {
		URL = ReadProperties.getPropValue(property, "URL");
	}
	
	@BeforeMethod
	public void beforeMethod(Method testMethod, ITestContext testContext) {
		String className = testMethod.getDeclaringClass().getSimpleName();
		String methodName = testMethod.getName();
		String testName = testContext.getName();
		logger.info("\n\n:::\nStarting test: " + testName + "." + className + "." + methodName);
	}
	
	
}
