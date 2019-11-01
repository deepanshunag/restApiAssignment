package baseClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class baseClassFile {
	
	String filePath = "C:\\Users\\deepanshusharma\\Documents\\New folder (2)\\apiAssignmentFinal\\dataHeader";
	public ArrayList<String> listHeader() {
		List list = new ArrayList();
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		    while ((lineText = lineReader.readLine()) != null) {
		    	list.add(lineText);
		    }
		    lineReader.close();
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		return (ArrayList<String>) list;
	}
	
}
