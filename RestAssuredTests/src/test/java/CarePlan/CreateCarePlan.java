package CarePlan;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateCarePlan {
	
	
	@Test
	void createCarePlan() throws FileNotFoundException {
		
		
		File f = new File(".\\CarePlan.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		
		JSONObject data = new JSONObject(jt);
		
		 given()
		 .auth().oauth2("2fec3010a0c51130ec020627836922fb")
		 .contentType("application/json")
		 .body(data.toString())
		
    	
    	 .when()
    	 .post("https://api.qa.healthgorilla.com/fhir/R4/CarePlan")
		
    	 .then()
      .statusCode(201)
    
  // 	 .log().all();
      .log().headers();
	}
	
}
