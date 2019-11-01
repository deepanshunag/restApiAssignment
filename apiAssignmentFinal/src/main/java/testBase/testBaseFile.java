package testBase;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class testBaseFile {

		public static RequestSpecification httpRequest;
		public static Response response;
		public String Id = "408972147";
		public Logger logger;
		@BeforeTest
		public void initializeHeaders() {
			RestAssured.baseURI = "https://a.wunderlist.com/api/v1";

			httpRequest = RestAssured.given();
			httpRequest.header("Content-Type", "application/json");
			httpRequest.header("X-Access-Token", "44df450682761c6cb43e2631710b3e90d434fb38a5cb0ea7ddac39e501ab");
			httpRequest.header("X-Client-ID", "be1ffb1bd1fb43ad80f5");
		}
		@BeforeClass
		
		public void setup() {
			logger = Logger.getLogger("WunderListAPI");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);
		}
}