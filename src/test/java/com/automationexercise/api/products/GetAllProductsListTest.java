package com.automationexercise.api.products;

import static org.hamcrest.Matchers.notNullValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

public class GetAllProductsListTest {

    /** API 1: Get All Products List */
    @Test
    @DisplayName("Get All Products List")
    void getAllProductsList() {
        RestAssured.baseURI = "http://www.automationexercise.com/";

        given().accept(ContentType.JSON).when().get("/api/productsList").then().statusCode(200).body("products",
                notNullValue());
    }

}
