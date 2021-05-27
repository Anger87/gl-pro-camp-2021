package libs.api.requestActions.responseClasses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Location {
	public String woeid;
	
	public Location(String woeid) {
		this.woeid = woeid;

	}
	
	public Location() {
		super();
	}
	
	
}
