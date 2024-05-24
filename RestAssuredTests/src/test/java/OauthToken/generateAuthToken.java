package OauthToken;

import static io.restassured.RestAssured.given;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class generateAuthToken {

	 private static final Log log = LogFactory.getLog(generateJWTToken.class);

	    @Test
	    public void testOAuthWithAuthorizationCode() throws JSONException {
	   
	        String BASE_URI= "https://api.qa.healthgorilla.com";
			Response response =
	         given()

	.contentType("application/x-www-form-urlencoded")
	.formParam("grant_type","authorization_code")
	.formParam("code","1a0a5069792a98282930111f04a165e6")
	.formParam("client_id","Wtb6V2Cv6GmMCfeW7cAqQWQYbRFPFBaX5n86dJSb")
	.formParam("client_secret","Iq/Ppy+z14H+LgThhZMYMhnG20u7NeGHWL315NVueSQ=")
	.formParam("redirect_uri","https://www.qa.healthgorilla.com/authcallback")

	        .when()
	 .post(BASE_URI+"/oauth/token");

	 JSONObject jsonObject = new JSONObject(response.getBody().asString());
	String accessToken = jsonObject.get("access_token").toString();
	String tokenType = jsonObject.get("token_type").toString();
	log.info("Oauth Token with type " + tokenType + "   " + accessToken);
	      
	    }}