package testBase;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class postCase extends testBaseFile{
	String titleName = "deeps321";
	@BeforeClass
	public void patchRequest() {
		initializeHeaders();
	}
	@Test
    public void testThree() {
		final JSONObject requestParams = new JSONObject();
		requestParams.put("title", titleName);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		final Response response = httpRequest.request(Method.POST, "/lists");
		final int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
    }
}
