package testBase;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.http.Method;
import io.restassured.response.Response;

public class deleteCase extends testBaseFile{
	int updateRevision = 1;

	@BeforeClass
	public void initializeHeaders() {
		initializeHeaders();
	}
	@Test
	void deleteList() {
		final JSONObject requestParams = new JSONObject();
		httpRequest.body(requestParams.toString());
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		final Response response = httpRequest.request(Method.DELETE, "/lists/{" + Id+"}");
		final int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 204);
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test2 = extent.createTest("TestDelete","checking the first case for delete");
		test2.log(Status.INFO, "Test Two for api delete function");
		test2.log(Status.PASS, "delete task performed successfully");
	}
}
