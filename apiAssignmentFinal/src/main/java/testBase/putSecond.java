package testBase;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class putSecond extends testBaseFile{
	String titleName = "ugain";
	int enterRevision = 4;
	@BeforeClass
	public void patchRequest() {
		initializeHeaders();
	}
	@Test
	void patchTestTwo() {
		final JSONObject requestParams = new JSONObject();
		requestParams.put("title", titleName);
		requestParams.put("revision", enterRevision);
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		final Response response = httpRequest.request(Method.PUT, "/lists/" + Id);
		final int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
