package Consent;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateConsent {
	
	
	@Test
	void createConsent() throws FileNotFoundException {
		
		
		File f = new File(".\\Consent.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		
		JSONObject data = new JSONObject(jt);
		
		 given()
		 .auth().oauth2("a4598cb7df10072e6e0eca8dccdccf57")
		 .contentType("application/json")
		 .body(data.toString())
		
    	
    	 .when()
    	 .post("https://api.qa.healthgorilla.com/fhir/R4/Consent")
		 
	
    	 .then()
     .statusCode(201)
    
 	 .log().all();
//    .log().headers();
	}

	
}
