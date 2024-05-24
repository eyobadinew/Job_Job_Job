package Allergies;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class getAllergiesByID {
    
	@Test
	void getUser() {
    	given()
    	.auth().oauth2("2fec3010a0c51130ec020627836922fb")
    	
    	 .when()
    	 .get("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance/6dc9a660d35c10eeb0973c32")
    	 .then()
    	 .statusCode(200)
    	 .body("type",equalTo("allergy"))
    	 .log().all();
    
    }
}
