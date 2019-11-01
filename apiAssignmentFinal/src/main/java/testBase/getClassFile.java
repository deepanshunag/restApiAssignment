package testBase;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class getClassFile extends testBaseFile{

	public void getReq() throws InterruptedException{
		//logger.info("check log4j");
		initializeHeaders();
	}
	@Test
	void getFirst() {
		response = httpRequest.request(Method.GET, "/lists" );
		final int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
}
