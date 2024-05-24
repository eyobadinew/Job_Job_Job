package Allergies;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class CreateAllergy {
	@Test
	void createAllergy() throws FileNotFoundException {
		
		
		File f = new File(".\\Allergy.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		
		JSONObject data = new JSONObject(jt);
		
		given()
		 .auth().oauth2("2fec3010a0c51130ec020627836922fb")
		 .contentType("application/json")
		 .body(data.toString())
		
    	
    	 .when()
    	 .post("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance")
    	 .then()
         .statusCode(201)
    //	 .body("type",equalTo("allergy"))
    	 .log().all();
	}

}
