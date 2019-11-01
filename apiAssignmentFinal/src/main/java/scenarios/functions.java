package scenarios;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeTest;

import baseClass.baseClassFile;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class functions{
	RequestSpecification httpRequest = RestAssured.given();
	@BeforeTest
    public void startTest() {  
		baseClassFile b = new baseClassFile();
		List list2 = new ArrayList();
		list2 = b.listHeader();
        httpRequest.header("list2.get(0)", "application/json");
        httpRequest.header("X-Access-Token", "44df450682761c6cb43e2631710b3e90d434fb38a5cb0ea7ddac39e501ab");
        httpRequest.header("X-Client-ID", "be1ffb1bd1fb43ad80f5");
    }
}
