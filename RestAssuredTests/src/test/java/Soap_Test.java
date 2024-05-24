
import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.commons.io.IOUtils;
import org.testing.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.util.IOUtils;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Soap_Test {

	  
	public void postMethod() throws Exception {
		FileInputStream  fileinputstream = new FileInputStream("");
		RestAssured.baseURI = "";
		
		Response response
		 given()
		.header()
		.and()
		.body(IOUtils.toString(fileinputstream,"UTF-8"))
		.when()
		.post()
		then()
		statuscode(200)
		.and()
		.log().all().extract().response();
	}

}
