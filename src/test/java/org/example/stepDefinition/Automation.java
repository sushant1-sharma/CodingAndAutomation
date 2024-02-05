package org.example.stepDefinition;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Automation {
    @Test
    public void APIAutomation(){

        String reqbody = "{\n" +
                "    \"name\": \"Learn JAVA Part 2\",\n" +
                "    \"isbn\": \"bcdio\",\n" +
                "    \"aisle\": \"929\",\n" +
                "    \"author\": \"Sushant\"\n" +
                "}";

        Response response = given()
                .baseUri("http://216.10.245.166")
                .auth().basic("sushant123","897sush")
                .auth().oauth2("bhg")
                .when()
                .body(reqbody)
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
                .extract().response();

        Assert.assertEquals(response.jsonPath().get("Msg"),"successfully added");

        String myResponse = given()
                .baseUri("http://216.10.245.166")
                .auth().basic("sushant123", "897sush")
                .auth().oauth2("bhg")
                .when()
                .body(reqbody)
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
                .extract().asString();

        System.out.println(myResponse);


    }
}
