package org.example.stepDefinition;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class DummyAPIs {
    String str = "abc";
    private final RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri("https://jsonplaceholder.typicode.com/+"+str)
            .setContentType(ContentType.JSON)
            .build();

    @Test
    public void getExample() {
        given()
                .spec(requestSpec)
                .headers("Authorization" , "")
                .when()
                .log().all()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("id", equalTo(1))
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
    }

    @Test
    public void postExample() {
        String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";

        given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .log().all()
                .post("/posts")
                .then()
                .statusCode(201);
    }

    @Test
    public void deleteExample() {
        given()
                .spec(requestSpec)
                .when()
                .log().all()
                .delete("/posts/1")
                .then()
                .statusCode(200);
    }

    @Test
    public void putExample() {
        String requestBody = "{\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": 1\n" +
                "}";

        given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .log().all()
                .put("/posts/1")
                .then()
                .statusCode(200);
    }


}
