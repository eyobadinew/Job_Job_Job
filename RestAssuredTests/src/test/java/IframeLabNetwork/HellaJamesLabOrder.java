package IframeLabNetwork;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

public class HellaJamesLabOrder {
	@Test
	void createAllergy() throws FileNotFoundException {
		
		
		File f = new File(".\\IframeLabNetwork.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		
		
		JSONObject data = new JSONObject(jt);
		
		given()
		 .auth().oauth2("2fec3010a0c51130ec020627836922fb")
		 .contentType("application/json")
		 .body(data.toString())
		
    	
    	 .when()
    	 .post("https://api.qa.healthgorilla.com/doctor/api")
    	 .then()
         .statusCode(200)
    //	
         // .log().all();
		//.log().body();
		.log().headers();
	}

}