package libs.api.requestActions;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestAction {
	
	private RequestSpecification requestSpecification;
	
	public RequestAction(String URL) {
		this.requestSpecification = new RequestSpecBuilder()
				.setBaseUri(URL)
				.setContentType(ContentType.JSON)
				.log(LogDetail.ALL)
				.build();
	}
	
	public String locationSearchByName(String name) {
		return given(requestSpecification)
				.pathParam("name", name)
				.get("/login")
				.then()
				.log().all()
				.extract().body()
				.jsonPath().getString("");
	}
	

}
