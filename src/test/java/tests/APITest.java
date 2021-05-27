package tests;

import libs.api.requestActions.RequestAction;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class APITest extends BaseTest {
	
	@BeforeClass
	public void beforeClass() {
		requestAction = new RequestAction(BaseTest.URL);
	}
	
	@Test
	public void test1() {
	
	}
	
}