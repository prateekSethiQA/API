package functionalTests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import testBase.TestBase;

public class GetRequest extends TestBase{
	@Test
	public void getRequest() {
		
		RestAssured.baseURI="https://reqres.in/api/users";

		
		Response response=RestAssured.given().param("page", "2")
		.when()
		.get();
		System.out.println(response.getBody().asString());
		System.out.println("get Status code "+response.getStatusCode());
		System.out.println("get ContentType "+response.getContentType());
		System.out.println("get Time "+response.getTime());
		System.out.println("get Cokies "+response.getCookies());
		System.out.println("get pretty response "+response.prettyPrint());
		
	}

}
