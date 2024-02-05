package org.example.stepDefinition;

import io.cucumber.java.sl.Ter;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class BookAPI {

    private final RequestSpecification reqSpec = new RequestSpecBuilder()
            .setBaseUri("http://216.10.245.166")
            .setContentType("application/json")
            .build();

    public static int ID = new Random().nextInt(1000)+1;

    @Test
    public void bookAPI() {
        SoftAssert softAssert = new SoftAssert();

        String reqBody = "{\n" +
                "    \"name\": \"Basic Programming\",\n" +
                "    \"isbn\": \"bcdio\",\n" +
                "    \"aisle\":" + ID + ", \n" +
                "    \"author\": \"Jack\"\n" +
                "}";

        Response response = given()
                .spec(reqSpec)
                .when()
                .body(reqBody)
                .log().all()
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();

        softAssert.assertEquals(response.jsonPath().get("Msg"), "successfully added");

         String myresponse = given()
                .spec(reqSpec)
                .when()
                .body(reqBody)
                .log().all()
                .post("/Library/Addbook.php")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        System.out.println(myresponse);

    }
}
