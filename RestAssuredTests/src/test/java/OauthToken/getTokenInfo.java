package OauthToken;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class getTokenInfo {

	@Test
	void getUser() {
    	given()
    	.auth().oauth2("")
    	
    	 .when()
    	 .get("https://api.qa.healthgorilla.com/oauth/info?access_token=bcdc2d7098d0bae6282228decaec4a6f")
    	 .then()
    	 .statusCode(200)
    	 .body("user_id",equalTo("063e946057a62f75d26e16f3"), "client_name",equalTo("Eyob R4"),"client_id",equalTo("Wtb6V2Cv6GmMCfeW7cAqQWQYbRFPFBaX5n86dJSb"))
    	 .log().all();
    
    }
}