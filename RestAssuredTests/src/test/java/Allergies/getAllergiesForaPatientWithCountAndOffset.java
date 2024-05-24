package Allergies;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class getAllergiesForaPatientWithCountAndOffset {
	@Test
	void getUser() {
    	
		given()
    	.auth().oauth2("2fec3010a0c51130ec020627836922fb")
    	
    	 .when()
    	 .get("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance?patient=3daa95605e79d6de2cf2a7de&_count=2&_offset=0")
    	 .then()
    	 .statusCode(200)
    	 .body("resourceType",equalTo("Bundle"))
    	 .log().all();
    
    }
}