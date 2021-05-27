package tests;

import libs.api.requestActions.RequestAction;
import libs.utils.Configurator;
import libs.utils.ReadProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

public class BaseTest {
	
	public static String URL, user, password;
	public Logger logger = LogManager.getLogger(BaseTest.class);
	RequestAction requestAction;
	
	@BeforeTest
	@Parameters({"systemPropertiesFile"})
	public void setup(String systemPropertiesFile) {
		ReadProperties readProperties = new ReadProperties(systemPropertiesFile);
		URL = readProperties.getPropValue("URL");
		user = readProperties.getPropValue("user");
		password = readProperties.getPropValue("password");
		Configurator.setConfigurations(URL, user, password);
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method testMethod, ITestContext testContext) {
		String className = testMethod.getDeclaringClass().getSimpleName();
		String methodName = testMethod.getName();
		String testName = testContext.getName();
		logger.info("\n\n:::\nStarting test: " + testName + "." + className + "." + methodName);
	}
	
	
}
