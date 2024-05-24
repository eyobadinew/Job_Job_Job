package OauthToken;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class revokeToken {
  @Test
	void getUser() {
    	given()
    	.auth().oauth2("a24f067d96e7678bcbf49d5bb6d44fd3")
    	
    	 .when()
    	 .get("https://api.qa.healthgorilla.com/oauth/cancel?token=a24f067d96e7678bcbf49d5bb6d44fd3")
    	 .then()
    	 .statusCode(200)
    	// .body()
    	 .log().all();
    
    }
}
