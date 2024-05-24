package OauthToken;

import io.restassured.response.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
@Test
public class generateJWTToken {

    private static final Log log = LogFactory.getLog(generateJWTToken.class);

    @Test
    public void testOAuthWithAuthorizationCode() throws JSONException {
   
        String BASE_URI= "https://api.qa.healthgorilla.com";
		Response response =
         given()

.contentType("application/x-www-form-urlencoded")
.formParam("grant_type","urn:ietf:params:oauth:grant-type:jwt-bearer")                                                 
.formParam("client_id","Wtb6V2Cv6GmMCfeW7cAqQWQYbRFPFBaX5n86dJSb")
.formParam("response_type","JwtToken")
.formParam("assertion", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL3d3dy5xYS5oZWFsdGhnb3JpbGxhLmNvbSIsImF1ZCI6Imh0dHBzOi8vd3d3LnFhLmhlYWx0aGdvcmlsbGEuY29tL29hdXRoL3Rva2VuIiwic3ViIjoiZXlvYl9iaXp1bmVoIiwiaWF0IjoxNjg3OTc1NzcyLCJleHAiOjE4OTk5OTc3NzksImFsZyI6IkhTMjU2In0.YXp4aDSOwaYpjGSuOwV7f6e1ZYJgd5nHTP_pa-LgedI")

        .when()
 .post(BASE_URI+"/oauth/token");

 JSONObject jsonObject = new JSONObject(response.getBody().asString());
String accessToken = jsonObject.get("access_token").toString();
String tokenType = jsonObject.get("token_type").toString();
log.info("Oauth Token with type " + tokenType + "   " + accessToken);
      
    }}