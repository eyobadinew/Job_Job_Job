package Allergies;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

public class UpdateAllergies {

	@Test
	void Update() {
    	
		
		
		
		HashMap data = new HashMap();
		data.put("clinicalStatus","Inactive");
		
		given()
		.auth().oauth2("2fec3010a0c51130ec020627836922fb")
	    .contentType("application/json")
	    .body(data)
    	
   	 .when()
   	 .put("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance/07ce9c64b676271c986c1153")
   	 .then()
   	 .statusCode(200)
    	
   // 	 .body("page",equalTo(2))
    	 .log().all();
	
}}
