package com.automationexercise.api.products;

import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class PostToAllProductsListTest {
    /** API 2: POST To All Products List - negative test */
    @Test
    @DisplayName("POST To All Products List - negative test")
    void postToAllProductsListNegativTest() {
        RestAssured.baseURI = "http://www.automationexercise.com/";

        given().accept(ContentType.JSON).when().post("/api/productsList").then().statusCode(200).body("message",
                equalTo("This request method is not supported."));

        given()
                .accept(ContentType.JSON)
                .when()
                .post("/api/productsList")
                .then()
                .log().all();
    }
}
