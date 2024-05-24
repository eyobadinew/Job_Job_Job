package Allergies;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class POST {
    
	@Test
	void getUser() {
    	given()
    	
    	 .when()
    	 .get("https://reqres.in/api/users?page=2")
    	 .then()
    	 .statusCode(200)
    	 .body("page",equalTo(2))
    	 .log().all();
    
    }
}
