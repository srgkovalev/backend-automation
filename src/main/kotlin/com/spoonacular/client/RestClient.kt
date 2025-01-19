package org.example.com.spoonacular.client

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.restassured.RestAssured
import org.example.com.spoonacular.config.Config
import org.example.com.spoonacular.models.Response

class RestClient{
    fun getResp(): Response {
        val apiKey = Config.get("apiKey")

        val resp = RestAssured.given()
            .header("x-api-key", "$apiKey")
            .baseUri(Config.get("baseUrl"))
            .get(Config.get("recipesComplexSearchEndpoint"))
            .then()
            .statusCode(200)
            .extract().response()

        // Получаем полный JSON
        val jsonResp = resp.asString()

        // Парсим JSON с помощью Jackson
        val mapper = jacksonObjectMapper()
        return mapper.readValue(jsonResp, Response::class.java)
    }
}
