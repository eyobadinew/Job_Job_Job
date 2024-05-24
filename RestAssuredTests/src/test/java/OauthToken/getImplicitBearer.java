package OauthToken;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class getImplicitBearer {

	 @Test
		void getUser() {
	    	given()
	    	.auth().oauth2("")
	    	
	    	.formParam("username", "eyob_bizuneh")
	    	.formParam("password", "Welcome1")
	    	 .when()
	    	 .post("https://www.qa.healthgorilla.com/oauth/authorize?response_type=token&client_id=Wtb6V2Cv6GmMCfeW7cAqQWQYbRFPFBaX5n86dJSb&redirect_uri=https%3A%2F%2Fwww.qa.healthgorilla.com%2Fauthcallback")
	    	 .then()
	    	 .statusCode(400)
	    	// .body()
	    	 .log().all();
	    
	    }}