package testBase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class getSecond extends testBaseFile{

	@BeforeTest
	public void getRequest() {
		initializeHeaders();
	}
	@Test
	void getSecond() {
		final Response response = httpRequest.request(Method.GET, "/lists" );
		final int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
}
