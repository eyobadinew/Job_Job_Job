package OauthToken;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
public class getUserInfo {
  @Test
	void getUser() {
    	given()
    	.auth().oauth2("")
    	
    	 .when()
    	 .get("https://api.qa.healthgorilla.com/oauth/userinfo?access_token=bcdc2d7098d0bae6282228decaec4a6f")
    	 .then()
    	 .statusCode(200)
    	 .body("uid",equalTo("063e946057a62f75d26e16f3"), "fullName",equalTo("Eyob Bizuneh, M.D."),"email",equalTo("ebizuneh@healthgorilla.com"))
    	 .log().all();
    
    }
}
