package Allergies;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class deleteAllergy {
	
	@Test
	void getUser() {
    	given()
    	.auth().oauth2("2fec3010a0c51130ec020627836922fb")
    	
    	 .when()
    	 .delete("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance/bfd49c64cc42b739bf4d249d")
    	 .then()
    	 .statusCode(204)
    	// .body("type",equalTo("allergy"))
    	 .log().all();
    
    }
}

	

