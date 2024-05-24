package Allergies;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Update2 {

	@Test
	void createAllergy() throws FileNotFoundException {
		
		
		File f = new File(".\\AllergyUpdate.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		
		JSONObject data = new JSONObject(jt);
		
		given()
		 .auth().oauth2("2fec3010a0c51130ec020627836922fb")
		 .contentType("application/json")
		 .body(data.toString())
	//		.multiPart ("file2", new File (".\\AllergyUpdate.json")).
            .when ()
			.put ("https://api.qa.healthgorilla.com/fhir/R4/AllergyIntolerance/cc37a3642d7d67f3466e4df6")
			.then()
			 .statusCode(200)
		    	
			   // 	 .body("page",equalTo(2))
			    	 .log().all();}}
